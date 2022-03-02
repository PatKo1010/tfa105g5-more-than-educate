package web.favor.dao;

import java.util.List;

import web.favor.entity.FavorBean;

public interface FavorDaoInterface {

	
	
	public abstract FavorBean insert(FavorBean favorBean);
	
	public abstract FavorBean update(FavorBean favorBean) ;
	
	public abstract boolean delete(Integer favor_id);
	
	public abstract FavorBean findByPrimaryKey(Integer favor_id);
	
	public abstract List<FavorBean> getAll();

	
}
