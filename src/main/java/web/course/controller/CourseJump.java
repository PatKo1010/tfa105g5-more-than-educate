package web.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.course.entity.CourseBean;

@Controller
public class CourseJump {

	@RequestMapping(path = {"/views/course.jump"})
	public String jump(CourseBean bean, Model model) {
		
		
		return "redirect: /views/course/CourseUpdate.jsp";
	}
}
