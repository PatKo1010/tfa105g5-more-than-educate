package web.hashtag.dao;

import java.util.List;

import web.hashtag.entity.HashtagBean;
import web.member.entity.MemberBean;

public interface HashtagDaoInterface {

	
	
	public abstract HashtagBean insert(HashtagBean hashtagBean);
	
	public abstract HashtagBean update(HashtagBean hashtagBean) ;
	
	public abstract boolean delete(Integer hashtag_id);
	
	public abstract HashtagBean findByPrimaryKey(Integer hashtag_id);
	
	public abstract List<HashtagBean> getAll();
	
	public abstract List<MemberBean> findTeacher2(String hashtag);
	
	public abstract List<MemberBean> findTeacher(String name);

	
}
