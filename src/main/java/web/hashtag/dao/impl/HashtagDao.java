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
import web.course.entity.CourseBean;
import web.education.entity.EducationBean;
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
		public MemberBean showTeacher(Integer id) {
			String hql=" from MemberBean where memid=:id and teaqual=1";
			MemberBean result= (MemberBean) session.createQuery(hql).setParameter("id",id).uniqueResult();
			return result;
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
				System.out.println("dao: trimName:"+trimname);
				String hql2=" from MemberBean where username like:name and teaqual=1";
				List<MemberBean> result= session.createQuery(hql2).setParameter("name","%"+trimname+"%").list();
				return result;
			}
		return null;
		}
		
		@Override
		public  List<MemberBean> findTeacher2(String hashtag){
			System.out.println(hashtag);
			String trimname=hashtag.trim();
			if(trimname!=null) {
							String hql1 = "select teaid from HashtagBean where hashtag = :trimname";
							List<Integer>  result1 = session.createQuery(hql1).setParameter("trimname", trimname).list();

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
		
//		@Override
//		public  List<HashtagBean> findHashtagName(List <MemberBean> members) {
//			List<Integer> list = new ArrayList<>();
//			List<Object> list2 = new ArrayList<>();
//			for(MemberBean result:members) {
//				list.add(result.getMemid());
//			}
//			int size=list.size();
//			for(int i=0;i<size;i++) {
//				String hql="select hashtag from HashtagBean where teaid=:id";
//				 list2.add(session.createQuery(hql).setParameter("id", i).uniqueResult());
//			}
//				int id=result.getMemid();
//				String hql="select hashtag from HashtagBean where teaid=:id";
//				 list.add((Hashtag) session.createQuery(hql).setParameter("id", id).uniqueResult());
//			}
//			return null;
//		}
		@Override
		public  List<MemberBean> orderGoodTeacher(List <MemberBean> members){
			Integer subjectid=members.get(0).getSubjectid();
			String hql1 = " from MemberBean where teaqual=1 and subjectid=:subjectid order by ratesum desc";
			List<MemberBean>  result = session.createQuery(hql1).setParameter("subjectid", subjectid).list();
			return result;
		}
		@Override
		public  List<MemberBean> orderNewTeacher(List <MemberBean> members){
			Integer subjectid=members.get(0).getSubjectid();
			String hql1 = " from MemberBean where teaqual=1 and subjectid=:subjectid order by regdate desc";
			List<MemberBean>  result = session.createQuery(hql1).setParameter("subjectid", subjectid).list();
			return result;
		};
		
		@Override
		public List<CourseBean> showCourse(Integer id) {
			String hql1 = " from CourseBean where memid=:id";
			List<CourseBean>  result = session.createQuery(hql1).setParameter("id", id).list();
			return result;
		}
		
		@Override
		public  EducationBean showEducation(Integer id) {
			String hql = " from EducationBean where memid=:id";
			EducationBean result= (EducationBean) session.createQuery(hql).setParameter("id",id).uniqueResult();
			return result;
		}
		
}
