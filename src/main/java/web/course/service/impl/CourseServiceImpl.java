package web.course.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.course.dao.CourseDaoInterface;
import web.course.entity.CourseBean;
import web.course.entity.vCourseMemberBean;
import web.course.service.CourseServiceInterface;
import web.member.dao.impl.MemberDAO;
import web.member.entity.MemberBean;

@Service
@Transactional
public class CourseServiceImpl implements CourseServiceInterface {
	@Autowired
	private CourseDaoInterface courseDao;
	@Autowired
	private MemberDAO memberDao;


	@Transactional
	@Override
	public vCourseMemberBean selectByCourseId(Integer courseId) {
		if (courseId == null) {
			return null;
		}
		
		return courseDao.select(courseId);
	}

	@Override
	public CourseBean addCourse(CourseBean bean) {
		CourseBean result = null;
		if (bean != null && bean.getExpertiseid() != null) {
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
	public List<CourseBean> selectByMemId(MemberBean bean) {
		if (bean != null) {
			return courseDao.selectByMemID(bean.getMemid());
		}
		return null;
	}

	@Override
	public byte[] findMemberImg(Integer courseid) {
		if (courseid != null) {
			vCourseMemberBean bean = courseDao.select(courseid);
			if (bean != null) {
				return bean.getPhoto();
			}
		}
		return null;
	}

	@Override
	public List<vCourseMemberBean> selectByCourseId(vCourseMemberBean bean) {
		if(bean != null) {
			return courseDao.selectByCourseId(bean.getCourseid());
		}
		return null;
	}

}
