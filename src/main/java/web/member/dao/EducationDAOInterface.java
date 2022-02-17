package web.member.dao;

import java.util.Date;
import java.util.List;

import web.member.entity.EducationBean;

public interface EducationDAOInterface {

	//1.新增
	public abstract EducationBean insert(EducationBean educationBean);
	
	//2.刪除
	public abstract boolean delete(Integer eduid);
	
	//3.修改
	public abstract EducationBean update(Integer eduid, Integer teaid, Date edustart, Date eduend, String eduschool, String edudepart);
	
	//4a.查詢(單)
	public abstract EducationBean select(Integer eduid);
	
	//4b.查詢(多)
	public abstract List<EducationBean> select();
}