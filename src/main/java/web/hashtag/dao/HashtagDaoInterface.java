package web.hashtag.dao;

import java.util.List;

import web.course.entity.CourseBean;
import web.hashtag.entity.HashtagBean;
import web.member.entity.MemberBean;

public interface HashtagDaoInterface {

	
	
	public abstract HashtagBean insert(HashtagBean hashtagBean);
	
	public abstract HashtagBean update(HashtagBean hashtagBean) ;
	
	public abstract boolean delete(Integer hashtag_id);
	
	public abstract HashtagBean findByPrimaryKey(Integer hashtag_id);
	
	public abstract MemberBean showTeacher(Integer id);
	
	public abstract List<MemberBean> findTeacher2(String hashtag);
	
	public  List<MemberBean> findTeacher(String name);
	
	public abstract List<MemberBean> orderGoodTeacher(List <MemberBean> members);
	
	public abstract List<MemberBean> orderNewTeacher(List <MemberBean> members);
	
	public abstract List<CourseBean> showCourse(Integer id);
}
