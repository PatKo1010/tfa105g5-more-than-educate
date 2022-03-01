package web.favor.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;

import org.springframework.stereotype.Repository;

import web.favor.dao.FavorDaoInterface;
import web.favor.entity.FavorBean;




@Repository
public class FavorDao implements FavorDaoInterface {

	@PersistenceContext
	private Session session;
	
	//新增
		@Override
		public FavorBean insert(FavorBean favorBean) {
			session.save(favorBean);
			return favorBean;
		}
		
		//刪除
		@Override
		public  boolean delete(Integer favor_id) {
			session.delete(favor_id);
			return true;
		}
		
		//修改
		@Override
		public FavorBean update(FavorBean favorBean) {
			session.get(FavorBean.class, favorBean.getFavor_id());
			return favorBean;
			
		}
		
		//查詢(全部)
		@Override
		public List<FavorBean> getAll() {
			//createQuery 自訂查詢
			return session.createQuery("SELECT * FROM REQUIRE_LIST").list() ;
		}
		
		//查詢PK
		@Override
		public FavorBean findByPrimaryKey(Integer favor_id) {
			return session.get(FavorBean.class, favor_id);
		}

}
