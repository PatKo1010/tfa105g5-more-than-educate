package web.course.controller;

import static util.EncryptDecrypt.decrypt;
import static util.EncryptDecrypt.encrypt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import web.course.entity.vCourseMemberBean;
import web.orderInfo.service.OrderInfoServiceInterface;

@RestController
public class EcPayTokenController {
	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	@Autowired
	private OrderInfoServiceInterface ois;

	@PostMapping("/course/getEcpayToken")
	public Map<String, String> handler(Model model, @RequestBody List<vCourseMemberBean> orders)
			throws ServletException, IOException {
		System.out.println(orders);
//		for(vCourseMemberBean vBean : orders){
//			Map<Integer, java.util.Date> orderMap = ois.insertOrderReserved(vBean.getCourseid(), vBean.getMemid());
//			orderMap.forEach((key, value) -> {
//				try {
//					getEcpay(key, value);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			});
//		}

		final vCourseMemberBean order = orders.get(0);
		Map<String, Object> orderMap = ois.insertOrderReserved(order.getCourseid(), order.getMemid());

		Map<String, String> resultMap = new HashMap<>();
		try {
			resultMap.put("token", getEcpay((Integer) orderMap.get("orderId"), (Date) orderMap.get("orderDate")));
			resultMap.put("orderId", String.valueOf((Integer) orderMap.get("orderId")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	}

	private String getEcpay(Integer orderId, java.util.Date date) throws Exception {
		URL url = new URL("https://ecpg-stage.ecpay.com.tw/Merchant/GetTokenbyTrade");
		HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
		httpUrlConnection.setRequestProperty("Content-Type", "application/json");

		httpUrlConnection.setRequestMethod("POST");
		httpUrlConnection.setDoOutput(true);

		OutputStreamWriter writer = new OutputStreamWriter(httpUrlConnection.getOutputStream());

		JsonObject data = new JsonObject();
		data.addProperty("MerchantID", "2000132");
		data.addProperty("RememberCard", 0);
		data.addProperty("PaymentUIType", 2);
		data.addProperty("ChoosePaymentList", "1");
		JsonObject orderInfo = new JsonObject();
		data.add("OrderInfo", orderInfo);
		orderInfo.addProperty("MerchantTradeNo","\""+ orderId + "\"");
//		System.out.println("\""+ orderId + "\"");
		orderInfo.addProperty("MerchantTradeDate", SDF.format(date));
		orderInfo.addProperty("TotalAmount", 1000);
		orderInfo.addProperty("ReturnURL", "https://localhost:8443/tfa105g5-more-than-educate/");
		orderInfo.addProperty("TradeDesc", "test");
		orderInfo.addProperty("ItemName", "Java");

		JsonObject cardInfo = new JsonObject();
		cardInfo.addProperty("orderResultURL", "https://localhost:8443/tfa105g5-more-than-educate/");
		data.add("CardInfo", cardInfo);

		JsonObject consumerInfo = new JsonObject();
		cardInfo.addProperty("Name", "TibaMe");
		data.add("ConsumerInfo", consumerInfo);

		JsonObject output = new JsonObject();
		output.addProperty("MerchantID", "2000132");
		JsonObject rqHeader = new JsonObject();
		output.add("RqHeader", rqHeader);
		rqHeader.addProperty("Timestamp", System.currentTimeMillis() / 1000);
		rqHeader.addProperty("Revision", "1.3.20");
		output.addProperty("Data", encrypt(data.toString()));
//		System.out.println(output);

		writer.write(output.toString());
		writer.close();

		if (httpUrlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
			StringBuilder stringBuilder = new StringBuilder("");
			BufferedReader br = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream(), "utf-8"));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				stringBuilder.append(strLine);
			}

			System.out.println(stringBuilder);

			Gson gson = new Gson();
			JsonObject jsonObject = gson.fromJson(stringBuilder.toString(), JsonObject.class);
			String dataStr = URLDecoder.decode(decrypt(jsonObject.get("Data").getAsString()), "UTF-8");
			System.out.println(dataStr);
			JsonObject dataObject = gson.fromJson(dataStr, JsonObject.class);
			final String token = dataObject.get("Token").getAsString();
			System.out.println(token);
			return token;
		}
		return null;
	}
}
