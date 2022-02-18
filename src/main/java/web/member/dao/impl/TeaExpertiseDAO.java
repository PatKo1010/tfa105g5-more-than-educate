package web.member.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
import web.member.dao.TeaExpertiseDAOInterface;
import web.member.entity.TeaExpertiseBean;

@Repository
public class TeaExpertiseDAO implements TeaExpertiseDAOInterface {
//Hibernate
//	private SessionFactory sessionFactory;
//	public TeaExpertiseDAO(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
//	
//	public Session getSession() {
//		return sessionFactory.getCurrentSession();
//	}
	
//Spring
	@PersistenceContext
	private Session session;
	public Session getSession() {
		return this.session;
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
	
//	//測試
//	public static void main(String[] args) {
//		//建spring環境
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
//		
//		//spring取bean
//		TeaExpertiseDAO teaExpertiseDAO = context.getBean("teaExpertiseDAO", TeaExpertiseDAO.class);
//		
//		teaExpertiseDAO.select();
//		
//		//關Spring
//		((ConfigurableApplicationContext)context ).close();
//	}

}
