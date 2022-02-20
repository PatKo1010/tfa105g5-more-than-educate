package web.course.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;

@Controller
public class CourseInsert {

	@Autowired
	private CourseServiceInterface courseServiceInterface;

	@RequestMapping(path = { "/views/course.insert" })
	public String insert(String memid, String expertiseid, String coursetitle, String courseintro, String classamount,
			String price, Model model, HttpSession session, CourseBean bean) {

		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);

		if (memid == null || memid.length() == 0) {
			errors.put("memid", "重新輸入");
		}
		if (expertiseid == null || expertiseid.length() == 0) {
			errors.put("expertiseid", "重新輸入");
		}
		if (coursetitle == null || coursetitle.length() == 0) {
			errors.put("coursetitle", "重新輸入");
		}
		if (courseintro == null || courseintro.length() == 0) {
			errors.put("courseintro", "重新輸入");
		}
		if (classamount == null || classamount.length() == 0) {
			errors.put("classamount", "重新輸入");
		}
		if (price == null || price.length() == 0) {
			errors.put("price", "重新輸入");
		}

		if (errors != null && !errors.isEmpty()) {
			return "/views/course/TeacherCourse.html";
		} else {
			
			Integer add = courseServiceInterface.addCourse(bean);
			
			return "redirect:/views/course/Test.jsp";
		}

	}

}
