package web.admin.dao.impl;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import web.admin.dao.AdminDaoInterface;
import web.admin.entity.AdminBean;
@Repository
public class AdminDaoImpl implements AdminDaoInterface {
	@PersistenceContext
	private Session session;
	public Session getSession() {
		return this.session;
	}

	@Override
	public AdminBean login(AdminBean bean) {
		
		if(bean.getAdminEmail()!=null&&bean.getAdminPassword()!=null) {
			String hql = "FROM AdminBean as a WHERE a.adminEmail = ?0 AND a.adminPassword = ?1";
			Query<AdminBean> query =this.getSession().createQuery(hql, AdminBean.class);
			query.setParameter(0, bean.getAdminEmail());
			query.setParameter(1, bean.getAdminPassword());
			return query.list().get(0);
		}
		
		return null;
	}
	
	
	
	
	
	
	
	
	@Override
	public AdminBean insert(AdminBean bean) {
		if(bean.getAdminEmail()!=null&&bean.getAdminPassword()!=null) {
			this.getSession().save(bean);
		}
		
		return bean;
	}

	

}
