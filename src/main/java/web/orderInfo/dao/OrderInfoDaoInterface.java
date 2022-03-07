package web.orderInfo.dao;

import java.util.List;

import web.orderInfo.entity.OrderInfoEntity;

public interface OrderInfoDaoInterface {
	OrderInfoEntity selectByPrimaryKey(Integer id);
	List<OrderInfoEntity> selectAll();
	Integer insert(OrderInfoEntity orderEntity);
	OrderInfoEntity update(OrderInfoEntity orderEntity);
	Boolean delete(Integer id);
	java.util.Date getInfoDate(Integer orderId);
}
