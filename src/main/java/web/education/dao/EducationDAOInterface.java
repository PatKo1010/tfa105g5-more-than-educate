package web.education.dao;

import java.sql.Date;
import java.util.List;

import web.education.entity.EducationBean;

public interface EducationDAOInterface {

	//1.新增
	public abstract EducationBean insert(EducationBean educationBean);

	//2.刪除
	public abstract boolean delete(Integer eduid);

	//3.修改
	public abstract EducationBean update(EducationBean educationBean);

	//4a.查詢(單)
	public abstract EducationBean select(Integer eduid);

	//4b.查詢(多)
	public abstract List<EducationBean> select();
	
	//4c select by memid
	EducationBean selectByMemberid(Integer memid);

}