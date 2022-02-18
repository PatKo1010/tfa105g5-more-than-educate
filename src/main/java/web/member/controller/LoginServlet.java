package web.member.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import web.member.dao.impl.MemberDAO;
import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

@WebServlet( urlPatterns={"/views/member/loginResult"} )
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//0.要用的 service
	private MemberService memberService;

	
//1st override: init()
	@Override
	public void init() throws ServletException {
//		memberService = new MemberService( new MemberDAO(HibernateUtil.getSessionFactory()) );
	}

	
//2nd override: doGet()
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//0.new搬到這裡來 Session連線
		Session session = (Session)request.getAttribute("session");
		memberService = new MemberService( new MemberDAO() );
		
	//1.接收
//request.getParamter("username");
		String email = request.getParameter("email");  //getParameter: 從view取值
		String password = request.getParameter("password");
		
	//2.驗證
		Map<String, String> errors = new HashMap<String, String>(); //用map 當物件error!
		request.setAttribute("errors", errors); //"errors"設定進error物件
		if(email == null || email.length() == 0) {
			errors.put("email", "請填入email"); //errors.put method
		}
		if(password == null || password.length() == 0) {
			errors.put("password", "請填入密碼");
		}
//轉導?   RequestDispatcher.forward(request, response)
		if(errors != null && !errors.isEmpty() ) {
			//轉導#1  #request.RequestDispatcher()裡放URL?
//????????????????
			request.getRequestDispatcher("/views/member/login.jsp").forward(request, response); 
			return;
		}
		
		
	//3.作動
	//3a.Model值的存取 (由memberService)
		MemberBean dbObject = memberService.login(email, password);
		
	//3b.轉導頁面 (由model結果)
		if (dbObject == null) {  
		//錯誤 forward頁面
			errors.put("password", "登入失敗, 可能輸入了不正確的帳號或密碼, 請重新登入");


		} else {
		//正確 redirect頁面
			HttpSession httpSession = request.getSession(); //創session為了????  →setAttribute
			httpSession.setAttribute("member", dbObject);

			String path = request.getContextPath(); //??request.getContextPath()
			//轉導#2  #response下sendRedirect()
//			response.sendRedirect(path+"/pages/dashboard.html"); //登入成功後原版html
//			response.sendRedirect(path+"/index.jsp"); 			 //登入成功後樸實!
			response.sendRedirect(path + "/views/member/dashboard.jsp");  //sendRedirect()用的是Response,且需要加webApp那段
		}
	}


//3rd override doPost? 一定要寫doPost嗎?
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);  //??這行一定要寫嗎
	}

}