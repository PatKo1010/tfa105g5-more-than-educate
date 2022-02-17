package web.reservation.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.reservation.dao.ReservDaoInterface;
import web.reservation.entity.ReservTimeBean;
import web.reservation.service.ReservServiceInterface;

@Service
@Transactional
public class ReservServiceImpl implements ReservServiceInterface {
	
	@Autowired
	private ReservDaoInterface dao;
	
	
	@Override
	public ReservTimeBean select(Integer id) {
		return dao.select(id);
	}
	
}
