package web.member.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
import web.member.dao.MemberDAOInterface;
import web.member.entity.MemberBean;

@Repository
public class MemberDAO implements MemberDAOInterface {
//i.建環境 (三建行)
//→組態檔現在存在SessionFactory裡了
//→最終為用getCurrentSession()  (為求方便進一步將其收進方法getSession()) 

	//	private SessionFactory sessionFactory;
	@PersistenceContext
	private Session session;
	//建構子只是個方法MemberDAO(): new等於執行"MemberDAO()" +接收參數
//	public MemberDAO(SessionFactory sessionFactory) { //建構子接受參數"sessionFactory"
//		this.sessionFactory = sessionFactory;
//	}
	
//	public MemberDAO(Session s) {
//		this.session = s;
//	}
	
	public Session getSession() {
//		return sessionFactory.getCurrentSession();
		return this.session;
	}

	
//ii.覆寫各功能	
	//A.selectByEmail
	@Override
	public MemberBean selectByEmail(String email) {
		if (email != null && email.length() != 0) {
			return session.createQuery("FROM MemberBean where email= :email", MemberBean.class)
				.setParameter("email", email).uniqueResult();
		}
		return null;
	}
	
	//1.新增
	@Override
	public MemberBean insert(MemberBean memberBean) {
		 session.save(memberBean);
		 return memberBean;
	}

	//2.刪除
	@Override
	public boolean delete(Integer memid) {
		if(memid != null) { //判斷式而已
			getSession().get(MemberBean.class, memid);
			//getSession().delete(memberBean); //錯誤示範:參數是(Integer memid),怎麼可以delete(memberBean)
			getSession().delete( getSession().get(MemberBean.class, memid) );  //getSession().get(MemberBean.class, memid)到底是什麼????
//			getSession().delete(memid);  //delete()內要放memid or getSession()...????
			return true;
		}
		return false;
	}

	//3.修改
	@Override
	public MemberBean update(MemberBean memberBean) {
		if (memberBean != null) {
			MemberBean update =  session.createQuery("FROM MemberBean where mem_id= :mem_id", MemberBean.class)
													.setParameter("mem_id", memberBean.getMemid()).uniqueResult();
			if(update == null) {
				return (MemberBean)getSession().merge(memberBean);
			} else { 
				if(update.getEmail().equals(memberBean.getEmail())) {
					update.setBirth(memberBean.getBirth());
					update.setEmail(memberBean.getEmail());
					update.setPassword(memberBean.getPassword());
					update.setPhoto(memberBean.getPhoto());
					update.setPhonenum(memberBean.getPhonenum());
					update.setUsername(memberBean.getUsername());
					
					update.setTeaqual(memberBean.getTeaqual());
					update.setRegdate(memberBean.getRegdate());
					update.setTeatitle(memberBean.getTeatitle());
					update.setSubjectid(memberBean.getSubjectid());
					update.setIntrocontent(memberBean.getIntrocontent());
					
					return (MemberBean)getSession().merge(update);
				}
			}
		}
		return null;
	}

	//4a.查詢(單)
	@Override
	public MemberBean select(Integer memid) {
		if(memid != null) {
			return getSession().get(MemberBean.class, memid); //得一memid? or 物件????
		}
		return null;
	}

