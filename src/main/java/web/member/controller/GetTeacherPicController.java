package web.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

@RestController
public class GetTeacherPicController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/getTeahcerPic")
	public byte[] getTeacherPic ( @RequestParam String memid ) {
		System.out.println(memid);
		MemberBean result = memberService.selectByMemId(Integer.parseInt(memid));
		return result.getPhoto();
	}

}
