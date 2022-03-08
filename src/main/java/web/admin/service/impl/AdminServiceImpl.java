package web.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.admin.dao.AdminDaoInterface;
import web.admin.entity.AdminBean;
import web.admin.service.AdminServiceInterface;

@Service
@Transactional
public class AdminServiceImpl implements AdminServiceInterface{
	@Autowired
	private AdminDaoInterface dao;
	
	@Override
	public AdminBean login(AdminBean bean) {
		if(bean!=null) {
			return dao.login(bean);
		}
		return null;
	}
	@Override
	public AdminBean insert(AdminBean bean) {
		if(bean!=null) {
			return dao.insert(bean);
		}
		return null;
	}


}