	//4b.查詢(多)
	@Override
	public List<MemberBean> select() {
		return getSession().createQuery("FROM MemberBean", MemberBean.class) .list(); //createQuery("查詢字串", class(table))!!!!																					  //XXX.list(): return the result as a list!!!!
	}

	
//iii. main方法測試一下
	public static void main(String[]args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
////		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
////		Session session = sessionFactory.getCurrentSession();
////		Transaction transaction = session.beginTransaction();
//		
//
		MemberDAO memberDAO = context.getBean("memberDAO", MemberDAO.class);
//				new MemberDAO(session);
		
		MemberBean bean =  memberDAO.selectByEmail("abc123456@gmail.com");
		System.out.println(bean);
		
		((ConfigurableApplicationContext)context).close();
//		
//		
////		//1.新增   OK
////		MemberBean memberBean = new MemberBean();
////
////		//放入photo (放入byte[])
////		FileInputStream inputStream = null;
////		byte[] container = null;
////		try {
////			inputStream = new FileInputStream(new File("C:\\Users\\Tibame_T14\\Desktop\\S__77086794.jpg")); //實體化:FileInputStream讀一個File("")
////			container = new byte[inputStream.available()]; //創一個容器byte[]: 有多大,上面inputStream那麼大
////			inputStream.read(container);
////		} catch (IOException e) {
////			e.printStackTrace();
////		}finally {
////			try {
////				if (inputStream != null) {
////					inputStream.close();
////				}
////			} catch (IOException ex) {
////				ex.printStackTrace();
////			}
////		}
////
////		//放入其他欄位資訊
////		Date birthDay = new GregorianCalendar(1987, 9, 7).getTime();
////		Date regDay = new GregorianCalendar(2022, 1, 7).getTime();
////
////		memberBean.setMemid(3);
////		memberBean.setEmail("5566@gmail.com");
////		memberBean.setPassword("123");
////		memberBean.setUsername("5566");
////		memberBean.setPhonenum("0912345678");
////		memberBean.setBirth(birthDay);
////		memberBean.setPhoto(container);		//????
////		memberBean.setTeaqual(false);
////		memberBean.setRegdate(regDay);
////		memberBean.setTeatitle("禧洋老師");
////		memberBean.setSubjectid(1); //FK
////		memberBean.setIntrocontent("禧洋老師你怎麼看,豪爽歐~~我來囉!!!666");
////		memberBean.setIntroclip("1234".getBytes());	//????
////		memberBean.setRatesum(15);
////		memberBean.setRatecount(3);
////		
////		MemberBean insertResult = memberDAO.insert(memberBean);
////		System.out.println(insertResult);
//		//session.save(bean);
//		
////		//2.刪除  OK
//////memberDao.delete(5);
////		boolean deleteResult =  memberDAO.delete(5);
////		System.out.println(deleteResult);
//
////		//3.修改  OK
//////memberDAO.update(memberBean);
////		Date birthDay = new GregorianCalendar(1990, 1, 8).getTime();
////		Date regDay = new GregorianCalendar(1994, 1, 9).getTime();
////		
////		MemberBean memberBean2 = new MemberBean();
////		memberBean2.setMemid(1);
////		memberBean2.setEmail("Dumbledore@yahoo.com.tw");
////		memberBean2.setPassword("123456");
////		memberBean2.setUsername("非.鄧不利多");
////		memberBean2.setPhonenum("0912345678");
////		memberBean2.setBirth(birthDay);
////		memberBean2.setPhoto("1234".getBytes());		//暫定
////		memberBean2.setTeaqual(true);
////		memberBean2.setRegdate(regDay);
////		memberBean2.setTeatitle("校長");
////		memberBean2.setSubjectid(1); //FK
////		memberBean2.setIntrocontent("當過霍格華茲校長");
////		memberBean2.setIntroclip("1234".getBytes());	//暫定
////		memberBean2.setRatesum(15);
////		memberBean2.setRatecount(3);
////		MemberBean updateResult = memberDAO.update(memberBean2);
////		System.out.println(updateResult);
//
////		//4a.查詢(單) OK
//////memberDAO.select(1);
////		MemberBean selectResult = memberDAO.select(1);
////		System.out.println(selectResult);
//
////		//4b.查詢(多) OK
//////memberDAO.select();
////		List<MemberBean> selectAllResult = memberDAO.select();
////		System.out.print(selectAllResult);
//		
////		transaction.commit();
////		session.close();
////		sessionFactory.close();
	}
	
}
