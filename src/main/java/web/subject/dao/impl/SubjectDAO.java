package web.subject.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
import web.member.entity.MemberBean;
import web.subject.dao.SubjectDAOInterface;
import web.subject.entity.SubjectBean;

@Repository
public class SubjectDAO implements SubjectDAOInterface {
//500星  參數是靈魂  方法是裝載的肉體  屬性是結果(就是值)  又開始輪迴成靈魂
	
//環境建立
//  三建行第1種寫法 空的(for session)
//	private SessionFactory sessionFactory; //宣sessionFactory(包環境)做屬性
//	public SubjectDAOHibernate(SessionFactory sessionFactory) { //建建構式,環境當參數放入DAO
//		this.sessionFactory = sessionFactory;
//	}
	//上兩行, 只是為了getCurrentSession, 才創的"sessionFactory+建構子"
//	public Session getSession() {
//		return sessionFactory.getCurrentSession();//注意這裡不是指HibernateUtil那個getSessionFactory
//	}
		
//  三建行第2種寫法 (西洋寫法)	
//	private Session session;
//	public SubjectDAOHibernate(Session session) {
//		this.session = session;
//	}
//	public Session getSession() {
//		return this.session;
//	}

//Spring寫法
	@PersistenceContext
	private Session session;
	public Session getSession() {
		return this.session;
	}
	
	
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
	
	@Override
	 public  List<MemberBean> findTeacher(String subjectname){
		String trimname=subjectname.trim();
		if(trimname!=null) {
			String sub="";
			String hql1 = "select subjectname from SubjectBean";
			List <String>result = session.createQuery(hql1).list();
			Integer size=result.size();
			for(int i=0;i<size;i++)
			{
				sub+=result.get(i).substring(0,1);
			}
			String str="";
			for(int i=0;i<trimname.length();i++) {
				for(int j=0;j<sub.length();j++) {
					if(trimname.charAt(i)==sub.charAt(j)) {
						str+=sub.charAt(j);
						System.out.println(str);
						String hql2 = "select subjectid from SubjectBean where subject_name like :str";
						Integer result1 = (Integer)(session.createQuery(hql2).setParameter("str", "%"+str+"%").uniqueResult());
						String hql3="from MemberBean where subjectid=:result1";
						List<MemberBean> result2= session.createQuery(hql3).setParameter("result1", result1).list();
						return result2;
					}
				}
			}
		}
	   return null;
	 };

	
	//測試
	public static void main (String args[]) {
		//拿到spring
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		SubjectDAO subjectDAO = context.getBean("subjectDAO", SubjectDAO.class);
		System.out.println(subjectDAO.select());
		
		
		( (ConfigurableApplicationContext)context ) .close();
	}
	
}
