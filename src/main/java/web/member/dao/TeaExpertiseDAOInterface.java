package web.member.dao;

import java.util.List;

import web.member.entity.TeaExpertiseBean;

public interface TeaExpertiseDAOInterface {
	
	//1.新增
	public abstract TeaExpertiseBean insert(TeaExpertiseBean teaExpertiseBean);
	
	//2.刪除
	public abstract boolean delete(Integer teaexpertiseid);
	
	//3.修改
	public abstract TeaExpertiseBean update(TeaExpertiseBean teaExpertiseBean);
	
	//4a.查詢(單)
	public abstract TeaExpertiseBean select(Integer teaexpertiseid);
	
	//4b.查詢(多)
	public abstract List<TeaExpertiseBean> select();
	
}
