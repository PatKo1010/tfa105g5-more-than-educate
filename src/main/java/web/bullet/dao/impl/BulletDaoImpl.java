package web.bullet.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import web.bullet.dao.BulletDaoInterface;
import web.bullet.entity.BulletBean;

@Repository
public class BulletDaoImpl implements BulletDaoInterface {
	@PersistenceContext
	private Session session;

	public Session getSession() {
		return this.session;
	}

	@Override
	public BulletBean insert(BulletBean bean) {
		if (bean.getBulletTitle() != null && bean.getBulletTitle().length() != 0 && bean.getBulletContent() != null
				&& bean.getBulletContent().length() != 0) {
			this.getSession().save(bean);
		}
		return bean;
	}

	@Override
	public BulletBean select(Integer id) {
		BulletBean bean = this.getSession().get(BulletBean.class, id);
		return bean;

	}

	@Override
	public boolean delete(Integer id) {
		if (id != null) {
			BulletBean temp = this.getSession().get(BulletBean.class, id);
			if (temp != null) {
				session.delete(temp);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<BulletBean> adminFindById(Integer adminId) {
		return session.createQuery("FROM BulletBean where admin_id = " + adminId, BulletBean.class).list();
	}

	@Override
	public List<BulletBean> selectall() {

		return session.createQuery("FROM BulletBean", BulletBean.class).list();

	}

}
