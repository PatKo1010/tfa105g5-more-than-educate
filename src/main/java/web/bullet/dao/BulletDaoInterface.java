package web.bullet.dao;

import java.util.List;

import web.bullet.entity.BulletBean;

public interface BulletDaoInterface {

	BulletBean select(Integer id);

	BulletBean insert(BulletBean bean);

	boolean delete(Integer id);

	List<BulletBean> adminFindById(Integer adminId);

	List<BulletBean> selectall();

}
