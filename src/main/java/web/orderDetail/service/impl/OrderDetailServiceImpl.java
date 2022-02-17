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
	public OrderDetailEntity select(OrderDetailEntity entity) {
		return orderDetailDao.select(entity.getCourseTitle());
	}

	@Override
	public List<OrderDetailEntity> selectAll() {
		return orderDetailDao.selectAll();
	}
}
