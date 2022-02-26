package web.course.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.course.entity.CourseBean;
import web.course.service.CourseServiceInterface;

@Controller
public class CourseController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Autowired
	private CourseServiceInterface courseServiceInterface;

//	@RequestMapping(path = { "/views/course.insert" })
	@ResponseBody
	public Map<String, Object> insert(Model model, Integer memid, String expertiseid, String coursetitle,
			String courseintro, Integer classamount, Integer price, CourseBean bean) {
		System.out.println("添加了新商品：" + coursetitle);
		String result = "新增失敗";
		CourseBean course = new CourseBean();
		course.setMemid(memid);
		course.setExpertiseid(memid);
		course.setCoursetitle(coursetitle);
		course.setCourseintro(courseintro);
		course.setClassamount(classamount);
		course.setPrice(price);
		courseServiceInterface.addCourse(bean);
		result = "新增成功";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		return resultMap;
	}

//	@Override
//	public void init() throws ServletException {
//		ServletContext application = this.getServletContext();
//		ApplicationContext context = (ApplicationContext) application
//				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
//
////		courseServiceInterface = context.getBean("courseServiceImpl", CourseServiceImpl.class); //新版的bug 無法強轉
//		courseServiceInterface = (CourseServiceInterface) context.getBean("courseServiceImpl");
//
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		String temp1 = req.getParameter("memid");
//		String temp2 = req.getParameter("expertiseid");
//		String temp3 = req.getParameter("coursetitle");
//		String temp4 = req.getParameter("courseintro");
//		String temp5 = req.getParameter("classamount");
//		String temp6 = req.getParameter("price");
//		String production = req.getParameter("production");
//
//		Map<String, String> errors = new HashMap<String, String>();
//		req.setAttribute("errors", errors);
//
//		if (production != null) {
//			if (production.equals("新增") || production.equals("Update") || production.equals("Delete")) {
//				if (temp1 == null || temp1.length() == 0) {
//					errors.put("id", "Please enter Id for " + production);
//				}
//			}
//		}
//
//		int memid = 0;
//		if (temp1 != null && temp1.length() != 0) {
//			try {
//				memid = Integer.parseInt(temp1);
//			} catch (Exception e) {
//				e.printStackTrace();
//				errors.put("memid", "請輸入正確！");
//			}
//		}
//
//		int expertiseid = 0;
//		if (temp2 != null && temp2.length() != 0) {
//			try {
//				expertiseid = Integer.parseInt(temp2);
//			} catch (Exception e) {
//				e.printStackTrace();
//				errors.put("expertiseid", "請輸入正確！");
//			}
//		}
//
//		int classamount = 0;
//		if (temp5 != null && temp5.length() != 0) {
//			try {
//				classamount = Integer.parseInt(temp5);
//			} catch (Exception e) {
//				e.printStackTrace();
//				errors.put("classamount", "請輸入正確！");
//			}
//		}
//
//		int price = 0;
//		if (temp6 != null && temp6.length() != 0) {
//			try {
//				price = Integer.parseInt(temp6);
//			} catch (Exception e) {
//				e.printStackTrace();
//				errors.put("price", "請輸入正確！");
//			}
//		}
//
//		if (errors != null && !errors.isEmpty()) {
//			req.getRequestDispatcher("/views/course/TeacherCourse.html").forward(req, resp);
//			return;
//		}
//
//		CourseBean bean = new CourseBean();
//		bean.setMemid(memid);
//		bean.setExpertiseid(expertiseid);
//		bean.setCoursetitle(temp3);
//		bean.setCourseintro(temp4);
//		bean.setClassamount(classamount);
//		bean.setPrice(price);
//
//		if (production != null && production.equals("Select")) {
//			List<CourseBean> result = courseServiceInterface.findAll();
//			req.setAttribute("select", result);
//			req.getRequestDispatcher("/views/course/TeacherCourse.html").forward(req, resp);
//		} else if (production != null && production.equals("新增")) {
//			Integer result = courseServiceInterface.addCourse(bean);
//			if (result == null) {
//				errors.put("action", "新增失敗");
//			} else {
//				req.setAttribute("insert", result);
//			}
//			req.getRequestDispatcher("/views/course/TeacherCourse.html").forward(req, resp);
//		} else if (production != null && production.equals("Update")) {
//			CourseBean result = courseServiceInterface.modifyCourse(bean);
//			if (result == null) {
//				errors.put("action", "修改失敗");
//			} else {
//				req.setAttribute("update", result);
//			}
//			req.getRequestDispatcher("/views/course/TeacherCourse.html").forward(req, resp);
//		} else if (production != null && production.equals("Delete")) {
//			boolean result = courseServiceInterface.rmoveCourse(bean);
//			if (!result) {
//				req.setAttribute("delete", 0);
//			} else {
//				req.setAttribute("delete", 1);
//			}
//			req.getRequestDispatcher("/views/course/TeacherCourse.html").forward(req, resp);
//		} else {
//			errors.put("action", "Unknown Action: " + production);
//			req.getRequestDispatcher("/views/course/TeacherCourse.html").forward(req, resp);
//		}
//
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		this.doGet(req, resp);
//	}
}
