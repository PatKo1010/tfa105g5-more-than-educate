package web.reservDetail.service;

import java.util.List;

import web.member.entity.MemberBean;
import web.reservDetail.entity.ReservDetailWithRank;


public interface ReservDetailServiceInterface {
	
	List<ReservDetailWithRank> getTeacherReservedTime(MemberBean bean);
	
}
