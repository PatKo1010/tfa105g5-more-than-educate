package web.admin.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import web.admin.entity.AdminBean;
import web.admin.service.AdminServiceInterface;


@Controller
public class AdminControllerInsert {
	@Autowired
	private AdminServiceInterface service;
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sFormat, true));
	}

	@RequestMapping(path = { "/admininsert.controller" })
	public String method(Model model, AdminBean bean, BindingResult bindingResult) {
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);
		
		if ( bean.getAdminEmail().isEmpty()) {
			errors.put("adminEmail", "信箱不得為空");
	}

		if ( bean.getAdminPassword().isEmpty()) {
				errors.put("adminPassword", "密碼不得為空");
		}
		if (errors != null && !errors.isEmpty()) {
			
			return "/bullet/resources/admintinsert";
		} else {
			AdminBean result = service.insert(bean);
			if (result == null) {
				errors.put("action", "Insert fail");
			} else {
				model.addAttribute("insert", result);
			}
			return "/admin/resources/admininsert";
		}

	}
	
	@RequestMapping(path = { "/adminLogin.controller" })
	public String login(Model model, AdminBean bean, BindingResult bindingResult,HttpSession session) {
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);
		
		if ( bean.getAdminEmail().isEmpty()) {
			errors.put("adminEmail", "信箱不得為空");
		}

		if ( bean.getAdminPassword().isEmpty()) {
				errors.put("adminPassword", "密碼不得為空");
		}
		
		
		if (errors != null && !errors.isEmpty()) {
			
			return "/admin/resources/adminlogin";
		} else {
			AdminBean result = service.login(bean);
			if (result == null) {
				errors.put("action", "login fail");
			} else {
				session.setAttribute("login", result);
			}
			return "/bullet/resources/bulletSelect";
			

		}

	}
	
}






