package web.chat.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import web.chat.dao.ChatDAO_interface;
import web.chat.entity.ChatVO;

public class ChatJNDIDAO implements ChatDAO_interface {

	private static DataSource ds = null;
	static {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestChatDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}



	private static final String INSERT_STMT = "INSERT INTO `chat`.`message` (memA_id,memB_id,mess_date,message_content,photo) VALUES (?, ?, ?, ?, ?)";
	private static final String GET_ALL_STMT = "SELECT mess_id, memA_id, memB_id, mess_date, message_content FROM message order by mess_id";
	private static final String GET_ONE_STMT = "SELECT mess_id, memA_id, memB_id, mess_date, message_content, photo FROM message where mess_id = ?";
	private static final String DELETE = "DELETE FROM chat where mess_id = ?";
	private static final String UPDATE = "UPDATE message set memA_id=?, memB_id=?, mess_date=?, message_content=?, photo=? where mess_id = ?";



	@Override
	public void insert(ChatVO chatVO) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(INSERT_STMT);

			pstmt.setInt(1, chatVO.getMemA_id());
			pstmt.setInt(2, chatVO.getMemB_id());
			pstmt.setTimestamp(3, chatVO.getMess_date());
			pstmt.setString(4, chatVO.getMessage_content());
			pstmt.setBytes(5, chatVO.getPhoto());

			pstmt.executeUpdate();

		} catch (SQLException se) {
			// TODO Auto-generated catch block
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
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
	}

	@Override
	public void update(ChatVO chatVO) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(UPDATE);

			pstmt.setInt(1, chatVO.getMemA_id());
			pstmt.setInt(2, chatVO.getMemB_id());
			pstmt.setTimestamp(3, chatVO.getMess_date());
			pstmt.setString(4, chatVO.getMessage_content());
			pstmt.setBytes(5, chatVO.getPhoto());
			pstmt.setInt(6, chatVO.getMess_id());

			pstmt.executeUpdate();

		} catch (SQLException se) {
			// TODO Auto-generated catch block
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
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

	}

	@Override
	public void delete(Integer mess_id) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(DELETE);

			pstmt.setInt(1, mess_id);

			pstmt.executeUpdate();

		} catch (SQLException se) {
			// TODO Auto-generated catch block

			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
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

	}

	@Override
	public ChatVO findByPrimaryKey(Integer mess_id) {
		// TODO Auto-generated method stub
		ChatVO chatVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ONE_STMT);

			pstmt.setInt(1, mess_id);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				chatVO = new ChatVO();
				chatVO.setMess_id(rs.getInt("mess_id"));
				chatVO.setMemA_id(rs.getInt("mema_id"));
				chatVO.setMemB_id(rs.getInt("memb_id"));
				chatVO.setMess_date(rs.getTimestamp("mess_date"));
				chatVO.setPhoto(rs.getBytes("photo"));
				chatVO.setMessage_content(rs.getString("message_content"));

				
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
		return chatVO;
	}

	@Override
	public List<ChatVO> getAll() {

		List<ChatVO> list = new ArrayList<ChatVO>();
		ChatVO chatVO = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ALL_STMT);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				chatVO = new ChatVO();
				chatVO.setMess_id(rs.getInt("mess_id"));
				chatVO.setMemA_id(rs.getInt("mema_id"));
				chatVO.setMemB_id(rs.getInt("memb_id"));
				chatVO.setMessage_content(rs.getString("message_content"));
				chatVO.setMess_date(rs.getTimestamp("mess_date"));

				
				list.add(chatVO);

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

	public static void main(String[] arg) {

		ChatJNDIDAO dao = new ChatJNDIDAO();
		List<ChatVO> list = dao.getAll();
		System.out.println(dao.getAll());
	}

}
