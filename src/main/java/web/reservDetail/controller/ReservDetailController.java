package web.reservDetail.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("reservedTime")
	public List<ReservDetailWithRank> getReservedTime(HttpSession session) {
		MemberBean bean = (MemberBean) session.getAttribute("member");
		if (bean != null) {
			List<ReservDetailWithRank> reservedTimes = reservDetailService.getTeacherReservedTime(bean);
			return reservedTimes == null? new ArrayList<ReservDetailWithRank>(): reservedTimes;
		}
		
		return new ArrayList<ReservDetailWithRank>();
	}

}
