package web.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.reservation.entity.ReservTimeBean;
import web.reservation.service.ReservServiceInterface;

@RestController
@RequestMapping("reserv")
public class ReservController {
	@Autowired
	private ReservServiceInterface service;
	
	@PostMapping("selectByOrderID")
	public List<ReservTimeBean> select(@RequestBody ReservTimeBean bean) {
		List<ReservTimeBean> beans = service.selectMemberCourse(bean);
		System.out.println(beans);
//		for(ReservTimeBean b: beans) {
//			System.out.println(b.toString());
//		}
		return service.selectMemberCourse(bean);
	}
	
}
