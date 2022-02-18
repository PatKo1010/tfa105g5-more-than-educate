package web.course.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;

@RestController
@RequestMapping("CourseInsert")
public class CourseInsert {
	@Autowired
	private CourseServiceInterface courseService;
	
	public String insert(String memid, String expertiseid, String coursetitle, String courseintro, String classamount, String price, Model model, HttpSession session) {
		
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);
		
		if(memid == null || memid.length() == 0) {
			errors.put("memid", "重新輸入");
		}
		if(expertiseid == null || expertiseid.length() == 0) {
			errors.put("expertiseid", "重新輸入");
		}
		if(coursetitle == null || coursetitle.length() <= 10) {
			errors.put("coursetitle", "重新輸入");
		}
		if(courseintro == null || courseintro.length() <= 10) {
			errors.put("courseintro", "重新輸入");
		}
		if(classamount == null || classamount.length() == 0) {
			errors.put("classamount", "重新輸入");
		}
		if(price == null || price.length() == 0) {
			errors.put("price", "重新輸入");
		}
		
		if (errors != null && !errors.isEmpty()) {
			return "forward:/views/course/TeacherCourse.html";
		}
		
		return "forward:/views/course/TeacherCourse.html";
	}
	
	@PostMapping("courseInsert")
	public CourseBean insert(@RequestBody CourseBean bean) {
		bean = courseService.addCourse(bean);
		return bean ;
	}
	
}
