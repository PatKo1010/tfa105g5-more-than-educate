package web.reservation.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.reservation.dao.ReservDaoInterface;
import web.reservation.entity.ReservTimeBean;
import web.reservation.service.ReservServiceInterface;

@Service
@Transactional
public class ReservServiceImpl implements ReservServiceInterface {
	
	@Autowired
	private ReservDaoInterface dao;

	@Override
	public List<ReservTimeBean> selectMemberCourse(ReservTimeBean bean) {
		if (bean != null && bean.getOrderID()!= null) {
			return dao.selectByOrderID(bean.getOrderID());
		}
		return null;
	}

	@Override
	public ReservTimeBean updateOneReserv(ReservTimeBean bean) {
		ReservTimeBean updateBean = dao.update(bean);
		return updateBean;
	}
	
	
	
	
	

	
}
