package web.member.dao;

import java.util.List;

import web.member.entity.MemberBean;

public interface MemberDAOInterface {
// class層: 宣告為interface(非class)
// [!!!重要!!!]方法層:   權限, +abstract, 類型; 方法名()

	//A.登入
	public abstract MemberBean selectByEmail(String email);
	
	//1.新增
	public abstract MemberBean insert(MemberBean memberBean);
	
	//2.刪除
	public abstract boolean delete(Integer memid);
	
	//3.修改
	public abstract MemberBean update(MemberBean memberBean);
	
	//4a.查詢(單)
	public abstract MemberBean select(Integer memid); 
	
	//4b.查詢(多)
	public abstract List<MemberBean> select();
}