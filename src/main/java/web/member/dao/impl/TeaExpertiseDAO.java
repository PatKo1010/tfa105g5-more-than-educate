package web.member.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import web.member.dao.TeaExpertiseDAOInterface;
import web.member.entity.TeaExpertiseBean;


public class TeaExpertiseDAO implements TeaExpertiseDAOInterface {

	private SessionFactory sessionFactory;
	public TeaExpertiseDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	//1.新增
	@Override
	public TeaExpertiseBean insert(TeaExpertiseBean teaExpertiseBean) {
//getSession().save(teaExpertiseBean);
		if (teaExpertiseBean != null && teaExpertiseBean.getExpertiseid() != null) {
			if (getSession().get(TeaExpertiseBean.class, teaExpertiseBean.getTeaexpertiseid()) == null) {
				getSession().save(teaExpertiseBean);
				return teaExpertiseBean;
			}
		}
		return null;
	}

	//2.刪除
	@Override
	public boolean delete(Integer teaexpertiseid) {
//getSession().delete(Integer teaexpertiseid);
		if ( teaexpertiseid!= null) {
			TeaExpertiseBean tempObject = getSession().get(TeaExpertiseBean.class, teaexpertiseid);
			if ( tempObject != null ) {
				getSession().delete( tempObject );
				return true;
			}
		}
		return false;
	}

	//3.修改
	@Override
	public TeaExpertiseBean update(TeaExpertiseBean teaExpertiseBean) {
//getSession().update(teaExpertiseBean);
		if (teaExpertiseBean != null && teaExpertiseBean.getTeaexpertiseid() != null) {
			TeaExpertiseBean tempObject = getSession().get(TeaExpertiseBean.class, teaExpertiseBean.getTeaexpertiseid());
			if ( tempObject != null ) {
				getSession().merge(teaExpertiseBean);
				return teaExpertiseBean;
			}
		}
		return null;
	}

	//4a.查詢(單)
	@Override
	public TeaExpertiseBean select(Integer teaexpertiseid) {
//getSession().get(TeaExpertiseBean.class, teaexpertiseid);
		if (teaexpertiseid != null) {
			return getSession().get(TeaExpertiseBean.class, teaexpertiseid);
		}
		return null;
	}

	//4b.查詢(多)
	@Override
	public List<TeaExpertiseBean> select() {
		return getSession().createQuery("FROM TeaExpertiseBean", TeaExpertiseBean.class).list();
	}

}
