package web.bullet.service;

import java.util.List;

import web.bullet.entity.BulletBean;


public interface BulletServiceInterface {
	public abstract BulletBean select(Integer id);
	public abstract BulletBean insert(BulletBean bean);
}
