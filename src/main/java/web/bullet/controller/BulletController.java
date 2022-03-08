//package web.bullet.controller;
//
//import java.text.SimpleDateFormat;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import web.bullet.entity.BulletBean;
//import web.bullet.service.BulletServiceInterface;
//
////@Controller
//public class BulletController {
//	@Autowired
//	private BulletServiceInterface service;
//
//	@InitBinder
//	public void initBinder(WebDataBinder webDataBinder) {
//		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
//		webDataBinder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sFormat, true));
//	}
//
//	@RequestMapping(path = { "/pages/bullet.controller" })
//	public String method(Model model, BulletBean bean, String bulletbean, BindingResult bindingResult) {
//		Map<String, String> errors = new HashMap<String, String>();
//		model.addAttribute("errors", errors);
//		
//		if (bindingResult != null && bindingResult.hasFieldErrors()) {
//			if (bindingResult.hasFieldErrors("id")) {
//				errors.put("id", "布告欄編號不得為空");
//			}
//		}
//		
//		if (bindingResult != null && bindingResult.hasFieldErrors()) {
//			if (bindingResult.hasFieldErrors("adminid")) {
//				errors.put("adminid", "管理員標號不得為空");
//			}
//		}
//
//		if (bindingResult != null && bindingResult.hasFieldErrors()) {
//			if (bindingResult.hasFieldErrors("bullettitle")) {
//				errors.put("bullettitle", "布告欄標題不能為空");
//
//			}
//
//		}
//		if (bindingResult != null && bindingResult.hasFieldErrors()) {
//			if (bindingResult.hasFieldErrors("bulletcontent")) {
//				errors.put("bulletcontent", "布告欄內容不能為空");
//			}
//		}
//		if (errors != null && !errors.isEmpty()) {
//			return "/pages/bullet";
//		}
//		//呼叫model
//		//根據Model 執行結果導向view 
//		if(bulletbean!=null && bulletbean.equals("Select")) {
//			List<BulletBean>result=service.select(bean);
//		model.addAttribute("select", result);	
//		return "/views/Bulletindex";
//		}else if(bulletbean!=null && bulletbean.equals("Insert")) {
//			BulletBean result = service.insert(bean);
//			if(result ==null) {
//				errors.put("action", "Insert fail");
//			}else {
//				model.addAttribute("insert",result);
//			}
//			return"/views/Bulletindex";
//		}
//		else if (bulletbean!=null&&bulletbean.equals("Delete")) {
//			boolean result = service.delete(bean);
//		if(!result) {
//			model.addAttribute("delete",0);
//			}else {model.addAttribute("delete",1);
//		}
//		return"/pages/bullet";
//		}else {
//			errors.put("action","Unknown Action"+ bulletbean);
//			return"/pages/display";
//		}
//		
//		}
//}
//	
//		// 下面是驗證資料
////	@GetMapping("selectById")
////	@GetMapping是一個組合註解，是@RequestMapping(method = RequestMethod.GET)的縮寫。
////	public BulletBean select(Integer id) {
////	//for admin so later on need to install session to replaced Integer
////
////		return service.select(id);
////	}
////
////	@GetMapping("insert")
////	public BulletBean insert(BulletBean bean) {
////		return service.insert(bean);
////	}
////
////	@GetMapping("delete")
////	public Core delete(Integer id) {
////		boolean result = service.delete(id);
////		Core core = new Core(result);
////		return core;
////	}
////	
////
////		public String select(String name,Model model,HttpSession session) {		
////		if (name==null) {
////			System.err.println("cant be 0");
////		}
////		session.setAttribute("name",name);
////			return "redirect:/scuuess.jsp";
////		}
//
