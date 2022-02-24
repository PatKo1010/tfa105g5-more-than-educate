package web.orderInfo.dao;

import web.orderInfo.entity.CourseEntity;

public interface CourseDaoInterface {
	CourseEntity select(Integer courseId);	
}
