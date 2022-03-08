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
public class BulletControllerSelect {

	@Autowired
	private BulletServiceInterface service;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sFormat, true));
	}

	@RequestMapping(path = { "/bulletselect.controller" })
	public String method(BulletBean bean, String BulletBeanselectbyid,
			BindingResult bindingResult, Model model) {
		Map<String, String> errors = new HashMap<String, String>();

		if (bindingResult != null && bindingResult.hasFieldErrors()) {
			if (bindingResult.hasFieldErrors("bulletId")) {
				errors.put("bulletId", "布告欄編號不得為空");
			}
		}

		if (errors != null && !errors.isEmpty()) {
			return "/bullet/resources/Display";
		}
			List<BulletBean> result = service.select(bean);
			model.addAttribute("select", result);
			return "/bullet/resources/Display";
	}
}
