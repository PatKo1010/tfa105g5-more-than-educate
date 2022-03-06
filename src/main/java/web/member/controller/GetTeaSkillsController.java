package web.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import web.education.entity.EducationBean;
import web.education.service.impl.EducationService;
import web.member.service.impl.MemberService;

@Controller
public class GetTeaSkillsController {
	@Autowired
	private EducationService educationService; 
	@Autowired
	private MemberService memberService;
	
// ?id= {param1}
	@GetMapping( path = {"/views/member/getTeaSkills/id/{param1}"} )
	public String teaSkillsHandler(
			Model model,
			@PathVariable("param1") Integer id,
			HttpSession session) {
		
		System.out.println("success");
		EducationBean bean = educationService.selectByMember(id);
		session.setAttribute("education", bean);
//		System.out.println(bean);
		return "redirect:" + "/views/member/updateTeacherSkills.jsp";
	}
}