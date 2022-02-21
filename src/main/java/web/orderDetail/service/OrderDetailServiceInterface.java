package web.orderDetail.service;

import java.util.List;

import web.orderDetail.entity.OrderDetailEntity;

public interface OrderDetailServiceInterface {
	List<OrderDetailEntity> listStudentCourses (OrderDetailEntity orderDetailEntity);
	List<OrderDetailEntity> selectAll ();
}
