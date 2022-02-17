package web.member.service.impl;

import java.util.List;

import web.member.dao.impl.TeaExpertiseDAO;
import web.member.entity.TeaExpertiseBean;

public class TeaExpertiseService {
	
	private TeaExpertiseDAO teaExpertiseDAO;
	public TeaExpertiseService(TeaExpertiseDAO teaExpertiseDAO) {
		this.teaExpertiseDAO = teaExpertiseDAO;
	}
	
	//1.新增
	public TeaExpertiseBean insert(TeaExpertiseBean teaExpertiseBean) {
		if (teaExpertiseBean != null && teaExpertiseBean.getTeaexpertiseid() != null) {
			return teaExpertiseDAO.insert(teaExpertiseBean);
		}
		return null;
	}
	
	//2.刪除
	public boolean delete(TeaExpertiseBean teaExpertiseBean) {
		if (teaExpertiseBean != null && teaExpertiseBean.getTeaexpertiseid() != null) {
			return teaExpertiseDAO.delete( teaExpertiseBean.getTeaexpertiseid() );
		}
		return false;
	}
	
	//3.修改
	public TeaExpertiseBean update(TeaExpertiseBean teaExpertiseBean) {
		if (teaExpertiseBean != null && teaExpertiseBean.getTeaexpertiseid() != null) {
			return teaExpertiseDAO.update(teaExpertiseBean);
		}
		return null;
	}
	
	//4a.查詢(單)
	public TeaExpertiseBean select(TeaExpertiseBean teaExpertiseBean) {
		if (teaExpertiseBean != null) {
			return teaExpertiseDAO.select(teaExpertiseBean.getTeaexpertiseid());
		}
		return null;
	}
	
	//4b.查詢(多)
	public List<TeaExpertiseBean> select() {
		return teaExpertiseDAO.select();
	}
	
	
}
