package web.reservDetail.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import configuration.SpringJavaConfig;
import web.reservDetail.dao.ReservDetailDaoInterface;
import web.reservDetail.entity.ReservDetailBean;
import web.reservDetail.entity.ReservDetailWithRank;

@Repository
public class ReservDetailDaoImpl implements ReservDetailDaoInterface {
	@PersistenceContext
	private Session session;
	
	public Session getSession() {
		return this.session;
	}

	@Override
	public List<ReservDetailWithRank> selectReservDetailByTId(Integer memId) {
		if (memId != null) {
		    String sql = "select\r\n"
		    		+ "order_id,\r\n"
		    		+ "rank() over (\r\n"
		    		+ "partition by order_id\r\n"
		    		+ "order by reservTime_id\r\n"
		    		+ ") as course_rank,\r\n"
		    		+ "s_name, course_id, course_title, t_id, t_name, reservTime_id,reservDate_start, reservDate_end, is_reserved\r\n"
		    		+ "from reserv_detail r where t_id =:XXX";
		    NativeQuery<ReservDetailWithRank> query = this.session.createSQLQuery(sql);
		    query.setParameter("XXX", memId);
		    query.addEntity(ReservDetailWithRank.class);
		    List<ReservDetailWithRank> listResult = query.list();
		    return listResult;
		}
		return null;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		ReservDetailDaoImpl dao =  (ReservDetailDaoImpl)context.getBean("reservDetailDaoImpl");
		
		//select one teacher's reserved time
		System.out.println( dao.selectReservDetailByTId(11));
		
		((ConfigurableApplicationContext) context).close();
		
	}
	

}
