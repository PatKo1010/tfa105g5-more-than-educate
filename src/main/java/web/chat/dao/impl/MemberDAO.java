package web.chat.dao.impl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import web.chat.dao.MemberDAO_interface;
import web.chat.entity.MemberVO;

public class MemberDAO implements MemberDAO_interface {

	private static DataSource ds = null;
	static {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestChatDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	private static final String GET_ALL_STMT = "SELECT mem_id, email, password, username, phone_num, birth, photo, tea_qual, reg_date, tea_title, subject_id, intro_content, intro_clip, rate_sum, rate_count FROM member order by mem_id";
	private static final String GET_ONE_STMT = "SELECT mem_id, email, password, username, phone_num, birth, photo, tea_qual, reg_date, tea_title, subject_id, intro_content, intro_clip, rate_sum, rate_count FROM member where mem_id = ?";

	@Override
	public MemberVO findByPrimaryKey(Integer mem_id) {
		// TODO Auto-generated method stub
		MemberVO memberVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ONE_STMT);

			pstmt.setInt(1, mem_id);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				memberVO = new MemberVO();
				memberVO.setMem_id(rs.getInt("mem_id"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setPassword(rs.getString("password"));
				memberVO.setUsername(rs.getString("username"));
				memberVO.setPhone_num(rs.getString("phone_num"));
				memberVO.setReg_date(rs.getDate("reg_date"));
				memberVO.setPhoto(rs.getBytes("photo"));
				memberVO.setTea_qual(rs.getInt("tea_qual"));
				memberVO.setReg_date(rs.getDate("reg_date"));
				memberVO.setTea_title(rs.getString("tea_title"));
				memberVO.setSubject_id(rs.getInt("subject_id"));
				memberVO.setIntro_content(rs.getString("intro_content"));
				memberVO.setIntro_clip(rs.getBytes("intro_clip"));
				memberVO.setRate_sum(rs.getInt("rate_sum"));
				memberVO.setRate_count(rs.getInt("rate_count"));

			}

		} catch (SQLException se) {
			// TODO Auto-generated catch block
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return memberVO;
	}

	@Override
	public List<MemberVO> getAll() {

		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO memberVO = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ALL_STMT);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				memberVO = new MemberVO();
				memberVO.setMem_id(rs.getInt("mem_id"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setPassword(rs.getString("password"));
				memberVO.setUsername(rs.getString("username"));
				memberVO.setPhone_num(rs.getString("phone_num"));
				memberVO.setReg_date(rs.getDate("reg_date"));
				memberVO.setPhoto(rs.getBytes("photo"));
				memberVO.setTea_qual(rs.getInt("tea_qual"));
				memberVO.setReg_date(rs.getDate("reg_date"));
				memberVO.setTea_title(rs.getString("tea_title"));
				memberVO.setSubject_id(rs.getInt("subject_id"));
				memberVO.setIntro_content(rs.getString("intro_content"));
				memberVO.setIntro_clip(rs.getBytes("intro_clip"));
				memberVO.setRate_sum(rs.getInt("rate_sum"));
				memberVO.setRate_count(rs.getInt("rate_count"));

				list.add(memberVO);

			}
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return list;
	}

}
