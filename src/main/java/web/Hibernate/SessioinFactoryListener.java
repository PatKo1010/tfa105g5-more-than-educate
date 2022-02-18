package web.Hibernate;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.hibernate.SessionFactory;

//@WebListener
public class SessioinFactoryListener implements ServletContextListener {
	//不寫在這,寫在filter,還是有可能會關掉
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		sce.getServletContext().setAttribute("sessionFactory", HibernateUtil.getSessionFactory());
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		if ((SessionFactory)sce.getServletContext().getAttribute("sessionFactory")!=null)
			HibernateUtil.closeSessionFactory();
	}
}
