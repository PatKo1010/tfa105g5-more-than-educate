package web.orderInfo.service;

import java.util.List;

import web.orderInfo.entity.OrderInfoEntity;
import web.reservation.entity.ReservTimeBean;

public interface OrderInfoServiceInterface {
	List<ReservTimeBean> insertOrderReserved(OrderInfoEntity orderInfoEntity);
}
