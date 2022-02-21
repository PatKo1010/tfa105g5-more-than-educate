package web.education.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.education.dao.impl.EducationDAO;
import web.education.entity.EducationBean;

@Service
@Transactional
public class EducationService {
//接收三行  DAO方法擴充  測試
	
	@Autowired
	//接收三行
	private EducationDAO educationDAO;
	public EducationService(EducationDAO educationDAO) {
		this.educationDAO = educationDAO;
	}
	
	//DAO方法擴充
	//1.新增
	public EducationBean insert(EducationBean educationBean) {
//動作行:educationDAO.insert(educationBean);
		if (educationBean != null && educationBean.getEduid() != null) {
			EducationBean insertResult = educationDAO.insert(educationBean);
			return insertResult;
		}
		return null;
	}
	
	//2.刪除
	public boolean delete(EducationBean educationBean) {
//動作行:educationDAO.delete(educationBean.getEduid());
		if (educationBean != null && educationBean.getEduid() != null) {
			return educationDAO.delete(educationBean.getEduid());
		}
		return false;
	}
	
	//3.修改
//動作行:educationDAO.update(educationBean);
	public EducationBean update(EducationBean educationBean) {
		if (educationBean != null && educationBean.getEduid() != null) { //檢查輸入
			EducationBean updateResult = educationDAO.update(educationBean.getEduid(), educationBean.getTeaid(), educationBean.getEdustart(), educationBean.getEduend(), educationBean.getEduschool(), educationBean.getEdudepart() );
			return updateResult;
		}
		return null;
	}
	
	//4a.查詢(單)
	public EducationBean select(EducationBean educationBean) {
		if (educationBean != null && educationBean.getEduid() != null ) {
			EducationBean selectResult = educationDAO.select( educationBean.getEduid() );
			return selectResult;
		}
		return null;
	}
	
	//4b.查詢(多)
	public List<EducationBean> select() {
		List<EducationBean> selectAllResult = educationDAO.select();
		return selectAllResult;
	}
	
	
	
	//測試
//	public static void main (String[] args) {
//		//使用三行
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//裝子彈(創主詞)
////		EducationService educationService = new EducationService( new EducationDAO(sessionFactory) );
//		
////		//1.新增  OK
//////educationService.insert(educationBean);
////		EducationBean educationBean = new EducationBean();
////		Date beginDate = new GregorianCalendar(2022, 1, 9).getTime();
////		Date gradDate = new GregorianCalendar(2022, 1, 10).getTime();
////		
////		educationBean.setEduid(3);
////		educationBean.setTeaid(1);
////		educationBean.setEdustart(beginDate);	//!!
////		educationBean.setEduend(gradDate); 		//!!
////		educationBean.setEduschool("成人大學");
////		educationBean.setEdudepart("愛情動作系");
////		System.out.println(educationService.insert(educationBean));
//
//		
////		//2.刪除  OK
//////educationService.delete(educationBean);
////		EducationBean educationBean2 = new EducationBean();
////		educationBean2.setEduid(2);
////		System.out.println( educationService.delete(educationBean2) );
//
//		
////		//3.修改  OK  //沒用merge: a.不會自動"新增流水號"  b.但每項還是要有值
//////educationService.update(educationBean);
////		EducationBean educationBean3 = new EducationBean();
////		Date beginDate3 = new GregorianCalendar(2022, 1, 9).getTime();
////		Date gradDate3 = new GregorianCalendar(2026, 1, 10).getTime();
////		
////		educationBean3.setEduid(1);
////		educationBean3.setTeaid(1);
////		educationBean3.setEdustart(beginDate3);
////		educationBean3.setEduend(gradDate3);
////		educationBean3.setEduschool("霍格華茲");
////		educationBean3.setEdudepart("非.JAVA系所");
////		System.out.println( educationService.update(educationBean3) );
//
//		
////		//4.查詢(單)  OK
//////educationService.select(educationBean);
////		EducationBean educationBean4 = new EducationBean();
////		educationBean4.setEduid(1);
////		EducationBean selectResult = educationService.select(educationBean4);
////		System.out.println(selectResult);
//		
//		
//		//4.查詢(多)  OK
////educationService.select();
////		System.out.println( educationService.select() );
//		
//		
//		transaction.commit();
//		session.close();
//		sessionFactory.close();
//	}
}