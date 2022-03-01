package web.course.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;

@RestController
public class CourseOverview {

	@Autowired
	private CourseServiceInterface courseServiceInterface;
	
	@PostMapping(path = {"/views/course.overview"})
	public List<CourseBean> Overview (@RequestBody CourseBean bean) {

		List<CourseBean> result = courseServiceInterface.selectByMemId(bean);
		return result == null ? new ArrayList<CourseBean>() :result ;

	}
}
