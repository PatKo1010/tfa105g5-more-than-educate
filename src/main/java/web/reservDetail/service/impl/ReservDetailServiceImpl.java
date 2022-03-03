package web.reservDetail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.member.entity.MemberBean;
import web.reservDetail.dao.ReservDetailDaoInterface;
import web.reservDetail.entity.ReservDetailWithRank;
import web.reservDetail.service.ReservDetailServiceInterface;

@Service
@Transactional
public class ReservDetailServiceImpl implements ReservDetailServiceInterface {
	@Autowired
	ReservDetailDaoInterface reservDetailDao;

	@Override
	public List<ReservDetailWithRank> getTeacherReservedTime(MemberBean bean) {
		if (bean != null ) {
			return reservDetailDao.selectReservDetailByTId(bean.getMemid());
		}
		
		return null;
	}



}
