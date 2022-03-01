package web.reservDetail.dao;

import java.util.List;

import web.member.entity.MemberBean;
import web.reservDetail.entity.ReservDetailBean;
import web.reservDetail.entity.ReservDetailWithRank;

public interface ReservDetailDaoInterface {
	List<ReservDetailWithRank> selectReservDetailByTId(Integer memId);

}
