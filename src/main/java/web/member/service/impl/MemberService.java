package web.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import configuration.SpringJavaConfig;
import web.member.dao.impl.MemberDAO;
import web.member.entity.MemberBean;

@Service
@Transactional
public class MemberService {
// service => DAO
// 			->DAOInterface(仲介.只是個旁支; 去耦化)

	//0.接收環境 (包入DAO in Service)
	@Autowired
	private MemberDAO memberDAO;
	// Service接入dao  (再去DAO看:DAO接入sessionFactory)
	public MemberService(MemberDAO memberDAO) { //建構子-"宣告"
		this.memberDAO = memberDAO;
	}
	
	//A.登入
	public MemberBean login(String email, String password) {
		//"對的"驗證,放Service
		MemberBean dbObject = memberDAO.selectByEmail(email); //檢查輸出(資料庫)
		if (password != null && password.length()!= 0) {
			String dbPassword = dbObject.getPassword();
			if (dbPassword.equals(password)) {
				return dbObject;
			}
		}
		return null;
	}
	//B.只讀Email
	public MemberBean selectByEmail(String email) {
		if ( email != null && email.length() != 0) {
			return memberDAO.selectByEmail(email);
		}
		return null;
	}
	
	//1.新增
	public MemberBean insert(MemberBean memberBean) {
		if (memberBean.getEmail() != null && memberBean.getPassword() != null) { //DAO實作已經寫了判斷,service還要寫判斷嗎????
			MemberBean insertResult = memberDAO.insert(memberBean);
			return insertResult;
		}
		return null;
	}
	
	//2.刪除
//	public boolean delete(Integer memid) {
	public boolean delete(MemberBean memberBeanDelete) { //為什麼刪除不用("Integer memid")????
		if (memberBeanDelete != null && memberBeanDelete.getMemid() != null) {
			return memberDAO.delete(memberBeanDelete.getMemid());
		}
		return false; 
	}
	
	//3.修改
	public MemberBean update(MemberBean memberBeanUpdate) {
		if (memberBeanUpdate != null && memberBeanUpdate.getMemid() != null) {
			return memberDAO.update(memberBeanUpdate);
		}
		return null;
	}
	
	//4a.查詢(單)
	public MemberBean select(MemberBean memberBeanSelect) {
		if (memberBeanSelect != null && memberBeanSelect.getMemid() != null) {
			return memberDAO.select(memberBeanSelect.getMemid());
		}
		return null;
	} 
	
	//4b.查詢(多)
	public List<MemberBean> selectAll(MemberBean memberBeanSelectAll) {
		if (memberBeanSelectAll != null && memberBeanSelectAll.getMemid() != null) {
			//selectAll()裡有放參數:
			MemberBean temp = memberDAO.select(memberBeanSelectAll.getMemid());
			if (temp!=null) {
//				result = new ArrayList<ProductBean>(); //為什麼要多new一個ArrayList(不直接用List)????
//				result.add(temp);
				memberDAO.select().add(temp);
			}
		}
		//selectAll()裡沒放參數,就回傳全部
		return memberDAO.select();
	}


	//測試
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		MemberService service = context.getBean("memberService", MemberService.class);
		MemberBean bean =  service.selectByEmail("abc123456@gmail.com");
		System.out.println(bean);
		
		
		((ConfigurableApplicationContext)context).close();
////		//使用三行
////		//private SessionFactory sessionFactory; //錯誤示範
////		SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); //START: 創sessionFactory(引進的方式)
////		Session session = sessionFactory.getCurrentSession();
////		Transaction transaction = session.beginTransaction();
////		
////		//關鍵的一手!!!!  上實彈(創"實體化"主詞)
////		MemberService memberService = new MemberService( new MemberDAO(session) );
////
////		//1.新增  OK
////		MemberBean memberBean = new MemberBean();
////
////		//i.存入photo (放入byte[])
////		FileInputStream inputStream = null;
////		byte[] container = null;
////		try {
////			inputStream = new FileInputStream(new File("C:\\Users\\Tibame_T14\\Desktop\\S__77086794.jpg")); //實體化:FileInputStream讀一個File("")
////			container = new byte[inputStream.available()]; //創一個容器byte[]: 有多大,上面inputStream那麼大
////			inputStream.read(container);
////		} catch (IOException e) {
////			e.printStackTrace();
////		} finally {
////			try {
////				if (inputStream != null) {
////					inputStream.close();
////				}
////			} catch (IOException ex) {
////				ex.printStackTrace();
////			}
////		}
////
////		//ii.存入其他欄位
////		Date birthDay = new GregorianCalendar(1987, 9, 7).getTime();
////		Date regDay = new GregorianCalendar(2022, 1, 7).getTime();
////
////		memberBean.setMemid(3);
////		memberBean.setEmail("8177818@yahoo.com.tw");
////		memberBean.setPassword("P@ssw0rd");
////		memberBean.setUsername("Morning99HowHowPlay");
////		memberBean.setPhonenum("0912345678");
////		memberBean.setBirth(birthDay);
////		memberBean.setPhoto(container);		//????
////		memberBean.setTeaqual(false);
////		memberBean.setRegdate(regDay);
////		memberBean.setTeatitle("型男老師");
////		memberBean.setSubjectid(1); //FK
////		memberBean.setIntrocontent("我是老師囉,豪爽歐~~學妹們,我來囉!!!666");
////		memberBean.setIntroclip("1234".getBytes());	//????
////		memberBean.setRatesum(15);
////		memberBean.setRatecount(3);
////		//看結果
////		MemberBean insertResult = memberService.insert(memberBean); //這裡可開始用"service.方法", 靠上面的一堆設定
////		System.out.println("insertResult" + insertResult);
//
////		//2.刪除  OK
////		MemberBean memberBeanDelete = new MemberBean();
////		memberBeanDelete.setMemid(2);
////		memberService.delete(memberBeanDelete);
//		
////		//3.修改  OK
//////memberDAO.update(memberBean);
////		Date birthDay = new GregorianCalendar(1990, 1, 8).getTime();
////		Date regDay = new GregorianCalendar(1994, 1, 9).getTime();
////		
////		MemberBean memberBean2 = new MemberBean();
////		memberBean2.setMemid(6);
////		memberBean2.setEmail("Dumbledore@yahoo.com.tw");
////		memberBean2.setPassword("123456");
////		memberBean2.setUsername("改.鄧不利多");
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
////		MemberBean updateResult = memberService.update(memberBean2);
////		System.out.println(updateResult);
//
////		//4a.查詢(單) OK
////memberDAO.select(1);
////		MemberBean memberBean2 = new MemberBean();
////		memberBean2.setMemid(6);
////		MemberBean selectResult = memberService.select(memberBean2);
////		System.out.println(selectResult);
//		
////		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
////		
////		MemberService memberService = context.getBean("memberService",MemberService.class); 
////		
////		MemberBean bean = new MemberBean ();
////		bean.setMemid(1);
////		System.out.println(memberService.select(bean));
////		
////		((ConfigurableApplicationContext) context).close();
//		
////		//4b.查詢(多)  OK
////		System.out.println("selectAll= " +  memberService.selectAll(null) );
//		
//		
////		transaction.commit();
////		session.close();
////		sessionFactory.close();
	}
	
}
