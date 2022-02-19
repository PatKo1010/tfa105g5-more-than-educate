//package web.require.service.impl;
//
//
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import model.CustomerDAO;
//import web.require.dao.RequireDaoInterface;
//import web.require.entity.RequireBean;
//import web.require.service.RequireServiceInterface;
//import web.require.dao.RequireDaoInterface;
//import web.require.service.RequireServiceInterface;
//
//@Service
//@Transactional
//public class RequireService implements RequireServiceInterface{
//
//	@Autowired
//	private RequireDaoInterface RequireDaoInterface = null;
//	
//	public List<RequireBean> select(RequireBean bean) {
//		List<RequireBean> result = null;
//		if(bean!=null && bean.getRequire_id()!=null && !bean.getRequire_id.equals(0)) {
//			RequireBean temp = RequireDao.select(bean.getRequire_id());
//			if(temp!=null) {
//				result = new ArrayList<RequireBean>();
//				result.add(temp);
//			}
//		} else {
//			result = requireDao.select(); 
//		}
//		return result;
//	}
//	
//}
