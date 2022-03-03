package web.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.course.entity.CourseBean;
import web.course.entity.vCourseMemberBean;
import web.course.service.CourseServiceInterface;

@Controller
public class CourseJump {
	@Autowired
	private CourseServiceInterface courseService;

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
	
	@GetMapping("/views/courseDetail")
	public String jumpSelectByCourseId(Model model, Integer courseId) {
		vCourseMemberBean bean = courseService.selectByCourseId(courseId);
		model.addAttribute("course", bean);
		return "/views/course/CourseDetail.jsp";
	}
	
	@GetMapping("/course/getMemberImg")
	@ResponseBody
	public byte[] getMemberImg(Model model, Integer courseid) {
		vCourseMemberBean bean = courseService.selectByCourseId(courseid);
		return bean.getPhoto();
	}
	
}
