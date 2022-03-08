package web.bullet.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class BulletControllerSelectByAdminid {
	
	@Autowired
	private BulletServiceInterface service;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sFormat, true));
	}
	
	
	@RequestMapping(path = { "/bulletselectbyadminid.controller"} )
	public String method( BulletBean bean, String BulletBeanselectbyadminid, BindingResult bindingResult,Model model) {
		Map<String, String> errors = new HashMap<String, String>();
		
		
		if (bindingResult != null && bindingResult.hasFieldErrors()) {
			if (bindingResult.hasFieldErrors("bulletId")) {
				errors.put("bulletId", "布告欄編號不得為空");
			}
		}
		
		if (bindingResult != null && bindingResult.hasFieldErrors()) {
			if (bindingResult.hasFieldErrors("adminId")) {
				errors.put("adminId", "管理員標號不得為空");
			}
		}

		if (bindingResult != null && bindingResult.hasFieldErrors()) {
			if (bindingResult.hasFieldErrors("bulletTitle")) {
				errors.put("bulletTitle", "布告欄標題不能為空");

			}

		}
		if (bindingResult != null && bindingResult.hasFieldErrors()) {
			if (bindingResult.hasFieldErrors("bulletContent")) {
				errors.put("bulletContent", "布告欄內容不能為空");
			}
		}
		if (errors != null && !errors.isEmpty()) {
			return "/bullet/resources/Display";
		}
		//呼叫model
		//根據Model 執行結果導向view 
		if(BulletBeanselectbyadminid!=null ) {
			List<BulletBean> result = service.selectByAdminId(bean);
			model.addAttribute("select",result);
			return"/bullet/resources/Display";
		}else{
			return"/bulletlistall.controller";
		}
		
		}
}




