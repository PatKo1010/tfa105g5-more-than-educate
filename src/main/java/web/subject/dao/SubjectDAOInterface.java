package web.subject.dao;

import java.util.List;

import web.member.entity.MemberBean;
import web.subject.entity.SubjectBean;

public interface SubjectDAOInterface {
	
	public abstract SubjectBean insert(SubjectBean bean);//新增
	
	public abstract boolean delete(Integer subjectid);//刪除
	
	public abstract SubjectBean update(SubjectBean bean);//修改 ????什麼時候用boolean
	
	public abstract SubjectBean select(Integer subjectid); //查詢(單筆)

	public abstract List<SubjectBean> select(); //查詢(多筆)
	
	public abstract List<MemberBean> findTeacher(String subjectname);
	
}