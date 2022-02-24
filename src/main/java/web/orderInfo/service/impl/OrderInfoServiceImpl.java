package web.orderInfo.service.impl;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import configuration.SpringJavaConfig;
import web.orderInfo.dao.CourseDaoInterface;
import web.orderInfo.dao.OrderInfoDaoInterface;
import web.orderInfo.entity.CourseEntity;
import web.orderInfo.entity.OrderInfoEntity;
import web.orderInfo.service.OrderInfoServiceInterface;
import web.reservation.dao.ReservDaoInterface;
import web.reservation.entity.ReservTimeBean;

@Service
@Transactional
public class OrderInfoServiceImpl implements OrderInfoServiceInterface {
	@Autowired
	private OrderInfoDaoInterface orderInfoDao;
	
	@Qualifier("courseDaoImplTwo")
	@Autowired 
	private	CourseDaoInterface courseDao;	
	@Autowired
	private ReservDaoInterface reservDao;

	@Override
	public List<ReservTimeBean> insertOrderReserved(OrderInfoEntity orderInfoEntity) {
		if (orderInfoEntity != null) {
			Integer orderId = orderInfoDao.insert(orderInfoEntity);
			Integer courseId = orderInfoEntity.getCourseId();
			Date orderDate = orderInfoEntity.getOrderDate();
			
			CourseEntity courseEntity = courseDao.select(courseId);
			if (courseEntity != null) {
				Integer classAmount = courseEntity.getClassamount();
				for (int i = 0; i<classAmount; i++) {
					ReservTimeBean reservBean = new ReservTimeBean();
					reservBean.setOrderID(orderId);
					reservBean.setReservDateStart(orderDate);
					reservBean.setReservDateEnd(orderDate);
					reservDao.insert(reservBean);
				}
				return reservDao.selectByOrderID(orderId);
			}		
		}
		return null;
			
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		
		OrderInfoServiceInterface service = 
				context.getBean("orderInfoServiceImpl", OrderInfoServiceInterface.class);
		
		OrderInfoEntity orderInfoEntity = new OrderInfoEntity();
		orderInfoEntity.setMemId(10);
		orderInfoEntity.setCourseId(4);
		System.out.println(service.insertOrderReserved(orderInfoEntity));
		
		
		
		((ConfigurableApplicationContext)context).close();
	}
	
	

}
