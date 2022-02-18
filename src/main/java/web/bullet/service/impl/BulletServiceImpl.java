package web.bullet.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.bullet.dao.BulletDaoInterface;
import web.bullet.entity.BulletBean;
import web.bullet.service.BulletServiceInterface;

@Service
@Transactional
public class BulletServiceImpl implements BulletServiceInterface {

	@Autowired
	private BulletDaoInterface dao;

	@Override
	public BulletBean select(Integer id) {
		return dao.select(id);
	}
	@Override
	public BulletBean insert(BulletBean bean) {
		BulletBean result=null;
		if(bean!=null && bean.getAdminId()!=null) {
			result=dao.insert(bean);
		}
		return result;
	}
	
}
