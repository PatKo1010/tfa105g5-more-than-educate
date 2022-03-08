package web.bullet.service;

import java.util.List;

import web.bullet.entity.BulletBean;

public interface BulletServiceInterface {
	BulletBean select(Integer id);

	BulletBean insert(BulletBean bean);

	boolean delete(BulletBean bean);

	List<BulletBean> select(BulletBean bean);

	List<BulletBean> selectByAdminId(BulletBean bean);
	
	List<BulletBean>selectall();
	

}
