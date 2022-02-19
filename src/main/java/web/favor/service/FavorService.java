//package web.favor;
//package model;
//
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import model.dao.CustomerDAOJdbc;
//@Service
//public class FavorService {
//	@Autowired
//	private FavorDAO favorDao ;
//	
//	public FavorBean login(String username, String password) {
//		FavorBean bean = favorDao.select(username);
//		if(bean!=null) {
//			if(password!=null && password.length()!=0) {
//				byte[] pass = bean.getPassword();
//				byte[] temp = password.getBytes();
//				if(Arrays.equals(pass, temp)) {
//					return bean;
//				}
//			}
//		}
//		return null;
//	}
//	public boolean changePassword(String username, String oldPassword, String newPassword) {
//		CustomerBean bean = this.login(username, oldPassword);
//		if(bean!=null) {
//			byte[] temp = newPassword.getBytes();
//			return customerDao.update(temp, bean.getEmail(), bean.getBirth(), username);
//		}
//		return false;
//	}
//}
