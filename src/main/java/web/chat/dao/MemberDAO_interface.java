package web.chat.dao;

import java.util.List;

import web.chat.entity.MemberVO;

public interface MemberDAO_interface {

	public MemberVO findByPrimaryKey(Integer mem_id);

	public List<MemberVO> getAll();

}
