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
public class BulletControllerInsert {
	@Autowired
	private BulletServiceInterface service;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sFormat, true));
	}

	@RequestMapping(path = { "/bulletinsert.controller" })
	public String method(Model model, BulletBean bean, BindingResult bindingResult) {
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);

		if (bean.getBulletTitle().isEmpty()) {
				errors.put("bulletTitle", "布告欄標題不能為空");

		}
		if ( bean.getBulletContent().isEmpty()) {
				errors.put("bulletContent", "布告欄內容不能為空");
		}
		// 有錯誤
		if (errors != null && !errors.isEmpty()) {
			
			return "/bullet/resources/bulletinsert";
		} else {
			BulletBean result = service.insert(bean);
			if (result == null) {
				errors.put("action", "Insert fail");
			} else {
				model.addAttribute("insert", result);
			}
			return "/bullet/resources/bulletinsert";
		}

	}
}
