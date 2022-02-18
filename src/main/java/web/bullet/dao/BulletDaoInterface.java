package web.bullet.dao;

import java.time.LocalDateTime;
import java.util.List;
import web.bullet.entity.BulletBean;

public interface BulletDaoInterface {
	
	public abstract BulletBean select(Integer id);
	public abstract List<BulletBean> getAllBullets ();
	public abstract BulletBean insert(BulletBean bean);
	public abstract boolean delete(Integer bulletId);
	public abstract BulletBean update
	(Integer bulletId, String bulletContent, LocalDateTime bulletTime,String bulletTitle);
}

