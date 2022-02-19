package web.require.service;

import web.require.entity.RequireBean;

public interface RequireServiceInterface {
	public abstract RequireBean select(Integer require_id);
	
}
