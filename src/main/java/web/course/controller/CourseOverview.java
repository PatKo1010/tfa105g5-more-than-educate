package web.course.controller;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;
import web.member.entity.MemberBean;

@RestController
public class CourseOverview {

	@Autowired
	private CourseServiceInterface courseServiceInterface;

	@PostMapping(path = { "/views/course.overview" })
	public List<CourseBean> Overview(HttpSession session) {

		MemberBean mBean = (MemberBean)session.getAttribute("member");
		List<CourseBean> result = courseServiceInterface.selectByMemId(mBean);
		return result == null ? Collections.emptyList() : result;

	}
}
