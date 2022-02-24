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
		if ( orderID!= null) {
			List<ReservTimeBean> beans = this.session.createQuery("from ReservTimeBean where orderID=:X",ReservTimeBean.class)
			.setParameter("X", orderID).list();
			return beans;
		}
		return null;
	}
	

	@Override
	public Integer insert(ReservTimeBean bean) {
		if (bean != null) {
			return (Integer)this.getSession().save(bean);
		}
		return null;
	}

	@Override
	public ReservTimeBean update(ReservTimeBean bean) {
		if (bean != null && bean.getReservID()!= null) {
			ReservTimeBean updateBean =  this.getSession().get(ReservTimeBean.class,bean.getReservID());
			if (updateBean != null) {
				updateBean.setOrderID(bean.getOrderID());
				updateBean.setReservDateStart(bean.getReservDateStart());
				updateBean.setReservDateEnd(bean.getReservDateEnd());
				updateBean.setIsReserved(bean.getIsReserved());
				return (ReservTimeBean)this.getSession().merge(updateBean);
			}
			
		}
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
