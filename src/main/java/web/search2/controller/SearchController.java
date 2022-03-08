//package web.search.controller;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.MessageSource;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import web.member.entity.SubjectBean;
//import web.search.service.SubjectService;
//
//
//
//@Controller
//public class SearchController {
//	@Autowired
//	private SubjectService subjectService;
//	
//	@Autowired
//	private MessageSource messageSource;
//	@RequestMapping(
//			path = {"/search.controller"}
//	)
//	public String handlerMethod( Model model,HttpSession session) {
////接收資料
////驗證資料
////		Map<String, String> errors = new HashMap<String, String>();
////		model.addAttribute("errors", errors);
//		
////		if(username==null || username.length()==0) {
////			errors.put("username", messageSource.getMessage("login.username.required", null, locale));
////		}
////		if(password==null || password.length()==0) {
////			errors.put("password", messageSource.getMessage("login.password.required", null, locale));
////		}
//		
////		if(errors!=null && !errors.isEmpty()) {
////			return "/secure/login";
////		}
//		
////呼叫model
//		List<SubjectBean> list = subjectService.test();
//		
////根據model執行結果，導向view
//		if(list==null) {
//			return "/views/search/failpage";
//		} else {
//			session.setAttribute("subject", list);
//			System.out.println(list);
//			return "redirect:/";
//		}
//
////				List<?> select = subjectService.test();	
////				System.out.println(select);
//	}
//}