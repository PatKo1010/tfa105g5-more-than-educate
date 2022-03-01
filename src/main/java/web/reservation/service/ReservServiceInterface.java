package web.reservation.service;

import java.util.List;

import web.reservation.entity.ReservTimeBean;

public interface ReservServiceInterface {
	public abstract List<ReservTimeBean> selectMemberCourse (ReservTimeBean bean);
	
	public abstract ReservTimeBean updateOneReserv(ReservTimeBean bean);
	
}
