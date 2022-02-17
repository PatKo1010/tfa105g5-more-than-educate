package web.member.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import web.member.dao.CertificateDAOInterface;
import web.member.entity.CertificateBean;

public class CertificateDAO implements CertificateDAOInterface {
	//i.先建環境
	private SessionFactory sessionFactory;
	public CertificateDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
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
	
}
