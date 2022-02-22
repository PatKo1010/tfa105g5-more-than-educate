package web.orderDetail.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.orderDetail.entity.OrderDetailEntity;
import web.orderDetail.service.impl.OrderDetailServiceImpl;

@RestController
@RequestMapping("OrderDetail")
public class OrderDetailController {
	@Autowired
	private OrderDetailServiceImpl orderDetailService;
	
	@PostMapping("selectCourse")
	public List<OrderDetailEntity> selectCourseByTilte(@RequestBody OrderDetailEntity entity) {
		List<OrderDetailEntity> entities =  orderDetailService.listStudentCourses(entity);
		System.out.println(entities);
		return entities == null ? new ArrayList<OrderDetailEntity>(): entities;
	}
	
//	public OrderDetailEntity selectCourseByTilte (String title, HttpServletRequest req,HttpServletResponse res) throws IOException {
//		
//		req.setCharacterEncoding("UTF-8");
//		res.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = res.getWriter();
//		
//		System.out.println(title);
//		OrderDetailEntity entity =  orderDetailService.select(title);
//		if(entity!=null)
//		   out.println(entity);
//		else out.println("xxxxxxxxxxxxxxx");
//		return entity;
//		
//	}
}
