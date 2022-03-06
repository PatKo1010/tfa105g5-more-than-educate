package web.education.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import web.education.entity.EducationBean;
import web.education.service.impl.EducationService;
import web.member.entity.MemberBean;

@RestController
public class GetPhotoController {
	@Autowired
	private EducationService eduService;
	
	@GetMapping("/views/education/getPhotoController")
//	@ResponseBody
	public byte[] getPhoto(HttpSession session) {
//		System.out.println("into photo controller");
		MemberBean memberBean = (MemberBean)session.getAttribute("member");
		EducationBean eduBean = eduService.selectByMember(memberBean.getMemid());
		return eduBean.getEduphoto();
	}
	
}