package web.orderInfo.service;

import java.util.List;
import java.util.Map;

import web.course.entity.CourseBean;
import web.orderInfo.entity.OrderInfoEntity;

public interface OrderInfoServiceInterface {
	Map<String, Object> insertOrderReserved(Integer courseId, Integer memId);
	List<OrderInfoEntity> selectOrderByCourseId (CourseBean bean);
}
