package web.orderInfo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import web.orderInfo.dao.OrderInfoDaoInterface;
import web.orderInfo.entity.OrderInfoEntity;

@Repository
public class OrderInfoDaoImpl implements OrderInfoDaoInterface {
	
	@PersistenceContext
	private Session session;
	public Session getSession() {
		return this.session;
	}
	@Override
	public OrderInfoEntity selectByPrimaryKey(Integer id) {
		if (id != null) {
			return this.getSession().get(OrderInfoEntity.class, id);
		}
		return null;
	}
	
	@Override
	public List<OrderInfoEntity> selectAll() {
		return this.getSession().createQuery("from OrderInfoEntity",OrderInfoEntity.class).list();
	}
	@Override
	public Integer insert(OrderInfoEntity orderEntity) {
		return (Integer)this.getSession().save(orderEntity);
	}
	@Override
	public OrderInfoEntity update(OrderInfoEntity orderEntity) {
		if (orderEntity != null && orderEntity.getOrderId()!= null) {
			OrderInfoEntity updateResult =  this.getSession().get(OrderInfoEntity.class, orderEntity.getOrderId());
			if (updateResult !=null) {
				updateResult.setClassStatus(orderEntity.getClassStatus());
				updateResult.setTransactionStatus(orderEntity.getTransactionStatus());
				updateResult.setRate(orderEntity.getRate());
				updateResult.setComment(orderEntity.getComment());
				updateResult.setClassRecord(orderEntity.getClassRecord());
				updateResult.setClassRecord(orderEntity.getClassRecord());
			}	
		}
		return null;
	}
	
	
	@Override
	public Boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public java.util.Date getInfoDate(Integer orderId){
		String HQL = "select orderDate FROM OrderInfoEntity where orderId =:XXX";
		return (java.util.Date)session.createQuery(HQL).setParameter("XXX", orderId).uniqueResult(); 
	}
	@Override
	public List<OrderInfoEntity> selectByCourseId(Integer courseId) {
		if (courseId != null) {
			String hql = "From OrderInfoEntity where courseId =:xxx";
			return this.session.createQuery(hql, OrderInfoEntity.class).setParameter("xxx", courseId).list();
		}
		return null;
	}
	
}
