package web.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.member.entity.MemberBean;

@Controller
public class GetProfilePhotoController {
	
	@RequestMapping( path={"/views/member/getProfilePhotoController"} )
	@ResponseBody
	public byte[] getProfilePhoto( HttpSession httpSession ) {
//		System.out.println("into GetProfilePhoto");
		MemberBean memberBean = (MemberBean)httpSession.getAttribute("member");
		return memberBean.getPhoto();
	}
}
