package web.hashtag.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import configuration.SpringJavaConfig;

import web.hashtag.dao.HashtagDaoInterface;
import web.hashtag.entity.HashtagBean;
import web.member.entity.MemberBean;



@Repository
public class HashtagDao implements HashtagDaoInterface {

	
	@PersistenceContext
	private Session session;
	//新增
		@Override
		public HashtagBean insert(HashtagBean hashtagBean) {
			session.save(hashtagBean);
			return hashtagBean;
		}
		
		//刪除
		@Override
		public  boolean delete(Integer hashtag_id) {
			session.delete(hashtag_id);
			return true;
		}
		
		//修改
		@Override
		public HashtagBean update(HashtagBean hashtagBean) {
			session.get(HashtagBean.class, hashtagBean.getHashtag_id());
			return hashtagBean;
		}
		
		//查詢(全部)
		@Override
		public List<HashtagBean> getAll() {
			return session.createQuery("SELECT * FROM REQUIRE_LIST").list() ;
		}
		
		//查詢PK
		@Override
		public HashtagBean findByPrimaryKey(Integer hashtag_id) {
			return session.get(HashtagBean.class, hashtag_id);
		}

		@Override
		public  List<MemberBean> findTeacher(String name){
			String trimname=name.trim();
			if(trimname!=null) {
				String hql2="select new MemberBean(photo,username,teatitle,introcontent,ratesum,ratecount,regdate) from MemberBean where username like:name and teaqual=1";
				List<MemberBean> result= session.createQuery(hql2).setParameter("name","%"+name+"%").list();
				return result;
			}
		return null;
		}
		@Override
		public  List<MemberBean> findTeacher2(String hashtag){
			String trimname=hashtag.trim();
			if(trimname!=null) {
							String hql1 = "select teaid from HashtagBean where hashtag = :trimname";
							List<Integer>  result1 = session.createQuery(hql1).setParameter("trimname", trimname).list();
//							System.out.println(result1);
//							
//							int size=result1.size();
//							for(int i=0;i<size;i++) {
//								result1.add(String.valueOf(result1.get(i)));	
//							}
//							for(int i=0;i<size;i++) {
//								result1.remove(i);	
//							}
//							for(int i=1;i<size;i++) {
//								i=i*2-1;
//								result1.add(i," or ");	
//							}
//							String str="";
//							for(int i=0;i<result1.size();i++)
//							{
//							str+=result1.get(i);
//							}
//							System.out.println(str);
							String hql2="from MemberBean where memid=:result1";
							List<MemberBean> result2 = new ArrayList<>();
							for(Integer memid : result1) {
							 result2.add((MemberBean)session.createQuery(hql2).setParameter("result1",memid).uniqueResult());
							}
							return result2;
//							
						}
			return null;
		}
}
