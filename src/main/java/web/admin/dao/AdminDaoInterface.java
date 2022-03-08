package web.admin.dao;

import java.util.List;

import web.admin.entity.AdminBean;

public interface AdminDaoInterface {
	AdminBean login(AdminBean bean);
	AdminBean insert(AdminBean bean);
	
	
}
