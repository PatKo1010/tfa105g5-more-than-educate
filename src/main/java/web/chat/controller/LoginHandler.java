package web.chat.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/views/chat/loginhandler")
public class LoginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
  protected boolean allowUser(String account, String password) {
    if ("tomcat".equals(account) && "tomcat".equals(password))
      return true;
    else
      return false;
  }
  
  public void doPost(HttpServletRequest req, HttpServletResponse res)
                                throws ServletException, IOException {
    req.setCharacterEncoding("Big5");
    res.setContentType("text/html; charset=Big5");
    PrintWriter out = res.getWriter();

    String account = req.getParameter("account");
    String password = req.getParameter("password");

    if (!allowUser(account, password)) {          
      out.println("<HTML><HEAD><TITLE>Access Denied</TITLE></HEAD>");
      out.println("<BODY>你的帳號無效, 密碼無效<BR>");
      out.println("請案重新登入<A HREF="+req.getContextPath()+"/views/chat/login.html>重新登入</A>");
      out.println("</BODY></HTML>");
    }else {                                       
      HttpSession session = req.getSession();
      session.setAttribute("account", account);   
      
       try {                                                        
         String location = (String) session.getAttribute("location");
         if (location != null) {
           session.removeAttribute("location");   
           res.sendRedirect(location);            
           return;
         }
       }catch (Exception ignored) { }

      res.sendRedirect(req.getContextPath()+"/views/chat/indexchat.jsp");  
    }
  }
}