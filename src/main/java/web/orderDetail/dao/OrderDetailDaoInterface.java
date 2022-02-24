package web.orderDetail.dao;

import java.util.List;

import web.orderDetail.entity.OrderDetailEntity;

public interface OrderDetailDaoInterface {
	public abstract List<OrderDetailEntity> selectByStudentId(Integer Id);
	public abstract List<OrderDetailEntity> selectAll ();
}
