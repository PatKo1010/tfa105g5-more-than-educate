package web.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.member.dao.impl.CertificateDAO;
import web.member.entity.CertificateBean;

@Service
@Transactional
public class CertificateService {

//先接(包)環境
	@Autowired
	private CertificateDAO certificateDAO;
	public CertificateService(CertificateDAO certificateDAO) {
		this.certificateDAO = certificateDAO;
	}

	
//附加各方法
	//1.新增
	public CertificateBean insert(CertificateBean certificateBean) {
		if (certificateBean != null && certificateBean.getCertid() != null) {
			return certificateDAO.insert(certificateBean);
		}
		return null;  
	}
	
	//2.刪除
	public boolean delete(CertificateBean certificateBean) {
		if (certificateBean != null && certificateBean.getCertid() != null) {
			return certificateDAO.delete(certificateBean.getCertid());
		}
		return false;
	}
	
	//3.修改
	public CertificateBean update(CertificateBean certificateBean) {
		if (certificateBean != null && certificateBean.getCertid() != null) {
			return certificateDAO.update(certificateBean.getCertid(), certificateBean.getTeaid(), certificateBean.getCertphoto() );
		}
		return null;
	}
	
	//4a.查詢(單)
	public CertificateBean select(CertificateBean certificateBean) {
		if (certificateBean != null && certificateBean.getCertid() != null) {
			return certificateDAO.select(certificateBean.getCertid());
		}
		return null; 
	}
	
	//4b.查詢(多)
	public List<CertificateBean> select() {
		return certificateDAO.select();
	}

	
//測試	
//	public static void main(String[] args) {
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//
////		CertificateService certificateService = new CertificateService ( new CertificateDAO(sessionFactory) );
//		
////		//1.新增  OK
////		CertificateBean certificateBean = new CertificateBean();
////		certificateBean.setCertid(1);
////		certificateBean.setTeaid(1);
////		certificateBean.setCertphoto("12345".getBytes());
////		System.out.println( certificateService.insert(certificateBean) );
//		
////		//2.刪除  OK
////		CertificateBean certificateBean2 = new CertificateBean();
////		certificateBean2.setCertid(1);
////		System.out.println( certificateService.delete(certificateBean2) );
//		
////		//3.修改  OK   (小心FK "teaid"要存在)
////		CertificateBean certificateBean3 = new CertificateBean();
////		certificateBean3.setCertid(1);
////		certificateBean3.setTeaid(1);
////		certificateBean3.setCertphoto("67890".getBytes());
////		System.out.println( certificateService.update(certificateBean3) );
//		
////		//4a.查詢(單) OK
////		CertificateBean certificateBean4 = new CertificateBean();
////		certificateBean4.setCertid(1);
////		System.out.println( certificateService.select(certificateBean4) );
//
//		//4b.查詢(多)  OK
////		System.out.println( certificateService.select() );
//		
//		
//		transaction.commit();
//		session.close();
//		sessionFactory.close();
//	}

}
