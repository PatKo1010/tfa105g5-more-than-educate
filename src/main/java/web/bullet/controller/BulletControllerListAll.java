package web.bullet.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import web.bullet.entity.BulletBean;
import web.bullet.service.BulletServiceInterface;

@Controller
public class BulletControllerListAll {
	@Autowired
	private BulletServiceInterface service;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sFormat, true));
	}

	@RequestMapping(path = { "/bulletlistall.controller" })
	public String method(Model model, BulletBean bean, BindingResult bindingResult) {

		List<BulletBean> beanlist = service.selectall();
		model.addAttribute("beanlist",beanlist);
				
		
		return"/bullet/resources/bulletindex";
	}
}
