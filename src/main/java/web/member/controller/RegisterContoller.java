package web.member.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

@Controller
public class RegisterContoller {
	@Autowired
	private MemberService memberService;
	@Autowired
	ServletContext context; 

	@RequestMapping(path = { "/views/member/register" })
	public String handleRegister(String email, String username, String password, String passwordConf, Model model,
			HttpSession session) {
		// 驗證
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);
//		if(production != null) {
//			if(production.equals("Insert") || production.equals("Update") || production.equals("Delete")) {
//				if(temp1==null || temp1.length()==0) {
//					errors.put("id", "Please enter Id for "+production);
//				}
//			}"".equals(email)
//		}	
		if (email == null || email.length() == 0) {
			errors.put("email", "請輸入email");
		}
		if (password == null || password.length() == 0) {
			errors.put("password", "請輸入密碼");
		}
		if (username == null || username.length() == 0) {
			errors.put("username", "請輸入使用者名稱");
		}
		if (passwordConf == null || passwordConf.length() == 0) {
			errors.put("passwordConf", "請重複輸入密碼");
		}

			// 重輸密碼的確認
		if (!password.equals(passwordConf)) {
			errors.put("passwordConf", "請確認密碼是否一致!");
		}
			// 帳號已存在的確認
		MemberBean check = memberService.selectByEmail(email);
		if (check != null) {
			errors.put("email", "email已有人使用");
		}
		
		//驗證失敗的Action (e.g.轉導 +是否帶入下頁)
		if(errors != null && !errors.isEmpty() ) {
			//轉導: 原畫面+顯示errorMessage
			model.addAttribute(username, errors);  //專程回傳"帳號已使用"????
//			return "/views/register.jsp"; 	
			return "/views/member/register.jsp"; 	
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

		//a.錯誤時    //不知道的話 →去想service回傳什麼
		if ( insertResult == null) {   
			errors.put("password", "insert不成功(code有錯)");
//			return "/views/register.jsp";
			return "/views/member/register.jsp";
//			PrintWriter out = response.getWriter();
//			out.print(errors);
		} else {
		//b.正確時
//			HttpSession httpSession = request.getSession();
//			httpSession.setAttribute("member", dbObject);
			String nowPath = context.getContextPath();
			return "redirect:" + "/views/member/login.jsp";
//待改:註冊後"不用再登入" 直入某頁
//response.sendRedirect(nowPath + "/views/dashboard.jsp");
		}
	}

}
