package web.require.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.require.dao.RequireDaoInterface;

import web.require.entity.RequireBean;
import web.require.service.RequireServiceInterface;

@Service
@Transactional
public class RequireService implements RequireServiceInterface {

	@Autowired
	private RequireDaoInterface requireDaoInterface;

	public Map<String, String> insert(RequireBean bean) {
		Map<String, String> errorMsgs = new HashMap<>();

		Integer check1 = null;
		if ((bean.getPrice_min() instanceof Integer)) {
			check1 = Integer.valueOf(bean.getPrice_min());
			if (check1 <= 0) {
				errorMsgs.put("pricemin", "請輸入大於零的數字");
			}
		} else {
			errorMsgs.put("pricemin", "請輸入一個正整數");
		}

		Integer check2 = null;
		if ((bean.getPrice_max() instanceof Integer)) {
			check2 = Integer.valueOf(bean.getPrice_max());
			if (check2 <= 0) {
				errorMsgs.put("pricemax", "請輸入大於零的數字");
			}
		} else {
			errorMsgs.put("pricemax", "請輸入一個正整數");
		}
		if (check1 != null && check2 != null) {
			if (check1 > check2) {
				errorMsgs.put("errorprice", "最小金額不能大於最大金額");
			}
		}
		return errorMsgs;
	}

}
