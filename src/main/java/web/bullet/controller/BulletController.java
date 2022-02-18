package web.bullet.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.bullet.service.BulletServiceInterface;
@Controller
@RequestMapping(path= {"/bullet.controller"})

	public class BulletController {	
		@Autowired
		private BulletServiceInterface service;
		@GetMapping("selectById")
		public String select(String name,Model model,HttpSession session) {		
		if (name==null) {
			System.err.println("cant be 0");
		}
		session.setAttribute("name",name);
			return "redirect:/scuuess.jsp";
		}
}


