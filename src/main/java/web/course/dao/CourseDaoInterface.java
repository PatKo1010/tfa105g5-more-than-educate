package web.course.dao;

import java.util.List;

import web.course.entity.CourseBean;

public interface CourseDaoInterface {

	public CourseBean select(Integer courseid);

	public List<CourseBean> select();

	public CourseBean insert(CourseBean bean);

	public CourseBean update(Integer memid, Integer expertiseid, String coursetitle, String courseintro,
			Integer classamount, Integer price, Integer courseid);

	public boolean delete(Integer courseid);
	
	List<CourseBean> selectByMemID (Integer memId);
}
