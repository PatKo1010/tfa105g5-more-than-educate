package web.course.service;

import java.util.List;

import web.course.entity.CourseBean;
import web.course.entity.vCourseMemberBean;
import web.member.entity.MemberBean;

public interface CourseServiceInterface {

	public CourseBean addCourse(CourseBean bean);

	public CourseBean modifyCourse(CourseBean bean);

	public boolean rmoveCourse(CourseBean bean);

	public vCourseMemberBean selectByCourseId(Integer courseId);

	public List<CourseBean> selectByMemId(MemberBean bean);
	
	public List<vCourseMemberBean> selectByCourseId(vCourseMemberBean bean);
	
	public byte[] findMemberImg(Integer courseid);

}
