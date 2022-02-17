package web.member.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import web.Hibernate.HibernateUtil;
import web.member.dao.SubjectDAOInterface;
import web.member.dao.impl.SubjectDAOHibernate;
import web.member.entity.SubjectBean;

public class SubjectService {
	
	private SubjectDAOInterface subjectDAO;
	public SubjectService(SubjectDAOInterface subjectDAO) {
		this.subjectDAO = subjectDAO;
	}

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
	
		
		SubjectService subjectService = new SubjectService( new SubjectDAOHibernate(sessionFactory) );
		//1st種輸出
		System.out.println(subjectService.select() ) ;  //XXXX
		//2nd輸出
//		List answer = subjectService.select();
//		System.out.println(answer);
		
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
	//1.新增 (宣告一方法)
	public SubjectBean insert(SubjectBean beanForInsert) {
		//private SubjectDAOInterface subjectDAO; //????為什麼這樣錯????method裡面不能用
	
		// ===這邊可寫些判斷式===
		//subjectDAO.insert(bean);  //改寫成下行
		SubjectBean insertResult = subjectDAO.insert(beanForInsert);		
		return insertResult;		
	}

	//2.刪除
//錯誤示範(class)
//	public SubjectDAOInterface delete(SubjectBean bean) {
//		Boolean deleteResult = subjectDAO.delete(bean.getSubjectid());
//		return deleteResult;
//	}
	public Boolean delete(SubjectBean beanForDelete) {
		Boolean deleteResult = subjectDAO.delete(beanForDelete.getSubjectid());
		return deleteResult;
	}

	//3.修改
	public SubjectBean update(SubjectBean beanForUpdate) {
		//bean.setSubjectid(7);
		//bean.setSubjectname("CHAALA-HEY-CHALAAA");
		SubjectBean updateResult = subjectDAO.update(beanForUpdate);
		return updateResult;
	}

	//4a.查詢(單筆)
//	public abstract SubjectBean select(Integer subjectid); //查詢(單筆)
	public SubjectBean select(SubjectBean beanForSelect) {
		//beanForSelect.setSubjectid(2);
		SubjectBean selectResult = subjectDAO.select(beanForSelect.getSubjectid());
		return selectResult;
	}
	
	//4b.查詢(多筆)
//	public abstract List<SubjectBean> select(); //查詢(多筆)
	public List<SubjectBean> select() {
		List<SubjectBean> allSelectResult = subjectDAO.select();
		return allSelectResult;
	}

}