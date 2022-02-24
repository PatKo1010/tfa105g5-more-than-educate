package web.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogOutController {
//0.要用的
	
//1.處理request(+url設置)		接收參數
	@RequestMapping( path= {"views/member/logout"} ) 
	public String handlerLogout (HttpSession httpSession) {
		
		httpSession.invalidate();
		return "redirect:" + "/index.jsp";
		
//2.呼叫model
	//model值的存取
	
	//結果的轉導

		
	}
}
