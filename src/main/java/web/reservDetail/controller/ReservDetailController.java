package web.reservDetail.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.member.entity.MemberBean;
import web.reservDetail.entity.ReservDetailWithRank;
import web.reservDetail.service.ReservDetailServiceInterface;

@RestController
@RequestMapping("views/teacher")
public class ReservDetailController {
	@Autowired
	ReservDetailServiceInterface reservDetailService;
	
	@PostMapping("reservedTime")
	public List<ReservDetailWithRank> getReservedTime(Model model, @RequestBody MemberBean bean ) {
		System.out.println(bean);
		if (bean != null) {
			List<ReservDetailWithRank> reservedTimes = reservDetailService.getTeacherReservedTime(bean);
			return reservedTimes == null? new ArrayList<ReservDetailWithRank>(): reservedTimes;
		}
		
		return new ArrayList<ReservDetailWithRank>();
	}

}
