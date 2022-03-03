package web.search.controller;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import web.hashtag.service.impl.HashtagService;
import web.member.entity.MemberBean;
import web.subject.entity.SubjectBean;
import web.member.service.impl.MemberService;
import web.subject.service.impl.SubjectService;

@WebServlet("/search.controller")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
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
			
		
			List<MemberBean> members =  hashtagSvc.findTeacherTest2(str);//關鍵字找老師
			if(members.size() == 0){
				members =  subjectSvc.findTeacherTest(str);//科目找老師
				if(members == null) {
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
			}
			req.setAttribute("members", members);
			System.out.println(members.get(0));
			RequestDispatcher successView = req.getRequestDispatcher("/views/search/searchresult.jsp");
			successView.forward(req, res);
		}
		if ("reserve".equals(action)) {
			ServletContext ctx = getServletContext();
			ApplicationContext ac = (ApplicationContext) ctx
					.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

			RequestDispatcher directView = req.getRequestDispatcher("/views/course/course.jsp");
			directView.forward(req, res);
		}
		if ("contact".equals(action)) {
			ServletContext ctx = getServletContext();
			ApplicationContext ac = (ApplicationContext) ctx
					.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
			RequestDispatcher directView = req.getRequestDispatcher("/chatservlet");
			directView.forward(req, res);
		}

		
	}
}
