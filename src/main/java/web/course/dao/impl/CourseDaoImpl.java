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
	public CourseBean select(Integer expertiseid) {
		
		return this.select(expertiseid);
	}

	@Override
	public List<CourseBean> select() {
		return this.select();
	}

	@Override
	public Integer insert(CourseBean bean) {
			return (Integer) session.save(bean);
		}


	@Override
	public CourseBean update(CourseBean bean) {
		return this.update(bean);
	}

	@Override
	public boolean delete(CourseBean bean) {
		return this.delete(bean);
	}

}
