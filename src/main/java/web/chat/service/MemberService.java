package web.chat.service;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.List;

import web.chat.dao.MemberDAO_interface;
import web.chat.dao.impl.MemberDAO;
import web.chat.entity.MemberVO;

public class MemberService {

	private MemberDAO_interface dao;

	public MemberService() {
		dao = new MemberDAO();
	}

	public List<MemberVO> getAll() {
		return dao.getAll();
	}

	public MemberVO getOneEmp(Integer mem_id) {
		return dao.findByPrimaryKey(mem_id);
	}

}
