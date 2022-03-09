package web.course.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ecpay.payment.integration.AllInOne;
import ecpay.payment.integration.domain.AioCheckOutALL;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import web.chat.util.JedisPoolUtil;
import web.course.entity.vCourseMemberBean;
import web.member.entity.MemberBean;
import web.orderInfo.service.OrderInfoServiceInterface;

@RestController
public class EcpayController {

	@Autowired
	private OrderInfoServiceInterface orderInfoService;
	public static AllInOne allInOne;
	private static JedisPool pool = JedisPoolUtil.getJedisPool();

	@PostMapping(value = "/course/ecpay", produces = "text/plain;charset=UTF-8")
	public String handler(Model model, @RequestBody List<vCourseMemberBean> orders, HttpSession session) {

		MemberBean memBean = (MemberBean) session.getAttribute("member");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		vCourseMemberBean vBean = orders.get(0);
		Map<String, Object> orderMap = orderInfoService.insertOrderReserved(vBean.getCourseid(), memBean.getMemid());
		System.out.println(orderMap.toString());

		System.out.println(String.valueOf((Integer) orderMap.get("orderId")) + "TFA105G5");
		System.out.println(sdf.format((Date) orderMap.get("orderDate")));
		System.out.println(String.valueOf((Integer) orderMap.get("orderPrice")));
		System.out.println((String) orderMap.get("orderTitle"));

		Jedis jedis = pool.getResource();
		long resultCount = jedis.srem("member:" + memBean.getMemid(), String.valueOf(vBean.getCourseid()));
		jedis.close();

		allInOne = new AllInOne("");

		AioCheckOutALL aCheckOut = new AioCheckOutALL();
		aCheckOut.setMerchantTradeNo(String.valueOf((Integer) orderMap.get("orderId")) + "TFA105G5");
		aCheckOut.setMerchantTradeDate(sdf.format((Date) orderMap.get("orderDate")));
		aCheckOut.setTotalAmount(String.valueOf((Integer) orderMap.get("orderPrice")));
		aCheckOut.setTradeDesc("test2");
		aCheckOut.setItemName((String) orderMap.get("orderTitle"));
		aCheckOut.setReturnURL("http://211.23.128.214:5000/");
		aCheckOut.setNeedExtraPaidInfo("N");
		System.out.println(allInOne.aioCheckOut(aCheckOut, null));

		return allInOne.aioCheckOut(aCheckOut, null);
	}

}
