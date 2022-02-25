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
public class CourseInsert {

	@Autowired
	private CourseServiceInterface courseServiceImpl;

	@RequestMapping(path = { "/views/course.insert" })
	public String insert (Model model, String courseid, String memid, String expertiseid, String coursetitle,
			String courseintro, String classamount, String price, CourseBean bean) {

		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);

//		if (courseid == null || courseid.length() == 0) {
//			errors.put("courseid", "請重新輸入");
//		}

		if (memid == null || memid.length() == 0) {
			errors.put("memid", "請重新輸入");
		}

		if (expertiseid == null || expertiseid.length() == 0) {
			errors.put("expertiseid", "請重新輸入");
		}

		if (coursetitle == null || coursetitle.length() <= 10) {
			errors.put("coursetitle", "標題不得少於10字");
		}

		if (courseintro == null || courseintro.length() <= 30) {
			errors.put("courseintro", "簡介不得少於30字");
		}

		if (classamount == null || classamount.length() == 0) {
			errors.put("classamount", "重新輸入");
		}

		if (price == null || price.length() == 0) {
			errors.put("price", "重新輸入");
		}

		if (errors != null && !errors.isEmpty()) {
			return "/views/course/CourseInsert.jsp";
		} else {
			courseServiceImpl.addCourse(bean);
			return "redirect:/views/course/CourseOverview1.html";
		}
	}

}
