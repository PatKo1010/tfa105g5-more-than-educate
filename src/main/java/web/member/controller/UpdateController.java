package web.member.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;

import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

@Controller
//@MultipartConfig
public class UpdateController {

//0.用到的 (AC, Service)
	@Autowired
	private MemberService memberService;
	
//1.處理request(url設置) +接收參數
	@RequestMapping( path= {"views/member/update"} )
	public String handlerUpdate(Model model, String email, String password, String username, String phonenum, String birth, @RequestPart(name="image", required=false) Part part, HttpSession httpSession) {
		System.out.println("handlerUpdate進入成功"+ "," +part);
		return "";
//	//???框架下怎麼String轉date.sql???
//		Date birthSql = Date.valueOf(birth);
//	//驗證
//		Map<String, String> errors = new HashMap<String, String>();
//		model.addAttribute("errors", errors);
//		if (email.length() == 0) {
//			errors.put("email", "請輸入email");
//		}
//		if (password.length() == 0) {
//			errors.put("password", "請輸入密碼");
//		}
//		if (username.length() == 0) {
//			errors.put("username", "請輸入使用者名稱");
//		}
//		if (phonenum.length() == 0) {
//			errors.put("phoenum", "請輸入電話");
//		}
//		if (birth.length() == 0) {
//			errors.put("birth", "請輸入生日");
//		}
//		if (!errors.isEmpty()) {
//			return "/views/member/dashboard.jsp";
//		}
//		
////2.呼叫model
//	//值的"存改" (by某Service)
//		MemberBean memberBean = (MemberBean)httpSession.getAttribute("member");
//		//???框架下只能一個個set嗎????
//		memberBean.setEmail(email);
//		memberBean.setPassword(password);
//		memberBean.setUsername(username);
//		memberBean.setPhonenum(phonenum);
//		memberBean.setBirth(birthSql);
//		MemberBean updateResult = memberService.update(memberBean);
//	
//	//結果的"action" (by值結果)
//		httpSession.setAttribute("member", updateResult);
//		if(updateResult == null) {
//			return "/views/member/dashboard.jsp";
//		} else {
//			return "redirect:" + "/views/member/dashboard.jsp";
//		}
	}
	
}