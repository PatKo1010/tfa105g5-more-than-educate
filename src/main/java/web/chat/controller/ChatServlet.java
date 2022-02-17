package web.chat.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import web.chat.entity.ChatVO;
import web.chat.service.ChatService;





@MultipartConfig
public class ChatServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		
		

		if ("getAll".equals(action)) {
			/*************************** �}�l�d�߸�� ****************************************/
			ChatService chatSvc = new ChatService();
			List<ChatVO> list = chatSvc.getAll();

			/*************************** �d�ߧ���,�ǳ����(Send the Success view) *************/
			HttpSession session = req.getSession();
			session.setAttribute("list", list); // ��Ʈw���X��list����,�s�Jsession
			// Send the Success view
			String url = "/listAllEmp2_getFromSession.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);// ���\���listAllEmp2_getFromSession.jsp
			successView.forward(req, res);
			return;
		}

		if ("getOne_For_Display".equals(action)) { // �Ӧ�select_page.jsp���ШD

			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/*************************** 1.�����ШD�Ѽ� - ��J�榡�����~�B�z **********************/
				String str = req.getParameter("mess_id");
				if (str == null || (str.trim()).length() == 0) {
					errorMsgs.add("�п�J�T���s��");
				}
				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					RequestDispatcher failureView = req.getRequestDispatcher("/select_page.jsp");
					failureView.forward(req, res);
					return;// �{�����_
				}

				Integer mess_id = null;
				try {
					mess_id = new Integer(str);
				} catch (Exception e) {
					errorMsgs.add("�T���s���榡�����T");
				}
				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					RequestDispatcher failureView = req.getRequestDispatcher("/select_page.jsp");
					failureView.forward(req, res);
					return;// �{�����_
				}

				/*************************** 2.�}�l�d�߸�� *****************************************/
				ChatService chatSvc = new ChatService();
				ChatVO chatVO = chatSvc.getOneEmp(mess_id);
				if (chatVO == null) {
					errorMsgs.add("�d�L���");
				}
				// Send the use back to the form, if there were errors
				if (!errorMsgs.isEmpty()) {
					RequestDispatcher failureView = req.getRequestDispatcher("/select_page.jsp");
					failureView.forward(req, res);
					return;// �{�����_
				}

				/*************************** 3.�d�ߧ���,�ǳ����(Send the Success view) *************/
				req.setAttribute("chatVO", chatVO); // ��Ʈw���X��empVO����,�s�Jreq
				String url = "/listOneEmp.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url); // ���\��� listOneEmp.jsp
				successView.forward(req, res);

				/*************************** ��L�i�઺���~�B�z *************************************/
			} catch (Exception e) {
				errorMsgs.add("�L�k���o���:" + e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/select_page.jsp");
				failureView.forward(req, res);
			}
		}
		
		if ("getOne_For_Update".equals(action)) { // �Ӧ�listAllEmp.jsp���ШD

			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);
			
			try {
				/***************************1.�����ШD�Ѽ�****************************************/
				Integer mess_id = new Integer(req.getParameter("mess_id"));
				System.out.println("1111111111");
				/***************************2.�}�l�d�߸��****************************************/
				ChatService chatSvc = new ChatService();
				ChatVO chatVO = chatSvc.getOneEmp(mess_id);
				System.out.println("222222222222");	
				/***************************3.�d�ߧ���,�ǳ����(Send the Success view)************/
				req.setAttribute("chatVO", chatVO);         // ��Ʈw���X��empVO����,�s�Jreq
				String url = "/update_emp_input.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url);// ���\��� update_emp_input.jsp
				successView.forward(req, res);

				/***************************��L�i�઺���~�B�z**********************************/
			} catch (Exception e) {
				errorMsgs.add("�L�k���o�n�ק諸���:" + e.getMessage());
				RequestDispatcher failureView = req
						.getRequestDispatcher("/listAllEmp1_byDAO.jsp");
				failureView.forward(req, res);
			}
		}
		
		
if ("update".equals(action)) { // �Ӧ�update_emp_input.jsp���ШD
	System.out.println("33333333333");
			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);
		
