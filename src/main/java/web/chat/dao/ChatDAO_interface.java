package web.chat.dao;

import java.util.List;

import web.chat.entity.ChatVO;

public interface ChatDAO_interface {

	public void insert(ChatVO chatVO);
	public void update(ChatVO chatVO);
	public void delete(Integer mess_id);
	public ChatVO findByPrimaryKey(Integer mess_id);
	public List<ChatVO> getAll();
	
	
	
}
