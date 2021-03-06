package web.reservation.dao;

import java.util.List;

import web.reservation.entity.ReservTimeBean;

public interface ReservDaoInterface {
	public abstract ReservTimeBean select(Integer id);
	
	public abstract List<ReservTimeBean> selectByOrderID (Integer orderID);

	public abstract Integer insert(ReservTimeBean bean);

	public abstract ReservTimeBean update(ReservTimeBean bean);

	public abstract boolean delete(Integer id);
}
