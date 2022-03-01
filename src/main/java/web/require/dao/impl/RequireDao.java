package web.require.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
import web.require.dao.RequireDaoInterface;
import web.require.entity.RequireBean;

@Repository
public class RequireDao implements RequireDaoInterface {

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
	public RequireBean findByPrimaryKey(Integer mem_id) {
		final String HQL = "FROM require_list where mem_id = :memid";
		List<RequireBean>result = session.createQuery(HQL, RequireBean.class).setParameter("memid", mem_id).list();
		for(RequireBean bean : result) {
		
		}
		
		return null;
	}
	
	
}
