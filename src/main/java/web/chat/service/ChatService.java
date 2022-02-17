package web.chat.service;

import java.sql.Timestamp;
import java.util.List;

import web.chat.dao.ChatDAO_interface;
import web.chat.dao.impl.ChatJNDIDAO;
import web.chat.entity.ChatVO;

public class ChatService {

	private ChatDAO_interface dao;

	public ChatService() {
		dao = new ChatJNDIDAO();
	}

	
	public ChatVO addChat(Integer memA_id, Integer memB_id, Timestamp mess_date, String message_content,
			byte[] photo) {
		ChatVO chatVO = new ChatVO();
		chatVO.setMemA_id(memA_id);
		chatVO.setMemB_id(memB_id);
		chatVO.setMess_date(mess_date);
		chatVO.setMessage_content(message_content);
		chatVO.setPhoto(photo);
		dao.insert(chatVO);
		
		return chatVO;
		
	}
	
	


	
	
	
	public ChatVO updateChat(Integer memA_id, Integer memB_id, Timestamp mess_date, String message_content,
			byte[] photo,Integer mess_id) {
		ChatVO chatVO = new ChatVO();
		chatVO.setMemA_id(memA_id);
		chatVO.setMemB_id(memB_id);
		chatVO.setMess_date(mess_date);
		chatVO.setMessage_content(message_content);
		chatVO.setPhoto(photo);
		chatVO.setMess_id(mess_id);
		dao.update(chatVO);
		
		return chatVO;
		
	}
	
	


	public void deleteEmp(Integer mess_id) {
		dao.delete(mess_id);
	}

	public ChatVO getOneEmp(Integer mess_id) {
		return dao.findByPrimaryKey(mess_id);
	}

	public List<ChatVO> getAll() {
		return dao.getAll();
	}
}
