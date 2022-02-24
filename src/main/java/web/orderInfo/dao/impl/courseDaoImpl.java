package web.orderInfo.dao.impl;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import web.orderInfo.dao.CourseDaoInterface;
import web.orderInfo.entity.CourseEntity;

@Repository("courseDaoImplTwo")
public class courseDaoImpl implements CourseDaoInterface{
	
	@PersistenceContext
	private Session session;
	public Session getSession() {
		return this.session;
	}

	@Override
	public CourseEntity select(Integer courseId) {
		return this.getSession().get(CourseEntity.class, courseId);
	}
		

}
