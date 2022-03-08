package web.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;
import web.orderInfo.entity.OrderInfoEntity;
import web.orderInfo.service.OrderInfoServiceInterface;

@RestController
public class CourseDelete {

	@Autowired
	private CourseServiceInterface courseServiceInterface;
	@Autowired
	private OrderInfoServiceInterface orderInfoService;

	@PostMapping(path = { "/views/course.delete" })
	public String delete(Model model, @RequestBody CourseBean bean) {
		
		System.out.println(bean);

		List<OrderInfoEntity> orderList = orderInfoService.selectOrderByCourseId(bean);
		System.out.println(orderList);

		if (orderList != null && orderList.size() != 0) {
			return Boolean.toString(false);
			
		} else {			
			Boolean result = courseServiceInterface.rmoveCourse(bean);
			return result.toString();
		}

	}
}
