package web.member.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import web.member.dao.impl.MemberDAO;
import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

//@WebServlet( urlPatterns= {"/views/update"} )
@MultipartConfig
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//0.要用的: service
	private MemberService memberService;
	
//1.init() override
	@Override
	public void init() {
		//new MemberService( new MemebrDAO(HibernateUtil.getSessionFactory()) ); 搬到filter了
	}

//2.doGet
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//new MemberService搬到這
		Session session = (Session)request.getAttribute("session");  //????session從哪拿的 →去看DAO
		memberService = new MemberService( new MemberDAO() );

//是不是用httpSession就好????
		//i.接收 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String phonenum = request.getParameter("phonenum");
		String birth = request.getParameter("birth");
		//!!!!!photo待施工!!!!!
		//System.out.println(email+","+password+","+username+","+phonenum+","+birth);
		
		//字串轉sql.Date
		Date birthDate = Date.valueOf(birth); 
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//Date birthDate = null;
		//try {
		//	birthDate = (Date) sdf.parse(birth);
		//} catch (ParseException e) {
		//	e.printStackTrace();
		//}
		
		
		//ii.驗證input
		Map<String, String> errors = new HashMap<String, String>();
		
		if (email.length() == 0) {
			errors.put("email", "請輸入email");
		}
		if (password.length() == 0) {
			errors.put("password", "請輸入密碼");
		}
		if (username.length() == 0) {
			errors.put("username", "請輸入使用者名稱");
		}
		if (phonenum.length() == 0) {
			errors.put("phoenum", "請輸入電話");
		}
		if (birth.length() == 0) {
			errors.put("birth", "請輸入生日");
		}
		//驗證失敗的action
		if (!errors.isEmpty()) {
			System.out.println("驗證失敗");
//			request.getRequestDispatcher( request.getContextPath() + "/views/member/dashboard.jsp").forward(request, response);
			request.getRequestDispatcher( "../views/member/dashboard.jsp").forward(request, response); //BUG!!!!!!!!!!!!!!
			return;
		}
		
		//從HttpSession取回memberBean,裝新酒
		HttpSession httpSession = request.getSession();
		MemberBean bean = (MemberBean)httpSession.getAttribute("member");
		bean.setEmail(email);
		bean.setPassword(password);
		bean.setUsername(username);
		bean.setPhonenum(phonenum);
		bean.setBirth(birthDate);
		
		
		//iii.作動Model
		//a.資料庫的值
		MemberBean updateResult = memberService.update(bean);
		//放回資料值
		httpSession.setAttribute("member", updateResult);
		
		//b.依值作動
		//導頁
		String path = request.getContextPath();
		if (updateResult != null) {
			response.sendRedirect(path);
		} else {
			request.getRequestDispatcher(
					"/views/dashboard.jsp").forward(request, response);  //!!
		}
		
		
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

//3.doPost
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
