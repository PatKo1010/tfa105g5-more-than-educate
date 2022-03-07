package web.orderInfo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public Map<Integer, java.util.Date> insertOrderReserved(Integer courseId, Integer memId) {
		Map<Integer, java.util.Date> result = new HashMap<>();
		OrderInfoEntity orderInfoEntity = new OrderInfoEntity();
		orderInfoEntity.setMemId(memId);
		orderInfoEntity.setCourseId(courseId);
		if (orderInfoEntity != null) {
			Integer orderId = orderInfoDao.insert(orderInfoEntity);
			CourseEntity courseEntity = courseDao.select(courseId);
			if (courseEntity != null) {
				Integer classAmount = courseEntity.getClassamount();
				for (int i = 0; i<classAmount; i++) {
					ReservTimeBean reservBean = new ReservTimeBean();
					reservBean.setOrderID(orderId);
					reservDao.insert(reservBean);
				}
				result.put(orderId, orderInfoDao.getInfoDate(orderId));
				return result;
			}		
		}
		return null;	
	}
	

}
