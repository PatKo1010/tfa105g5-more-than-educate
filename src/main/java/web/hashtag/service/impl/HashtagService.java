package web.hashtag.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import configuration.SpringJavaConfig;
import web.course.entity.CourseBean;
import web.education.entity.EducationBean;
import web.hashtag.dao.HashtagDaoInterface;
import web.hashtag.entity.HashtagBean;
import web.member.entity.MemberBean;


@Service
@Transactional
public class HashtagService {

	@Autowired
	private HashtagDaoInterface hashtagDao;

	public HashtagService(HashtagDaoInterface hashtagDao) {
		this.hashtagDao = hashtagDao;
	}

	public List<MemberBean> findTeacherTest(String name) {
		return hashtagDao.findTeacher(name);
	}
	
	public List<MemberBean> findTeacherTest2(String hashtag) {
		return hashtagDao.findTeacher2(hashtag);
	}
	public  List<MemberBean> orderGoodTeacher(List <MemberBean> members){
		return hashtagDao.orderGoodTeacher(members);
	}
	public  List<MemberBean> orderNewTeacher(List <MemberBean> members){
		return hashtagDao.orderNewTeacher(members);
	}
	public MemberBean showTeacher(Integer id){
		return hashtagDao.showTeacher(id);
	}
	
	public List<CourseBean> showCourse(Integer id){
		
		return hashtagDao.showCourse(id);
	}
	
	public EducationBean showEducation(Integer id){
		
		return hashtagDao.showEducation(id);
	}
}