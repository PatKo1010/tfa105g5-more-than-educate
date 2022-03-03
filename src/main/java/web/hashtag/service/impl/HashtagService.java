package web.hashtag.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import configuration.SpringJavaConfig;
import web.hashtag.dao.HashtagDaoInterface;
import web.hashtag.entity.HashtagBean;
import web.member.entity.MemberBean;


@Service
@Transactional
public class HashtagService {

	@Autowired
	private HashtagDaoInterface hashtagDao;

	public HashtagService(HashtagDaoInterface hashtagDao) {
		this.hashtagDao = hashtagDao;
	}

	public static void main(String[] args) {
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);

		HashtagService hashtagService = context.getBean("hashtagService", HashtagService.class);
//		System.out.println(hashtagService.select());

		((ConfigurableApplicationContext) context).close();

	}
//	public List<MemberBean> findTeacherTest(String hashtag) {
//		return hashtagDao.findTeacher(hashtag);
//	}
	
	public List<MemberBean> findTeacherTest(String name) {
		return hashtagDao.findTeacher(name);
	}
	
	public List<MemberBean> findTeacherTest2(String hashtag) {
		return hashtagDao.findTeacher2(hashtag);
	}
	public  List<HashtagBean> findHashtagName(List <MemberBean> members) {
		return hashtagDao.findHashtagName(members);
	}
}