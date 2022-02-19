package web.course.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.course.dao.CourseDaoInterface;
import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;

@Service
@Transactional
public class CourseServiceImpl implements CourseServiceInterface{
	
	@Autowired
	private CourseDaoInterface courseDao;
	
	@Override
	public List<CourseBean> findAll() {
		return courseDao.select();
	}
	
	@Override
	public Integer addCourse(CourseBean bean) {
		Integer result =null ;
		if(bean != null && bean.getExpertiseid() != null) {
			result = courseDao.insert(bean);
		}
		return result;
	}
	
	@Override
	public CourseBean modifyCourse(CourseBean bean) {
		CourseBean result = null;
		if(bean != null && bean.getExpertiseid() != null) {
			result = courseDao.update(bean);
		}
		return result;
	}

	@Override
	public boolean rmoveCourse(CourseBean bean) {
		boolean result = false;
		if(bean != null && bean.getExpertiseid() != null) {
			result = courseDao.delete(bean);
		}
		return result;
	}

	
}
