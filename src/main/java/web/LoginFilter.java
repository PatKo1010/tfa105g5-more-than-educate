package web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter( value = {"/views/member/dashboard.jsp"} )
public class LoginFilter implements Filter {
	//0.init()
	public void init(FilterConfig filterConfig) throws ServletException{
	}
	
	//1.doFilter()
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		//取得Session
		HttpSession httpSession = req.getSession();
		
		//從Session判斷user是否登入
		Object member = httpSession.getAttribute("member");
		if (member == null) {
			res.sendRedirect(req.getContextPath() + "/indexDraftForPatrickPermit.jsp");
			return;
		} else {
			chain.doFilter(request, response); //去下一關
		}
	}
	
	//2.destroy()
	public void destroy() {
	}

}
