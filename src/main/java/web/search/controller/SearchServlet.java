package web.search.controller;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import web.course.entity.CourseBean;
import web.hashtag.service.impl.HashtagService;
import web.member.entity.MemberBean;
import web.subject.entity.SubjectBean;
import web.member.service.impl.MemberService;
import web.subject.service.impl.SubjectService;

@WebServlet("/search.controller")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		ServletContext ctx = getServletContext();
		ApplicationContext ac = (ApplicationContext) ctx
				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		HashtagService hashtagSvc = ac.getBean("hashtagService", HashtagService.class);
		String str=req.getParameter("id");
		Integer id=Integer.parseInt(str);
		MemberBean members3 =  hashtagSvc.showTeacher(id);
		req.setAttribute("members3", members3);	
		
		List<CourseBean> findcourse = hashtagSvc.showCourse(id);
		req.setAttribute("findcourse", findcourse);
		RequestDispatcher successView = req.getRequestDispatcher("/views/search/teacher.jsp");
		successView.forward(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		HttpSession session = req.getSession();
		if ("getTeacher".equals(action)) {
			String str = req.getParameter("keyword");
			if(str=="") {
				List<String> errorMsgs = new LinkedList<String>();
				req.setAttribute("errorMsgs", "請輸入想學習的科目或想找的老師或關鍵字");
				RequestDispatcher failureView = req.getRequestDispatcher("/views/search/failpage.jsp");
				failureView.forward(req, res);
				return;
			}
			ServletContext ctx = getServletContext();
			ApplicationContext ac = (ApplicationContext) ctx
					.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
			SubjectService subjectSvc = ac.getBean("subjectService", SubjectService.class);
			HashtagService hashtagSvc = ac.getBean("hashtagService", HashtagService.class);
//			List<MemberBean> members =  hashtagSvc.findTeacherTest2(str);//關鍵字找老師
			List<MemberBean> members = null;
//			if(members.size() == 0){
				members =  subjectSvc.findTeacherTest(str);//科目找老師
				System.out.println("findTeacherTest:"+members);
				if( members == null || members.size() == 0) {
					members =  hashtagSvc.findTeacherTest(str);//名字找老師
					if(members.isEmpty()) {
						List<String> errorMsgs = new LinkedList<String>();
						req.setAttribute("errorMsgs", "找不到「"+str+"」相關資料");
						RequestDispatcher failureView = req
								.getRequestDispatcher("/views/search/failpage.jsp");
						failureView.forward(req, res);
						return;
					}
				}
				
//			}
//			List<String> hashtag=hashtagSvc.findHashtagName(members);
//			req.setAttribute("hashtag", hashtag);
				session.setAttribute("members",members);
			req.setAttribute("members", members);
			RequestDispatcher successView = req.getRequestDispatcher("/views/search/searchresult.jsp");
			successView.forward(req, res);
		}
		if ("reserve".equals(action)) {
			ServletContext ctx = getServletContext();
			ApplicationContext ac = (ApplicationContext) ctx
					.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

			RequestDispatcher directView = req.getRequestDispatcher("/views/course/CourseShoppingCart.html");
			directView.forward(req, res);
		}
		if ("contact".equals(action)) {
			ServletContext ctx = getServletContext();
			ApplicationContext ac = (ApplicationContext) ctx
					.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
			RequestDispatcher directView = req.getRequestDispatcher("/views/search/teacher.jsp");
			directView.forward(req, res);
		}
		if ("goodOrder".equals(action)) {
			ServletContext ctx = getServletContext();
			ApplicationContext ac = (ApplicationContext) ctx
					.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
			
			List<MemberBean> members1=(List<MemberBean>) session.getAttribute("members");
			HashtagService hashtagSvc = ac.getBean("hashtagService", HashtagService.class);
			 members1 =  hashtagSvc.orderGoodTeacher(members1);

			req.setAttribute("members1", members1);	
			RequestDispatcher directView =req.getRequestDispatcher("/views/search/searchgoodorder.jsp");
			directView.forward(req, res);
		}
		if ("newOrder".equals(action)) {
			ServletContext ctx = getServletContext();
			ApplicationContext ac = (ApplicationContext) ctx
					.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		
			List<MemberBean> members2=(List<MemberBean>) session.getAttribute("members");
			HashtagService hashtagSvc = ac.getBean("hashtagService", HashtagService.class);
			 members2 =  hashtagSvc.orderNewTeacher(members2);
			req.setAttribute("members2", members2);	
			RequestDispatcher directView = req.getRequestDispatcher("/views/search/searchneworder.jsp");
			directView.forward(req, res);
		}
	}
}
