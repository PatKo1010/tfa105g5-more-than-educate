package web.member.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import web.education.entity.EducationBean;
import web.education.service.impl.EducationService;
import web.member.entity.MemberBean;

@Controller
public class UpdateTeacherSkillsController {
//0.會用到的 (Service, AC)
	@Autowired
	private EducationService educationService;
	
//1.處理request(url設置) + 接收參數(&參數類型設定)
	@RequestMapping( path = {"/views/member/updateTeacherSkills"}, method = RequestMethod.POST, consumes = {"multipart/form-data"})
//	@RequestMapping( path = {"/views/member/updateTeacherSkills"}, method = RequestMethod.POST)
	public String handlerUpdateTeacherSkills(
		Model model, 
		java.sql.Date edustart, java.sql.Date eduend, String eduschool, String edudepart,
		@RequestPart(name="eduphoto", required=false) byte[] eduphoto, 
		HttpSession httpSession
	) {
		MemberBean memberBean = (MemberBean)httpSession.getAttribute("member");
//		System.out.println("1st" + educationBean);
//		
		//驗證輸入
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);
		if (eduschool.length() == 0) {
			errors.put("eduschool", "畢業學校不可為空");
		}
		if (edudepart.length() == 0) {
			errors.put("edudepart", "畢業系所不可為空");
		}
		if (edustart == null) {
			errors.put("edudstart", "入學日期不可為空");
		}
		if (eduend == null) {
			errors.put("eduend", "畢業日期不可為空");
		}
		if (eduphoto == null) {
			errors.put("eduphoto", "請上傳畢業證書");
		}

		if (!errors.isEmpty()) {
			return "/views/member/teacherSkills.jsp";
		}
		
//2.呼叫model
		//值的存取 (byXXXService)
		EducationBean educationBean = new EducationBean();
		educationBean.setMemid(memberBean.getMemid());
		educationBean.setEdustart(edustart);
		educationBean.setEduend(eduend);
		educationBean.setEduschool(eduschool);
		educationBean.setEdudepart(edudepart);
		educationBean.setEduphoto(eduphoto);
		
		EducationBean insertSkillResult = educationService.insert(educationBean);
		
////3.結局動作
		if (insertSkillResult == null) {
			return "/views/member/teacherSkills.jsp";  
		} else {
			return "redirect:" + "/views/member/teacherSkills.jsp";  //暫定跳回teacherProfile
		}

	}
	
}