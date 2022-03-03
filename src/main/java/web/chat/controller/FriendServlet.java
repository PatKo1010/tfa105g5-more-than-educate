package web.chat.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;

import web.chat.dao.impl.JedisMessageDAO;
import web.chat.entity.ChatMessageBean;
import web.chat.entity.StateBean;
import web.member.entity.MemberBean;

@ServerEndpoint("/FriendWS/{userName}")
@WebServlet("/chatservlet")
public class FriendServlet extends HttpServlet{
	private static Map<String, Session> sessionsMap = new ConcurrentHashMap<>();
	Gson gson = new Gson();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String vakue = ((MemberBean)session.getAttribute("member")).getUsername();
		System.out.println(vakue);
		request.setAttribute("userName", vakue);
		String talkTo = request.getParameter("talkTo");
		System.out.println(talkTo);
		request.setAttribute("talkTo", talkTo);
		request.getRequestDispatcher("views/chat/chat.jsp").forward(request, response);
	}
	@OnOpen
	public void onOpen(@PathParam("userName") String userName, Session userSession) throws IOException {
		sessionsMap.put(userName, userSession);
		Set<String> userNames = JedisMessageDAO.getChatList(userName);
		StateBean stateMessage = new StateBean("open", userName, userNames);
		String stateMessageJson = gson.toJson(stateMessage);

		userSession.getAsyncRemote().sendText(stateMessageJson);

		String text = String.format("Session ID = %s, connected; userName = %s%nusers: %s", userSession.getId(),
				userName, userNames);
		System.out.println(text);
	}

	@OnMessage
	public void onMessage(Session userSession, String message) {
		ChatMessageBean chatMessage = gson.fromJson(message, ChatMessageBean.class);
		String sender = chatMessage.getSender();
		String receiver = chatMessage.getReceiver();

		if ("history".equals(chatMessage.getType())) {
			List<String> historyData = JedisMessageDAO.getHistoryMsg(sender, receiver);
			String historyMsg = gson.toJson(historyData);
			ChatMessageBean cmHistory = new ChatMessageBean("history", sender, receiver, historyMsg);
			if (userSession != null && userSession.isOpen()) {
				userSession.getAsyncRemote().sendText(gson.toJson(cmHistory));
				System.out.println("history = " + gson.toJson(cmHistory));
				return;
			}
		}

		Session receiverSession = sessionsMap.get(receiver);
		if (receiverSession != null && receiverSession.isOpen()) {
			receiverSession.getAsyncRemote().sendText(message);
		}
		userSession.getAsyncRemote().sendText(message);
		JedisMessageDAO.saveChatMessage(sender, receiver, message);
		System.out.println("Message received: " + message);
	}

	@OnError
	public void onError(Session userSession, Throwable e) {
		System.out.println("Error: " + e.toString());
	}

	@OnClose
	public void onClose(Session userSession, CloseReason reason) {
		Set<String> userNames = sessionsMap.keySet();
		for (String userName : userNames) {
			if (sessionsMap.get(userName).equals(userSession)) {
				sessionsMap.remove(userName);
				break;
			}
		}

		String text = String.format("session ID = %s, disconnected; close code = %d%nusers: %s", userSession.getId(),
				reason.getCloseCode().getCode(), userNames);
		System.out.println(text);
	}
}
