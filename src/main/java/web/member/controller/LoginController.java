package web.member.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.member.dao.impl.MemberDAO;
import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

@Controller
public class LoginController {

//0.用到的 (AC, Service)
	@Autowired  //注入??
	private MemberService memberService;

	@Autowired  //注入
//	private ApplicationContext context;  //????
	private ServletContext context;
	
//1.處理request(url設置) +接收參數
	@RequestMapping( path= {"/views/member/loginResult"} )
	public String handlerLogin(Model model, String email, String password, HttpSession httpSession) {
//	//Session連線
//		Session session = (Session)request.getAttribute("session");
//		memberService = new MemberService( new MemberDAO() );
//		
//	//接收
////request.getParamter("username");
//		String email = request.getParameter("email");  //getParameter: 從view取值
//		String password = request.getParameter("password");
		
	//驗證
		Map<String, String> errors = new HashMap<String, String>(); //用map 當物件error!
		model.addAttribute("errors", errors); //"errors"設定進error物件
		if(email == null || email.length() == 0) {
			errors.put("email", "請填入email"); //errors.put method
		}
		if(password == null || password.length() == 0) {
			errors.put("password", "請填入密碼");
		}
	//驗證結果的action (e.g.轉導)
		if(errors != null && !errors.isEmpty() ) {
			return "/views/member/login.jsp";
		}

		
//2.呼叫Model
	//"值的存取"  (by某Service)
		MemberBean dbObject = memberService.login(email, password);
		
	//Model結果的action (看model結果)
		//錯誤 forward頁面
		if (dbObject == null) {  
			errors.put("password", "登入失敗, 可能輸入了不正確的帳號或密碼, 請重新登入");
			return "/views/member/login.jsp";
		} else {
		//正確 redirect頁面
			httpSession.setAttribute("member", dbObject);
			String path = context.getContextPath(); //context?????.getContextPath()
//			return "redirect:" + path + "/views/member/dashboard.jsp";  //網址http://localhost:7080/tfa105g5-more-than-educate/tfa105g5-more-than-educate/views/member/dashboard.jsp
//			return "redirect:";		//網址http://localhost:7080/tfa105g5-more-than-educate/views/member/loginResult
//			return "redirect: /views/member/dashboard.jsp";		//網址http://localhost:7080/views/member/dashboard.jsp
			return "redirect:" + "/views/member/dashboard.jsp"; //正確http://localhost:7080/tfa105g5-more-than-educate/views/member/dashboard.jsp
		}
	}

}