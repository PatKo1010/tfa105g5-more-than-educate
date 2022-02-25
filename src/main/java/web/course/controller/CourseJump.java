package web.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.course.entity.CourseBean;

@Controller
public class CourseJump {

	@RequestMapping(path = {"/views/course.jump.update"})
	public String jumpUpdate(CourseBean bean, Model model) {
		model.addAttribute("courseid",bean.getCourseid());
		model.addAttribute("memid", bean.getMemid());
		model.addAttribute("expertiseid", bean.getExpertiseid());
		model.addAttribute("coursetitle", bean.getCoursetitle());
		model.addAttribute("courseintro", bean.getCourseintro());
		model.addAttribute("classamount", bean.getClassamount());
		model.addAttribute("price", bean.getPrice());
		
		return "/views/course/CourseUpdate.jsp";
	}
	
//	@RequestMapping(path = {"/views/course.jump.insert"})
//	public String jumpInsert(CourseBean bean, Model model) {
//		model.addAttribute("memid",bean.getMemid());
//		
//		return "/views/course/CourseInsert.jsp";
//	}
}
