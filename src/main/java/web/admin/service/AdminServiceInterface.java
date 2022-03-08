package web.admin.service;

import web.admin.entity.AdminBean;

public interface AdminServiceInterface {
	
	AdminBean login(AdminBean bean);
	AdminBean insert(AdminBean bean);
	

}
