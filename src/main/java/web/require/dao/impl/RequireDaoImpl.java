package web.require.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
import web.require.dao.RequireDao;
import web.require.entity.RequireBean;

@Repository
public class RequireDaoImpl implements RequireDao {

	@PersistenceContext
	private Session session;

	//新增
	@Override
	public RequireBean insert(RequireBean requireBean) {
		session.save(requireBean);
		return requireBean;
	}
	
	//刪除
	@Override
	public  boolean delete(Integer require_id) {
		session.delete(require_id);
		return true;
	}
	
	//修改
	@Override
	public RequireBean update(RequireBean requireBean) {
		session.get(RequireBean.class, requireBean.getRequire_id());
		return requireBean;
		
	}
	
	//查詢(全部)
	@Override
	public List<RequireBean> getAll() {
		//createQuery 自訂查詢
		return session.createQuery("SELECT * FROM REQUIRE_LIST").list() ;
	}
	
	//查詢PK
	@Override
	public RequireBean findByPrimaryKey(Integer require_id) {
		return session.get(RequireBean.class, require_id);
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		//delete
		RequireDao dao =  context.getBean("requireDaoImpl",RequireDaoImpl.class);
		System.out.println(dao.delete(9));
		
		
		((ConfigurableApplicationContext) context).close();
		
	}


	
	
	
}
