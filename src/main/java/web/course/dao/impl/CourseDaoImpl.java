package web.course.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import web.course.dao.CourseDaoInterface;
import web.course.entity.CourseBean;

@Repository
public class CourseDaoImpl implements CourseDaoInterface {

	@PersistenceContext
	private Session session;

	public Session getSession() {
		return session;
	}

	@Override
	public CourseBean select(Integer courseid) {
		if (courseid != null) {
			return this.getSession().get(CourseBean.class, courseid);
		}
		return null;
	}

	@Override
	public List<CourseBean> select() {
		return this.getSession().createQuery("from CourseBean", CourseBean.class).list();
	}

	@Override
	public CourseBean insert(CourseBean bean) {
		if (bean != null && bean.getCourseid() != null) {
			CourseBean temp = this.getSession().get(CourseBean.class, bean.getCourseid());
			if (temp == null) {
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}

	@Override
	public CourseBean update(Integer memid, Integer expertiseid, String coursetitle, String courseintro,
			Integer classamount, Integer price, Integer courseid) {
		if (courseid != null) {
			CourseBean temp = this.getSession().get(CourseBean.class, courseid);
			if (temp != null) {
				temp.setMemid(memid);
				temp.setExpertiseid(expertiseid);
				temp.setCoursetitle(coursetitle);
				temp.setCourseintro(courseintro);
				temp.setClassamount(classamount);
				temp.setPrice(price);
				return (CourseBean)this.getSession().merge(temp);
			}
		}
		
		return null;
	}

	@Override
	public boolean delete(Integer courseid) {
		if(courseid != null) {
			CourseBean temp = this.getSession().get(CourseBean.class, courseid);
			if(temp != null) {
				this.getSession().delete(temp);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<CourseBean> selectByMemID(Integer memId) {
		return this.session.createQuery("From CourseBean where memid=:XXX", CourseBean.class)
				.setParameter("XXX", memId).list();
	}

}
