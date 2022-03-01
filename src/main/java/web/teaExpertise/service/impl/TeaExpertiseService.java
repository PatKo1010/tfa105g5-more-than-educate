package web.teaExpertise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import configuration.SpringJavaConfig;
import web.teaExpertise.dao.impl.TeaExpertiseDAO;
import web.teaExpertise.entity.TeaExpertiseBean;

@Service
@Transactional
public class TeaExpertiseService {
	
	@Autowired
	private TeaExpertiseDAO teaExpertiseDAO;
	public TeaExpertiseService(TeaExpertiseDAO teaExpertiseDAO) {
		this.teaExpertiseDAO = teaExpertiseDAO;
	}
	
	//1.新增
	public TeaExpertiseBean insert(TeaExpertiseBean teaExpertiseBean) {
		if (teaExpertiseBean != null && teaExpertiseBean.getTeaexpertiseid() != null) {
			return teaExpertiseDAO.insert(teaExpertiseBean);
		}
		return null;
	}
	
	//2.刪除
	public boolean delete(TeaExpertiseBean teaExpertiseBean) {
		if (teaExpertiseBean != null && teaExpertiseBean.getTeaexpertiseid() != null) {
			return teaExpertiseDAO.delete( teaExpertiseBean.getTeaexpertiseid() );
		}
		return false;
	}
	
	//3.修改
	public TeaExpertiseBean update(TeaExpertiseBean teaExpertiseBean) {
		if (teaExpertiseBean != null && teaExpertiseBean.getTeaexpertiseid() != null) {
			return teaExpertiseDAO.update(teaExpertiseBean);
		}
		return null;
	}
	
	//4a.查詢(單)
	public TeaExpertiseBean select(TeaExpertiseBean teaExpertiseBean) {
		if (teaExpertiseBean != null) {
			return teaExpertiseDAO.select(teaExpertiseBean.getTeaexpertiseid());
		}
		return null;
	}
	
	//4b.查詢(多)
	public List<TeaExpertiseBean> select() {
		return teaExpertiseDAO.select();
	}
	
	//測試
	public static void main(String[] args) {
		//建spring環境
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		//spring取bean
		TeaExpertiseService teaExpertiseService = context.getBean("teaExpertiseService", TeaExpertiseService.class);
		
		teaExpertiseService.select();
		
		//關Spring
		((ConfigurableApplicationContext)context ).close();
	}
	
	
}
