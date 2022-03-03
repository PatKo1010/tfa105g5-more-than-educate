package web.education.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import web.education.entity.EducationBean;
import web.education.dao.EducationDAOInterface;

@Repository
public class EducationDAO implements EducationDAOInterface {
//環境建立  實作DAOInterface  測試

//環境建立
//	private SessionFactory sessionFactory;
//	public EducationDAO(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

//	public Session getSession() { 
//		return sessionFactory.getCurrentSession();
//	}
	@PersistenceContext
	private Session session;
	public Session getSession() {
		return this.session;
	}


//實作DAOInterface
	//1.新增
	@Override
	public EducationBean insert(EducationBean educationBean) {
		System.out.println(educationBean);
		if (educationBean.getMemid() != null) { //檢查輸入:是否為空
			session.save(educationBean);
			return educationBean;
			}
		return null; 
	}
	
	//2.刪除
	@Override
	public boolean delete(Integer eduid) {
		if (eduid != null) {
			EducationBean tempObject = getSession().get(EducationBean.class, eduid); //這段對delete來說是必要的
			if (tempObject != null) {
				getSession().delete(tempObject);
				return true;
			}
		}
		return false;
	}
	
	//3.修改  //沒用merge: a.不會自動"新增流水號"  b.但每項還是要有值
	@Override
	public EducationBean update(Integer eduid, Integer memid, Date edustart, Date eduend, String eduschool, String edudepart) {
		if(eduid != null) {  //先檢查輸入 
			EducationBean tempObject = getSession().get(EducationBean.class, eduid);
			if (tempObject != null) {
				tempObject.setEduid(eduid);
				tempObject.setMemid(memid);
				tempObject.setEdustart(edustart);
				tempObject.setEduend(eduend);
				tempObject.setEduschool(eduschool);
				tempObject.setEdudepart(edudepart);
				return tempObject;
			}
		}
		return null;
	}

	//4a.查詢(單)
	@Override
	public EducationBean select(Integer eduid) {
		if (eduid != null) { //先"檢查輸入"
			return getSession().get(EducationBean.class, eduid);//沒有要改,所以不用"檢查資料庫"
		}
		return null;
	}
	
	//4b.查詢(多)
	@Override
	public List<EducationBean> select() {
		return getSession().createQuery("FROM EducationBean", EducationBean.class).list();
	}

	//4c.select by member id
	@Override
	public EducationBean selectByMemberid(Integer memid) {
		if (memid != null ) {
			return this.session.createQuery("FROM EducationBean where memid =:XXX",EducationBean.class)
				.setParameter("XXX", memid)
				.uniqueResult();
		}
		return null;
	}

	
	
//	//測試
//	public static void main(String[] args) {
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		EducationDAO educationDAO = new EducationDAO(sessionFactory);  //使用;生成
//		
////		//1.新增
////		EducationBean educationBean = new EducationBean();
////		Date start = new GregorianCalendar(2022,01,07).getTime();
////		Date end = new GregorianCalendar(2026,01,07).getTime();
////		educationBean.setEduid(2);
////		educationBean.setTeaid(1);
////		educationBean.setEdustart(start); //???
////		educationBean.setEduend(end); //???
////		educationBean.setEduschool("成人大學");
////		educationBean.setEdudepart("愛情動作系");
////		//動作行
////		EducationBean insertResult = educationDAO.insert(educationBean);
////		System.out.println(insertResult);
//	
//		
////		//2.刪除
////		EducationBean educationBean2 = new EducationBean();
////		educationBean2.setEduid(1);
////		//動作行
////		boolean deleteResult = educationDAO.delete(educationBean2.getEduid());
////		System.out.println(deleteResult);
//		
//		
////		//3.修改
////		EducationBean educationBean3 = new EducationBean();
////		educationBean3.setEduid(1);
////		educationBean3.setTeaid(1);
////		educationBean3.setEdustart(DATE);
////		educationBean3.setEduend(DATE);
////		educationBean3.setEduschool("成人大學");
////		educationBean3.setEdudepart("非-愛情動作系");	
////		//動作行
////		EducationBean updateResult = educationDAO.update(educationBean3.getEduid(), educationBean3.getTeaid(), educationBean3.getEdustart(), educationBean3.getEduend(), educationBean3.getEduschool(), educationBean3.getEdudepart());
////		System.out.println(updateResult);
//		
////		//4a.查詢(單)
////		EducationBean educationBean4 = new EducationBean();
////		//動作行
////		EducationBean selectResult = educationDAO.select(educationBean4.getEduid());
////		System.out.println(selectResult);
//
//		//4b.查詢(多)
//		//動作行
//		List<EducationBean> selectAllResult = educationDAO.select();
//		System.out.println(selectAllResult);
//	
//		
//		transaction.commit();
//		session.close();
//		sessionFactory.close();
//	}
}