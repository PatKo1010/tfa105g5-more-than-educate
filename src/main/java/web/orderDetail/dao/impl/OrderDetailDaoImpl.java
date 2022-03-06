package web.orderDetail.dao.impl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
import web.orderDetail.dao.OrderDetailDaoInterface;
import web.orderDetail.entity.OrderDetailEntity;

@Repository
public class OrderDetailDaoImpl implements OrderDetailDaoInterface {
	
	@PersistenceContext
	private Session session;
	
	public OrderDetailDaoImpl () {}
	public OrderDetailDaoImpl (Session s) {
		this.session = s;
	}
	public Session getSession() {
		return this.session;
	}
	
	@Override
	public List<OrderDetailEntity> selectByStudentId(Integer Id) {
			Query<OrderDetailEntity> query = this.getSession()
					.createQuery("from OrderDetailEntity where studentId = :X",OrderDetailEntity.class);
			query.setParameter("X", Id);
			return query.list();
	}
	
	@Override
	public List<OrderDetailEntity> selectAll() {
		List<OrderDetailEntity> entites = getSession().createQuery("from OrderDetailEntity").list();
		return entites;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
//		SessionFactory sf = context.getBean("sessionFactory",SessionFactory.class);
//		Session s = sf.getCurrentSession();
//		Transaction trx = s.beginTransaction();
		
		OrderDetailDaoInterface dao = (OrderDetailDaoImpl)context.getBean("orderDetailDaoImpl");
		List<OrderDetailEntity> entities = dao.selectByStudentId(10);
		System.out.println(entities);
		
//		trx.commit();
//		s.close();
		((ConfigurableApplicationContext)context).close();
		
	}

	
}
