package web.member.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import web.member.dao.impl.MemberDAO;
import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

@WebServlet( urlPatterns={"/views/member/register"} )
public class RegisterServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private MemberService memberService;

	
	//1st
	@Override
	public void init() throws ServletException {
//		memberService = new MemberService( new MemberDAO( HibernateUtil.getSessionFactory() ) );
	}

	
	//2nd
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	//0.new Session連線
		Session session = (Session)request.getAttribute("session");	//getAtt回來是object
		memberService = new MemberService( new MemberDAO( ) );
		
	//1.接收資料
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String passwordConf = request.getParameter("passwordConf");
		
	//2.驗證資料
		Map<String, String> errors = new HashMap<String, String>();
		request.setAttribute("errors", errors);
//		if(production != null) {
//			if(production.equals("Insert") || production.equals("Update") || production.equals("Delete")) {
//				if(temp1==null || temp1.length()==0) {
//					errors.put("id", "Please enter Id for "+production);
//				}
//			}"".equals(email)
//		}	
		if(email == null || email.length() == 0) {
			errors.put("email", "請輸入email");
		}
		if(password == null || password.length() == 0) {
			errors.put("password", "請輸入密碼");
		}
		if(username == null || username.length() == 0) {
			errors.put("username", "請輸入使用者名稱");
		}
		if(passwordConf == null || passwordConf.length() == 0) {
			errors.put("passwordConf", "請重複輸入密碼");
		}
		//重輸密碼的確認
		if ( !password.equals(passwordConf) ) {
			errors.put("passwordConf", "請確認密碼是否一致!");
		}
		//帳號已存在的確認
		MemberBean check = memberService.selectByEmail(email);
		if(check != null) {
			errors.put("email", "email已有人使用");
		}
		//驗證失敗的action (or轉導)
		if(errors != null && !errors.isEmpty() ) {
			//轉導: 原畫面+顯示errorMessage
			request.setAttribute(username, errors);  //專程回傳"帳號已使用"????
			request.getRequestDispatcher("/views/register.jsp").forward(request, response); 
			return;
		}

		
		MemberBean insertResult = null;
		//檢查帳號是否已存在
		if (check == null) {
			MemberBean memberBean = new MemberBean();
			memberBean.setEmail(email);
			memberBean.setPassword(password);
			memberBean.setUsername(username);
			insertResult = memberService.insert(memberBean); //"新增"
		} 
		
	//3.呼叫model (作動)
		//model: 值的存取
//		MemberBean memberBean = new MemberBean();
//		memberBean.setEmail(email);
//		memberBean.setPassword(password);
//		MemberBean insertResult = memberService.insert(memberBean); //"新增"
		
//待作!!!!!!!!!!!!!申請帳號是否已有人用
		
		
		
		//據model結果:  轉導View(頁面)
		//a.錯誤時    //不知道的話 →去想service回傳什麼
		if ( insertResult == null) {   
			errors.put("password", "insert不成功 code有錯");
			request.getRequestDispatcher("/views/register.jsp").forward(request, response);
//			PrintWriter out = response.getWriter();
//			out.print(errors);
		} else {
		//b.正確時
//			HttpSession httpSession = request.getSession();
//			httpSession.setAttribute("member", dbObject);

			String nowPath = request.getContextPath();
			response.sendRedirect(nowPath + "/secure/login.jsp");

//待改:註冊後"不用再登入" 直入某頁
//response.sendRedirect(nowPath + "/views/dashboard.jsp");
		}
	}
	
	
	//3rd
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
	
}
