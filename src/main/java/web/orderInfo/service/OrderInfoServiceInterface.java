package web.orderInfo.service;

import java.util.Map;

public interface OrderInfoServiceInterface {
	Map<Integer, java.util.Date> insertOrderReserved(Integer courseId, Integer memId);
}
