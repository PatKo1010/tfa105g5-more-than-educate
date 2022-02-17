package web.reservation.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import web.reservation.dao.ReservDaoInterface;
import web.reservation.entity.ReservTimeBean;

@Repository
public class ReservDaoImpl implements ReservDaoInterface{
	
	@PersistenceContext
	private Session session;
	public Session getSession() {
		return this.session;
	}
	

	@Override
	public ReservTimeBean select(Integer id) {
		return this.getSession().get(ReservTimeBean.class, id);
	}

	@Override
	public List<ReservTimeBean> selectByOrderID(Integer orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservTimeBean> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReservTimeBean insert(ReservTimeBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReservTimeBean update(ReservTimeBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