//			try {
				/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
				
				
				Integer mess_id = new Integer(req.getParameter("mess_id"));
				
				String str = req.getParameter("mema_id");
				String memReg = "^[2-6)]$";
				if (str == null || (str.trim()).length() == 0) {
					errorMsgs.add("�п�J�|��A�s��");
				}else if(!str.trim().matches(memReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.add("�s�����ݦb2��6����");
	            }
//				System.out.println(str);

				Integer mema_id = null;
				try {
mema_id = new Integer(str);
				} catch (Exception e) {
//					e.printStackTrace();
					errorMsgs.add("�|��A�s���榡�����T");
				}


				
String memb_idstr = req.getParameter("memb_id");

				if (memb_idstr == null || (memb_idstr.trim()).length() == 0) {
					errorMsgs.add("�п�J�|��B�s��");
				}else if(!memb_idstr.trim().matches(memReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.add("�s�����ݦb2��6����");
	            }


Integer memb_id = null;
				try {
					memb_id = new Integer(memb_idstr);
				} catch (Exception e) {
//					e.printStackTrace();
					errorMsgs.add("�|��B�s���榡�����T");
				}

				System.out.println("4444444444");
java.sql.Timestamp mess_date = null;
				try {
					mess_date = java.sql.Timestamp.valueOf(req.getParameter("mess_date"));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
					mess_date = new java.sql.Timestamp(System.currentTimeMillis());
					errorMsgs.add("�п�J���!");
				}
				System.out.println("555555555555");
String message_content = req.getParameter("message_content");
				String enameReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{1,20}$";
				if (message_content == null || message_content.trim().length() == 0) {
					errorMsgs.add("�T��: �ФŪť�");
				} else if(!message_content.trim().matches(enameReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.add("�T��: �u��O���B�^��r���B�Ʀr�M_ , �B���ץ��ݦb1��20����");
	            }
				
				Part part = req.getPart("photo");
				InputStream in = part.getInputStream();
				byte[] buf = null;
		if(in.available()!=0) {				
				buf = new byte[in.available()];
				in.read(buf);
		} else {
			ChatService chatSvc = new ChatService();
			ChatVO chatVO = (ChatVO)chatSvc.getOneEmp(mess_id);
			buf = chatVO.getPhoto();
			System.out.println(buf.length);
		}		
	
				
//Integer mess_id = new Integer(req.getParameter("mess_id"));

				ChatVO chatVO = new ChatVO();
				chatVO.setMemA_id(mema_id);
				chatVO.setMemB_id(memb_id);
				chatVO.setMess_date(mess_date);
				chatVO.setMessage_content(message_content);
				chatVO.setPhoto(buf);
				chatVO.setMess_id(mess_id);
				

//				System.out.println("666666666666");
				if (!errorMsgs.isEmpty()) {
					req.setAttribute("chatVO", chatVO); // �t����J�榡���~��empVO����,�]�s�Jreq
					RequestDispatcher failureView = req.getRequestDispatcher("/addEmp.jsp");
					failureView.forward(req, res);
					return;
				}
				
				/***************************2.�}�l�ק���*****************************************/
				ChatService chatSvc = new ChatService();
				chatVO = chatSvc.updateChat(mema_id, memb_id, mess_date, message_content, buf, mess_id);
				in.close();
//				System.out.println("7777777777");
				/***************************3.�ק粒��,�ǳ����(Send the Success view)*************/
				req.setAttribute("chatVO", chatVO); // ��Ʈwupdate���\��,���T����empVO����,�s�Jreq
				String url = "/listOneEmp.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url); // �ק令�\��,���listOneEmp.jsp
				successView.forward(req, res);
//				System.out.println("88888888888888");
				/***************************��L�i�઺���~�B�z*************************************/
//			} catch (Exception e) {
//				errorMsgs.add("�ק��ƥ���:"+e.getMessage());
//				RequestDispatcher failureView = req
//						.getRequestDispatcher("/update_emp_input.jsp");
//				failureView.forward(req, res);
//			}
		}
		
		
		
		
		

		if ("insert".equals(action)) { // �Ӧ�addEmp.jsp���ШD

			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/*********************** 1.�����ШD�Ѽ� - ��J�榡�����~�B�z *************************/
String str = req.getParameter("mema_id");
				String memReg = "^[2-6)]$";
				if (str == null || (str.trim()).length() == 0) {
					errorMsgs.add("�п�J�|��A�s��");
				}else if(!str.trim().matches(memReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.add("�s�����ݦb2��6����");
	            }
//				System.out.println(str);

				Integer mema_id = null;
				try {
mema_id = new Integer(str);
				} catch (Exception e) {
//					e.printStackTrace();
					errorMsgs.add("�|��A�s���榡�����T");
				}


				
String memb_idstr = req.getParameter("memb_id");

				if (memb_idstr == null || (memb_idstr.trim()).length() == 0) {
					errorMsgs.add("�п�J�|��B�s��");
				}else if(!memb_idstr.trim().matches(memReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.add("�s�����ݦb2��6����");
	            }


Integer memb_id = null;
				try {
					memb_id = new Integer(memb_idstr);
				} catch (Exception e) {
//					e.printStackTrace();
					errorMsgs.add("�|��B�s���榡�����T");
				}


java.sql.Timestamp mess_date = null;
				try {
					mess_date = java.sql.Timestamp.valueOf(req.getParameter("mess_date"));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
					mess_date = new java.sql.Timestamp(System.currentTimeMillis());
					errorMsgs.add("�п�J���!");
				}

String message_content = req.getParameter("message_content");
				String enameReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{1,20}$";
				if (message_content == null || message_content.trim().length() == 0) {
					errorMsgs.add("�T��: �ФŪť�");
				} else if(!message_content.trim().matches(enameReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.add("�T��: �u��O���B�^��r���B�Ʀr�M_ , �B���ץ��ݦb1��20����");
	            }
				

				Part part = req.getPart("photo");
				InputStream in = part.getInputStream();
				byte[] buf = new byte[in.available()];
				in.read(buf);
				
				
				
//Integer mess_id = new Integer(req.getParameter("mess_id"));

				ChatVO chatVO = new ChatVO();
				chatVO.setMemA_id(mema_id);
				chatVO.setMemB_id(memb_id);
				chatVO.setMess_date(mess_date);
				chatVO.setMessage_content(message_content);
				chatVO.setPhoto(buf);
System.out.println("1111111111");

				if (!errorMsgs.isEmpty()) {
					req.setAttribute("chatVO", chatVO); // �t����J�榡���~��empVO����,�]�s�Jreq
					RequestDispatcher failureView = req.getRequestDispatcher("/addEmp.jsp");
					failureView.forward(req, res);
					return;
				}
				
//				/*************************** 2.�}�l�d�߸�� *****************************************/
//				ChatService chatSvc = new ChatService();
//				ChatVO chatVOa = chatSvc.getOneEmp(mema_id);
//				if (chatVOa == null) {
//					errorMsgs.add("�d�L���");
//				}
//				// Send the use back to the form, if there were errors
//				if (!errorMsgs.isEmpty()) {
//					RequestDispatcher failureView = req.getRequestDispatcher("/addEmp.jsp");
//					failureView.forward(req, res);
//					return;// �{�����_
//				}
//				
//				
//				System.out.println("22222222222");
				
				
				
				
				
				
				
				
				
				
				
				/*************************** 2.�}�l�s�W��� ***************************************/
				ChatService chatSvc = new ChatService();
				chatVO = chatSvc.addChat(mema_id, memb_id, mess_date, message_content, buf);
				in.close();
				System.out.println("333333333333");
				/*************************** 4.�s�W����,�ǳ����(Send the Success view) ***********/
				String url = "/listAllEmp1_byDAO.jsp";
				RequestDispatcher successView = req.getRequestDispatcher(url); // �s�W���\�����listAllEmp.jsp
				successView.forward(req, res);
				
				/*************************** ��L�i�઺���~�B�z **********************************/
				} catch (Exception e) {
//				e.printStackTrace();
				errorMsgs.add(e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/addEmp.jsp");
				failureView.forward(req, res);
			}
			
		}
	

	
}
}

	
	


