package web.course.dao;

import java.util.List;

import web.course.entity.CourseBean;

public interface CourseDaoInterface {

	public CourseBean select(Integer expertiseid);
	
	public List<CourseBean> select();
	
	public CourseBean insert(CourseBean bean);
	
	public CourseBean update(CourseBean bean);
	
	public boolean delete(CourseBean bean);
}
