package web.course.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import web.chat.util.JedisPoolUtil;
import web.course.entity.vCourseMemberBean;
import web.course.service.CourseServiceInterface;
import web.member.entity.MemberBean;

@RestController
public class CartController {

	@Autowired
	private CourseServiceInterface courseService;

	private static JedisPool pool = JedisPoolUtil.getJedisPool();

	@PostMapping("/course/addShoppingCart")
	public Map<String, String> addShoppingCart(@RequestBody Map<String, String> requestMap) {
		System.out.println(requestMap.toString());

		Jedis jedis = pool.getResource();
		final String key = "member:" + requestMap.get("memid");
		final String value = requestMap.get("courseid");
		jedis.sadd(key, value);
		jedis.close();

		return requestMap;
	}

	@PostMapping("/course/shoppingCart")
	public List<vCourseMemberBean> shoppingCart(HttpSession session) {

		MemberBean bean = (MemberBean) session.getAttribute("member");
		Integer memid = bean.getMemid();

		Jedis jedis = pool.getResource();
		Set<String> courseIds = jedis.smembers("member:" + memid);

		List<vCourseMemberBean> result = new ArrayList<vCourseMemberBean>();

		for (String courseId : courseIds) {
			System.out.println(courseId);
			vCourseMemberBean vCourseBean = courseService.selectByCourseId(Integer.parseInt(courseId));
			result.add(vCourseBean);
		}
		jedis.close();
		return result;
	}

	@PostMapping("/course/sremCourse")
	public Map<String, Long> sremCourse(HttpSession session, @RequestBody Map<String, String> requestMap) {
		Jedis jedis = pool.getResource();
		MemberBean member = (MemberBean) session.getAttribute("member");
		long resultCount = jedis.srem("member:" + member.getMemid(), requestMap.get("courseid"));
		jedis.close();
		Map<String, Long> map = new HashMap<>();
		map.put("resultCount", resultCount);
		return map;
	}

}
