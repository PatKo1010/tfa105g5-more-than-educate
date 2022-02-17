package web.chat.entity;

import java.sql.Timestamp;

public class ChatVO implements java.io.Serializable{

	
//	mess_id, memA_id, memB_id, mess_date, message_content, photo
	
	private Integer mess_id;
	private Integer memA_id;
	private Integer memB_id;
	private Timestamp mess_date;
	private String message_content;
	private byte[] photo;
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public Integer getMess_id() {
		return mess_id;
	}
	public void setMess_id(Integer mess_id) {
		this.mess_id = mess_id;
	}
	public Integer getMemA_id() {
		return memA_id;
	}
	public void setMemA_id(Integer memA_id) {
		this.memA_id = memA_id;
	}
	public Integer getMemB_id() {
		return memB_id;
	}
	public void setMemB_id(Integer memB_id) {
		this.memB_id = memB_id;
	}
	public Timestamp getMess_date() {
		return mess_date;
	}
	public void setMess_date(Timestamp mess_date) {
		this.mess_date = mess_date;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	
	
	
	
	
	
}
