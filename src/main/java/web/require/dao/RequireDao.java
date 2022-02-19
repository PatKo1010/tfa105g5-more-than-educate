package web.require.dao;

import java.util.List;

import web.require.entity.RequireBean;

	

public interface RequireDao {

	
	
	public abstract RequireBean insert(RequireBean requireBean);
	
	public abstract RequireBean update(RequireBean requireBean) ;
	
	public abstract boolean delete(Integer require_id);
	
	public abstract RequireBean findByPrimaryKey(Integer require_id);
	
	public abstract List<RequireBean> getAll();





	
	
}
