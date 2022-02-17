package web.orderDetail.service;

import java.util.List;

import web.orderDetail.entity.OrderDetailEntity;

public interface OrderDetailServiceInterface {
	OrderDetailEntity select (OrderDetailEntity courseTitle);
	List<OrderDetailEntity> selectAll ();
}
