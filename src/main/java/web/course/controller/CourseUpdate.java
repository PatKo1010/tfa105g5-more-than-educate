package web.course.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;

@Controller
public class CourseUpdate {

	@Autowired
	private CourseServiceInterface courseServiceInterface;

	@RequestMapping(path = { "/views/course.update" })
	public String update(Model model, CourseBean bean) {
		
		model.addAttribute("courseid",bean.getCourseid());
		model.addAttribute("memid", bean.getMemid());
		model.addAttribute("expertiseid", bean.getExpertiseid());
		model.addAttribute("coursetitle", bean.getCoursetitle());
		model.addAttribute("courseintro", bean.getCourseintro());
		model.addAttribute("classamount", bean.getClassamount());
		model.addAttribute("price", bean.getPrice());
		
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);

		if (bean.getCourseid() == null) {
			errors.put("courseid", "請重新輸入");
		}

		if (bean.getMemid() == null) {
			errors.put("memid", "請重新輸入");
		}

		if (bean.getExpertiseid() == null) {
			errors.put("expertiseid", "請重新輸入");
		}

		if (bean.getCoursetitle() == null || bean.getCoursetitle().length() <= 10) {
			errors.put("coursetitle", "標題不得少於10字");
		}

		if (bean.getCourseintro() == null || bean.getCourseintro().length() <= 30) {
			errors.put("courseintro", "簡介不得少於30字");
		}

		if (bean.getClassamount() == null) {
			errors.put("classamount", "重新輸入");
		}

		if (bean.getPrice() == null) {
			errors.put("price", "重新輸入");
		}

		if (errors != null && !errors.isEmpty()) {
			return "/views/course/CourseUpdate.jsp";
		}
		courseServiceInterface.modifyCourse(bean);

		return "redirect:/views/course/course.jsp";
	}
}
