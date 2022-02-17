package web.member.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import web.Hibernate.HibernateUtil;
import web.member.dao.impl.WrkExpDAO;
import web.member.entity.WrkExpBean;

public class WrkExpService {
//	i.引用環境  ii.在DAO基礎上,各方法再增規則  iii.測試

	//引用環境三行
	private WrkExpDAO wrkExpDAO;
	public WrkExpService(WrkExpDAO wrkExpDAO) {
		this.wrkExpDAO = wrkExpDAO;
	}
	
	//1.新增
	public WrkExpBean insert(WrkExpBean wrkExpBean) {
		if (wrkExpBean != null && wrkExpBean.getWkexpid() != null) {
		
			WrkExpBean insertResult = wrkExpDAO.insert(wrkExpBean);
			return insertResult;
		}
		return null;
	}

	//2.刪除
	public boolean delete(WrkExpBean wrkExpBean) { //參數放的從Integer id變成
		if(wrkExpBean != null && wrkExpBean.getWkexpid() != null) {

			boolean deleteResult = wrkExpDAO.delete(wrkExpBean.getWkexpid());
			return deleteResult;
		}
		return false;
	}

	//3.修改
	public WrkExpBean update(WrkExpBean wrkExpBean) {
		if (wrkExpBean != null && wrkExpBean.getWkexpid() != null) { //檢查輸入
			
			WrkExpBean updateResult = wrkExpDAO.update(wrkExpBean);
			return updateResult;
		}	
		return null;
	}

	//4a.查詢(單)
	public WrkExpBean select(WrkExpBean wrkExpBean) {
		if (wrkExpBean != null && wrkExpBean.getWkexpid() != null) {

			WrkExpBean selectResult = wrkExpDAO.select(wrkExpBean.getWkexpid());
			return selectResult;
		}
		return null;
	}

	//4b.查詢(多)
	public List<WrkExpBean> selectAll() {
		List<WrkExpBean> selectAllResult =  wrkExpDAO.selectAll();
		return selectAllResult;
	}	
	
	
	
	
	//測試
	public static void main (String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		WrkExpService wrkExpService = new WrkExpService( new WrkExpDAO(sessionFactory) );
		
//		//1.新增 O  ??不管怎麼增加都會流水號新增下去(沒辦法插入"1"號)
//		WrkExpBean wrkExpBean = new WrkExpBean();
//		wrkExpBean.setWkexpid(1);
//		wrkExpBean.setTeaid(1);
//		wrkExpBean.setWkduration(5);
//		wrkExpBean.setWkunit("家裡蹲");
//		wrkExpBean.setWktitle("啃啃");
//		WrkExpBean insertResult = wrkExpService.insert(wrkExpBean);
//		System.out.println("insertResult= " + insertResult );
		
		//2.刪除 O
		WrkExpBean wrkExpBean2 = new WrkExpBean();
		wrkExpBean2.setWkexpid(6);
		boolean deleteResult = wrkExpService.delete(wrkExpBean2);
		System.out.println(deleteResult);
		
//		//3.修改 X (都會變成像是"insert"的效果)
//		WrkExpBean wrkExpBean3 = new WrkExpBean();
//		wrkExpBean3.setWkexpid(3);
//		wrkExpBean3.setTeaid(1);
//		wrkExpBean3.setWkduration(5);
//		wrkExpBean3.setWkunit("SOD");
//		wrkExpBean3.setWktitle("改改改-資深動作片演員");
//		WrkExpBean updateResult = wrkExpService.update(wrkExpBean3);
//		System.out.println("updateResult= " + updateResult );		

		//4a.查詢(單) O
//		WrkExpBean wrkExpBean4 = new WrkExpBean();
//		wrkExpBean4.setWkexpid(2);
//		WrkExpBean selectResult = wrkExpService.select(wrkExpBean4);
//		System.out.println(selectResult);
		
		//4b.查詢(多) O
//		List<WrkExpBean> selectAll = wrkExpService.selectAll();
//		System.out.println("selectAll=" + selectAll );
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
}
