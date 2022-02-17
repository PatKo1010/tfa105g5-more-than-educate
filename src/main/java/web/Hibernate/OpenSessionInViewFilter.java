package web.Hibernate;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebFilter(
		urlPatterns = {"/*"}  //對那些url做request時,會經過這個filter (似一種公用servlet效果)
)
public class OpenSessionInViewFilter implements Filter {
	private SessionFactory sessionFactory;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		sessionFactory = (SessionFactory)request.getServletContext().getAttribute("sessionFactory");
		request.setAttribute("session", sessionFactory.getCurrentSession()); //放進req, 再藉request傳下去
		try {
			this.sessionFactory.getCurrentSession().beginTransaction();
			chain.doFilter(request, response); //開始接著跑servlet
			
			this.sessionFactory.getCurrentSession().getTransaction().commit(); //response回來經過
			this.sessionFactory.getCurrentSession().close();
		} catch (Exception e) {
			this.sessionFactory.getCurrentSession().getTransaction().rollback();
			e.printStackTrace();//也可以forward到"指定頁面" (保護)
		}
	}
	@Override
	public void destroy() {

	}
}
