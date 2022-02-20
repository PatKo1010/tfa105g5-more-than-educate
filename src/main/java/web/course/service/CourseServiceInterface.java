package web.course.service;

import java.util.List;

import web.course.entity.CourseBean;

public interface CourseServiceInterface {

	Integer addCourse(CourseBean bean);
	
	CourseBean modifyCourse(CourseBean bean);
	
	boolean rmoveCourse(CourseBean bean);
	
	List<CourseBean> findAll();
	
}
