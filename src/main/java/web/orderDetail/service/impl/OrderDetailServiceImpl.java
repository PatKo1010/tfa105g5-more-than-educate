package web.orderDetail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.orderDetail.dao.OrderDetailDaoInterface;
import web.orderDetail.entity.OrderDetailEntity;
import web.orderDetail.service.OrderDetailServiceInterface;

@Service
public class OrderDetailServiceImpl implements OrderDetailServiceInterface {
	@Autowired
	private OrderDetailDaoInterface orderDetailDao;
	
	@Override
	public List<OrderDetailEntity> listStudentCourses(OrderDetailEntity orderDetailEntity) {
		if (orderDetailEntity != null && orderDetailEntity.getStudentId() != null) {
			return orderDetailDao.selectByStudentId(orderDetailEntity.getStudentId());
		}
		return null;
	}

	@Override
	public List<OrderDetailEntity> selectAll() {
		return orderDetailDao.selectAll();
	}
}
