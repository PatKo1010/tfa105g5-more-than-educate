package web.orderInfo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.course.entity.CourseBean;
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
	public Map<String, Object> insertOrderReserved(Integer courseId, Integer memId) {
		
		
		Map<String, Object> result = new HashMap<>();
		OrderInfoEntity orderInfoEntity = new OrderInfoEntity();
		orderInfoEntity.setMemId(memId);
		orderInfoEntity.setCourseId(courseId);
		if (orderInfoEntity != null) {
			Integer orderId = orderInfoDao.insert(orderInfoEntity);
			CourseEntity courseEntity = courseDao.select(courseId);
			if (courseEntity != null) {
				String courseTitle = courseEntity.getCoursetitle(); 
				Integer classAmount = courseEntity.getClassamount();
				Integer totalPrice = courseEntity.getPrice();			
				for (int i = 0; i<classAmount; i++) {
					ReservTimeBean reservBean = new ReservTimeBean();
					reservBean.setOrderID(orderId);
					reservDao.insert(reservBean);
				}
				result.put("orderId", orderId);
				result.put("orderDate", orderInfoDao.getInfoDate(orderId));
				result.put("orderPrice", totalPrice);
				result.put("orderTitle", courseTitle);
				return result;
			}		
		}
		return null;	
	}

	@Override
	public List<OrderInfoEntity> selectOrderByCourseId(CourseBean bean) {
		if (bean != null) {
			return orderInfoDao.selectByCourseId(bean.getCourseid());
		}
		return null;
	}
	

}
