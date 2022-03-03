package web.member.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

@Controller
public class RegiTeacherController {

//0.用到的(AC, Service)
	@Autowired
	private MemberService memberService;

//1.處理request(url設置) +接收參數
	@RequestMapping( path= {"views/member/regiTeacher"}, method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public String handlerTeacherUpdate(Model model, 
			Integer memID, String email, String password, String username, String phonenum,
			String teatitle, Integer subjectid, Boolean teaqual, java.sql.Date regdate,
			String introcontent,
			@RequestPart(name = "image", required = false) byte[] image,
			HttpSession httpSession ) {
		
//		System.out.println(subjectid);
//		return ""; 
		//httpSession.getAttribute();
		MemberBean memberBean = (MemberBean)httpSession.getAttribute("member");
	
		//驗證輸入
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);
		//保存subjectid的值
		model.addAttribute("subjectid",subjectid);
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
			errors.put("phonenum", "請輸入電話號碼");
		}
		if (teatitle.length() == 0) {
			errors.put("teatitle", "請輸入江湖稱號");
		}
		if (subjectid == 0 || subjectid == null) {
			errors.put("subjectid", "請選擇科目");
		}
		if (introcontent.length() == 0) {
			errors.put("introcontent", "請輸入自介");
		}
		if (!errors.isEmpty()) {
			return "/views/member/teacherProfile.jsp";
		}
		//teaqual直接設為true
		//regdate設為當下日期

//2.呼叫model
		//值的存改 (byXXXService)
		memberBean.setMemid(memID);
		memberBean.setPhoto(image);
		memberBean.setEmail(email);
		memberBean.setPassword(password);
		memberBean.setUsername(username);
		memberBean.setPhonenum(phonenum);
		
		memberBean.setTeatitle(teatitle);
		memberBean.setSubjectid(subjectid);
		memberBean.setIntrocontent(introcontent);
		memberBean.setTeaqual(true);
		memberBean.setRegdate( new Date(System.currentTimeMillis()) );  //當下日期!!
	
		//memberService.update(memberBean);
		MemberBean tUpdateResult = memberService.update(memberBean);
		httpSession.setAttribute("member", tUpdateResult);
		
//3.結局動作 (e.g. model結果)
		if (tUpdateResult == null) {
			return "/views/member/regiTeacherProfile.jsp";
		} else {
			return "redirect:" + "/views/member/regiTeacherSkills.jsp";
		}
	}

}