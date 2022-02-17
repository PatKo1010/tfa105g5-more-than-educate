package web.member.dao;

import java.util.List;

import web.member.entity.WrkExpBean;

public interface WrkExpDAOInterface {
//提示: "public(權限)" "static(修飾)" "void(返回)" "XXX()(方法名)"
//Interface還有"決定輸入什麼(參數)"的責任

	//1.新增
	public abstract WrkExpBean insert(WrkExpBean wrkExpBean);
	
	//2.刪除
	public abstract boolean delete(Integer wkexpid);
	
	//3.修改
	public abstract WrkExpBean update(WrkExpBean wrkExpBean);
	
	//4a.查詢(單)
	public abstract WrkExpBean select(Integer wkExpId);
	
	//4b.查詢(多)
	public abstract List<WrkExpBean> selectAll();
}
