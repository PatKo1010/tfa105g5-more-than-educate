package web.member.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
import web.Hibernate.HibernateUtil;
import web.member.dao.WrkExpDAOInterface;
import web.member.entity.WrkExpBean;

@Repository
public class WrkExpDAO implements WrkExpDAOInterface {
//提示  i.建環境(Hibernate)  ii.實作Interface各方法  iii.測試
	
	//i.建環境三行
//	private SessionFactory sessionFactory;
//	public WrkExpDAO(SessionFactory sessionFactory) { //重要!!!!DAO包SessionFactory
//		this.sessionFactory = sessionFactory;
//	}
//	
//	public Session getSession() { //只是收納起來 用一個方法
//		return sessionFactory.getCurrentSession();
//	}

	@PersistenceContext
	private Session session;
	public Session getSession() {
		return this.session;
	}
	
	
	//ii.實作Interface各方法
	//1.新增
	@Override
	public WrkExpBean insert(WrkExpBean wrkExpBean) {
		if (wrkExpBean != null && wrkExpBean.getWkexpid() != null) {
			getSession().save(wrkExpBean);
			return wrkExpBean;
			//WrkExpBean tempObject = getSession().get(WrkExpBean.class, wrkExpBean.getWkexpid());(X)get不到東西的
			//getSession().save(tempObject);(X)
			//return tempObject;(X)
		}
		return null;
	}
	
	//2.刪除
	@Override
	public boolean delete(Integer wkexpid) {
		if (wkexpid != null) {
			//getSession().delete(wkExpId); //教訓!!!!!這樣寫很明顯刪的是"wkExpid",不是刪"整個物件"
			WrkExpBean tempObject = getSession().get(WrkExpBean.class, wkexpid);//這樣寫才是取"整個物件"
			getSession().delete( tempObject );
			return true;
		}
		return false;
	}
	
	//3.修改
	@Override
	public WrkExpBean update(WrkExpBean wrkExpBean) {
		if (wrkExpBean != null && wrkExpBean.getWkexpid() != null) { //檢查輸入
//用getSession.merge()寫法 (????有個壞處,沒辦法檢查資料庫原來有沒有這個物件)
			WrkExpBean tempObject = getSession().get(WrkExpBean.class, wrkExpBean.getWkexpid() );
			if (tempObject != null) { //檢查資料庫
				WrkExpBean updateResult = (WrkExpBean)getSession().merge(wrkExpBean); //用merge可否為空????
				return updateResult;
			}
			//or
			//WrkExpBean tempObject = getSession().get(WrkExpBean.class, wrkExpBean.getWkexpid()); //去資料庫把舊有的取出來
			//wrkExpBean.setTeaid(xxx);
			//wrkExpBean.setWkduration(xxx);
			//wrkExpBean.setWkexpid(xxx);
			//wrkExpBean.setWktitle(xxx);
			//wrkExpBean.setWkunit(xxx);
			//return tempObject;
		}
		return null;
	}
	
	//4a.查詢(單)
	@Override
	public WrkExpBean select(Integer wkExpId) {
		if (wkExpId != null) {
			WrkExpBean selectResult = getSession().get(WrkExpBean.class, wkExpId);
			return selectResult;
		}
		return null;
	}
	
	//4b.查詢(多)
	@Override
	public List<WrkExpBean> selectAll() {
//		getSession().get(null, sessionFactory); //重點!!!!不再用.get()了!!!!session下基本的方法不夠用了
		List selectResult = getSession().createQuery("FROM WrkExpBean", WrkExpBean.class).list();
		return selectResult;
	}
	
	
	//iii.測試
//	public static void main(String[] args) {
//		//使用三行
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		WrkExpDAO wrkExpDAO = new WrkExpDAO(sessionFactory); //關鍵的一手
//		
//		//1.新增 O
////		WrkExpBean wrkExpBean = new WrkExpBean();
////		wrkExpBean.setWkexpid(2);
////		wrkExpBean.setTeaid(1);
////		wrkExpBean.setWkduration(5);
////		wrkExpBean.setWkunit("SOD");
////		wrkExpBean.setWktitle("資深動作片演員");
////		WrkExpBean insertResult = wrkExpDAO.insert(wrkExpBean);
////		System.out.println("insertResult= " + insertResult );
//		
//		//2.刪除 O
////		boolean deleteResult = wrkExpDAO.delete(1);  //????為什麼error
////		System.out.println(deleteResult);
//		
//		//3.修改 X (都會變成像是"insert"的效果)
//		WrkExpBean wrkExpBean2 = new WrkExpBean();
//		wrkExpBean2.setWkexpid(3);
//		wrkExpBean2.setTeaid(1);
//		wrkExpBean2.setWkduration(5);
//		wrkExpBean2.setWkunit("SOD");
//		wrkExpBean2.setWktitle("改-資深動作片演員");
//		WrkExpBean updateResult = wrkExpDAO.insert(wrkExpBean2);
//		System.out.println("updateResult= " + updateResult );		
//
//		//4a.查詢(單) O
//		WrkExpBean selectResult = wrkExpDAO.select(2);
//		System.out.println(selectResult);
//		
//		//4b.查詢(多) O
//		List<WrkExpBean> selectAll = wrkExpDAO.selectAll();
//		System.out.println("selectAll=" + selectAll );
//		
//		transaction.commit();
//		session.close();
//		sessionFactory.close();
//	}
	
	public static void main(String[] args) {
	//建spring環境
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
	
	//spring取bean
	WrkExpDAO wrkExpDAO = context.getBean("wrkExpDAO", WrkExpDAO.class);
	
	System.out.println(wrkExpDAO.selectAll());
	
	//關Spring
	((ConfigurableApplicationContext)context ).close();
}

	
	
	
	
}
