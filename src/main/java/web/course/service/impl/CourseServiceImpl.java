package web.course.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.course.dao.CourseDaoInterface;
import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;

@Service
@Transactional
public class CourseServiceImpl implements CourseServiceInterface {

	@Autowired
	private CourseDaoInterface courseDao;

	@Transactional
	public List<CourseBean> select(CourseBean bean) {
		List<CourseBean> result = null;
		if (bean != null && bean.getCourseid() != null && !bean.getCourseid().equals(0)) {
			CourseBean temp = courseDao.select(bean.getCourseid());
			if (temp != null) {
				result = new ArrayList<CourseBean>();
				result.add(temp);
			}
		} else {
			result = courseDao.select();
		}
		return result;
	}

	@Override
	public CourseBean addCourse(CourseBean bean) {
		CourseBean result = null;
		if (bean != null && bean.getCourseid() != null) {
			result = courseDao.insert(bean);
		}
		return result;
	}

	@Override
	public CourseBean modifyCourse(CourseBean bean) {
		CourseBean result = null;
		if (bean != null && bean.getCourseid() != null) {
			return courseDao.update(bean.getMemid(), bean.getExpertiseid(), bean.getCoursetitle(),
					bean.getCourseintro(), bean.getClassamount(), bean.getPrice(), bean.getCourseid());
		}
		return result;
	}

	@Override
	public boolean rmoveCourse(CourseBean bean) {
		boolean result = false;
		if (bean != null && bean.getCourseid() != null) {
			result = courseDao.delete(bean.getCourseid());
		}
		return result;
	}

	@Override
	public List<CourseBean> selectByMemId(CourseBean bean) {
		if (bean != null) {
			return courseDao.selectByMemID(bean.getMemid());
		}
		return null;
	}

}
