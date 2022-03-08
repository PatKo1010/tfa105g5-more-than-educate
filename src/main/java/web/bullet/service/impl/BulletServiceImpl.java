package web.bullet.service.impl;

import java.util.ArrayList;
import java.util.List;

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
		if (id != null) {
			return dao.select(id);
		}
		return null;

	}

	@Override
	public BulletBean insert(BulletBean bean) {
		if (bean != null) {
			return dao.insert(bean);
		}
		return null;
	}

	@Override
	public boolean delete(BulletBean bean) {
		boolean result = false;
		if (bean != null && bean.getBulletId() != null) {
			result = dao.delete(bean.getBulletId());
		}
		return result;

	}

	@Override
	public List<BulletBean> select(BulletBean bean) {
		List<BulletBean> result = null;
		if (bean != null && bean.getBulletId() != null ) {
			BulletBean temp = dao.select(bean.getBulletId());
			if (temp != null) {
				result = new ArrayList<BulletBean>();
				result.add(temp);
			} else {
				result = dao.selectall();
			}
			return result;
			
		} else {
			return dao.selectall();
		}
		

	}

	@Override
	public List<BulletBean> selectByAdminId(BulletBean bean) {

		List<BulletBean> beanList = dao.adminFindById(bean.getAdminId());
		return beanList.isEmpty()?dao.selectall() : beanList;
	}

	@Override
	public List<BulletBean> selectall() {
	
		return dao.selectall();
	}

}
