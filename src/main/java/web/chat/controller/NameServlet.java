package web.chat.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NameServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		

		
//		String userName = req.getParameter("mess_id");
		String userName = req.getParameter("account");
		System.out.println(userName);
		req.setAttribute("userName", userName);
		
		String talkTo = req.getParameter("talkTo");
		if (talkTo != null)
			req.setAttribute("talkTo", talkTo);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/chat/chat.jsp");
		dispatcher.forward(req, res);
	}
}
