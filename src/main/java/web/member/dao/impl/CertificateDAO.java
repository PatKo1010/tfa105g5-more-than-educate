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
import web.member.dao.CertificateDAOInterface;
import web.member.entity.CertificateBean;

@Repository
public class CertificateDAO implements CertificateDAOInterface {
	//i.先建環境
//	private SessionFactory sessionFactory;
//	public CertificateDAO(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
	
//	public Session getSession() {
//		return sessionFactory.getCurrentSession();
//	}

	@PersistenceContext
	private Session session;
	public Session getSession() {
		return session;
	}
	
	//ii.實作各方法
	@Override
	public CertificateBean insert(CertificateBean certificateBean) {
//certificateDAO.insert(certificateBean);錯誤示範
//getSession().save(certificateBean);
		if (certificateBean != null && certificateBean.getCertid() != null) {
			if ( getSession().get( CertificateBean.class, certificateBean.getCertid() ) == null ) {
				getSession().save(certificateBean);
				return certificateBean;
			}
		}
		return null;
	}

	@Override
	public boolean delete(Integer certid) {
// getSession().delete(certid);
		if (certid != null) {
			CertificateBean tempObject = getSession().get(CertificateBean.class, certid);
			if ( tempObject != null ) {
				getSession().delete(tempObject);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public CertificateBean update(Integer certid, Integer teaid, byte[] certphoto) {
//getSession().get(...) 和 getSession().save(...);
		if (certid != null) { //檢查輸入
			CertificateBean tempObject = getSession().get(CertificateBean.class, certid); //先取
			if (tempObject != null) {
				tempObject.setCertid(certid);//再存
				tempObject.setTeaid(teaid);
				tempObject.setCertphoto(certphoto);
				return tempObject;
			}
		}
		return null;
	}

	@Override
	public CertificateBean select(Integer certid) {
//getSession().get( CertificateBean.class, certid);
		if (certid != null) {
			return getSession().get( CertificateBean.class, certid);
		}
		return null;
	}

	@Override
	public List<CertificateBean> select() {
//getSession().creatQuery("FROM CertificateBean", CertificateBean.class).list();
		return	getSession().createQuery("FROM CertificateBean", CertificateBean.class).list();
	}
	
	//測試
	public static void main(String[] args) {
		//引進spring環境
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		//context取bean
		CertificateDAO certificateDAO = context.getBean("certificateDAO", CertificateDAO.class);
		
		System.out.println(certificateDAO.select());
		
		//關
		((ConfigurableApplicationContext)context ).close();
		
		
		
	}
	
}
