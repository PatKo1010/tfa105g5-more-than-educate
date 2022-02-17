package web.orderDetail.dao;

import java.util.List;

import web.orderDetail.entity.OrderDetailEntity;

public interface OrderDetailDaoInterface {
	public abstract OrderDetailEntity select(String title);
	public abstract List<OrderDetailEntity> selectAll ();
}
