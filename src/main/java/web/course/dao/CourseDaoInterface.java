package web.course.dao;

import java.util.List;

import web.course.entity.CourseBean;
import web.course.entity.vCourseMemberBean;

public interface CourseDaoInterface {

	public vCourseMemberBean select(Integer courseid);

	public List<CourseBean> select();

	public CourseBean insert(CourseBean bean);

	public CourseBean update(Integer memid, Integer expertiseid, String coursetitle, String courseintro,
			Integer classamount, Integer price, Integer courseid);

	public boolean delete(Integer courseid);

	public List<CourseBean> selectByMemID(Integer memId);
	
	public List<vCourseMemberBean> selectByCourseId(Integer courseid);

}
