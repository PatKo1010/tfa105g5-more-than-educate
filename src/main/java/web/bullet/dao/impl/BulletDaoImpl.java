package web.bullet.dao.impl;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
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
	public List<BulletBean> getAllBullets() {
        return session.createQuery("from bullet").list();
    }

	@Override
	public BulletBean insert(BulletBean bean) {
		session.save(bean);
		return bean;
	}
	
	@Override
	public BulletBean select(Integer id) {
		return this.getSession().get(BulletBean.class, id);
	}
	
	@Override
	public boolean delete(Integer bulletId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BulletBean update(Integer bulletId, String bulletContent, LocalDateTime bulletTime, String bulletTitle) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		BulletDaoImpl daoImpl = context.getBean("bulletDaoImpl", BulletDaoImpl.class);
		
		
		daoImpl.select(2);
		
		((ConfigurableApplicationContext)context).close();
		
	}
	

}
