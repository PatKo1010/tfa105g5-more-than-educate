package web.member.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import web.member.dao.SubjectDAOInterface;
import web.member.entity.SubjectBean;

public class SubjectDAOHibernate implements SubjectDAOInterface {
//500星  參數是靈魂  方法是裝載的肉體  屬性是結果(就是值)  又開始輪迴成靈魂
	
//環境建立
//  三建行第1種寫法 空的(for session)
	private SessionFactory sessionFactory; //宣sessionFactory(包環境)做屬性
	public SubjectDAOHibernate(SessionFactory sessionFactory) { //建建構式,環境當參數放入DAO
		this.sessionFactory = sessionFactory;
	}
	//上兩行, 只是為了getCurrentSession, 才創的"sessionFactory+建構子"
	public Session getSession() {
		return sessionFactory.getCurrentSession();//注意這裡不是指HibernateUtil那個getSessionFactory
	}
		
//  三建行第2種寫法 (西洋寫法)	
//	private Session session;
//	public SubjectDAOHibernate(Session session) {
//		this.session = session;
//	}
//	public Session getSession() {
//		return this.session;
//	}

	
//實作DAOInterface裡定好,但還沒實作的方法  (去interface裡抄的, interface只是規格不參與反應)	
	//1.新增
	@Override
	public SubjectBean insert(SubjectBean bean) {  
		if(bean!=null && bean.getSubjectid()!=null) {
			SubjectBean temp = getSession().get(SubjectBean.class, bean.getSubjectid() ); //get前會先select
			if (temp == null) {
				getSession().save(bean);
				return bean; //給你看一下, 也可以是true
			}
		}
		return null;  //也可以是false
	}

	//2.刪除
	@Override
	public boolean delete(Integer subjectid) {//刪除
		if (subjectid != null) {
			SubjectBean temp = getSession().get(SubjectBean.class, subjectid);
			if (temp != null) {
				getSession().delete(temp);
				return true;
			}
		}
		return false;
	}
	
	//3.修改
	@Override
//	public SubjectBean update(Integer subjectid, String subjectname) {
//		if (subjectid != null) {
//			SubjectBean temp = getSession().get(SubjectBean.class, subjectid); //把資料庫把舊有的取出來
//			if (temp!= null) { //取出來有東西,才修改
//				temp.setSubjectid(subjectid);
//				temp.setSubjectname(subjectname);
//				return temp;  //回傳給你看一下
//			}
//		}
//		return null;
//	}
	public SubjectBean update(SubjectBean bean) {
		return (SubjectBean)this.getSession().merge(bean);
	}
	
	//4a.查詢(單筆)
	@Override
	public SubjectBean select(Integer subjectid) {
		if (subjectid != null) {
			return getSession().get(SubjectBean.class, subjectid);
		}
		return null; //沒成功:不回
	}
	
	//4b.查詢(多筆)
	@Override
	public List<SubjectBean> select() { //全選就不用判subjectid是否為空
		return getSession().createQuery("FROM SubjectBean", SubjectBean.class).list(); //記得用的是createQuery(qureyString,resultType)
	}
	
}
