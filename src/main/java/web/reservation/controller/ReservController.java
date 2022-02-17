package web.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import web.reservation.entity.ReservTimeBean;
import web.reservation.service.ReservServiceInterface;

@RestController
@RequestMapping("reserv")
public class ReservController {
	@Autowired
	private ReservServiceInterface service;
	
	@GetMapping("selectById")
	public ReservTimeBean select(Integer id) {
		return service.select(id);
	}

}
