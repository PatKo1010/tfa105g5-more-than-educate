package web.course.service;

import java.util.List;

import web.course.entity.CourseBean;

public interface CourseServiceInterface {

	public CourseBean addCourse(CourseBean bean);
	
	public CourseBean modifyCourse(CourseBean bean);
	
	public boolean rmoveCourse(CourseBean bean);
	
	public List<CourseBean> select(CourseBean bean);
	
	public List<CourseBean> selectByMemId (CourseBean bean);
	
}
