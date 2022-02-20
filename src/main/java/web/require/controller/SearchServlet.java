//package  web.require.controller;
//
//import java.io.*;
//import java.util.*;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//
//import web.require.*;
//@WebServlet("/search/search.do")
//public class SearchServlet extends HttpServlet {
//
//	
//	private static final long serialVersionUID = 1L;
//
//	public void doGet(HttpServletRequest req, HttpServletResponse res)
//			throws ServletException, IOException {
//		doPost(req, res);
//	}
//
//	public void doPost(HttpServletRequest req, HttpServletResponse res)
//			throws ServletException, IOException {
//
//		req.setCharacterEncoding("UTF-8");
//		String action = req.getParameter("action");
//		
//		
//		if ("getOne_For_Display".equals(action)) {
//
//				req.setAttribute("requireBean", RequireBean);
//				String url = "/search/listOneSearch.jsp";
//				RequestDispatcher successView = req.getRequestDispatcher(url);
//				successView.forward(req, res);
//
//		
//		
//		}
//		
//	
//
//	}
//}
