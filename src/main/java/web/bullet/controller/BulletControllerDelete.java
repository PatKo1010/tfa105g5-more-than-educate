package web.bullet.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.bullet.entity.BulletBean;
import web.bullet.service.BulletServiceInterface;

@Controller
public class BulletControllerDelete {
	@Autowired
	private BulletServiceInterface service;

	@ResponseBody
	@RequestMapping(value = "/bulletdelete.controller" ,produces = "text/html; charset=UTF-8")
	public String getSearchResultViaAjax(Integer bulletId, BulletBean bean) {

		String message = "";
		if (bulletId == null ) {
			message = "no data";
		} else {
			bean.setBulletId(bulletId);
			boolean bv = service.delete(bean);
			System.out.println(bv);
			message = bv == true ? "刪除成功" : "failed";
		}
		return message;
	}
}
