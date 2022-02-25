package web.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;

@Controller
public class CourseDelete {

	@Autowired
	private CourseServiceInterface courseServiceInterface;
	
	@RequestMapping(path = {"/views/course.delete"})
	public String delete(Model model, CourseBean bean) {
		System.out.println("hehehehe");
		boolean result = courseServiceInterface.rmoveCourse(bean);
		if(!result) {
			model.addAttribute("delete", 0);
		}else {
			model.addAttribute("delete", 1);
		}
		return "redirect:/views/course/CourseOverview1.html";
	}
}
