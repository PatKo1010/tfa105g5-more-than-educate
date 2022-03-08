package web.course.controller;

import static util.EncryptDecrypt.decrypt;
import static util.EncryptDecrypt.encrypt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
public class PayController {
    @RequestMapping(path = { "/course/EcpaymentToken/{param1}/{param2}" }, method = RequestMethod.GET)
    public void createPay(@PathVariable(name = "param1") String payToken, @PathVariable(name = "param2") String orderId)
            throws Exception {
        System.out.println(payToken);
        System.out.println(orderId);
        URL url = new URL("https://ecpg-stage.ecpay.com.tw/Merchant/CreatePayment");
        HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
        httpUrlConnection.setRequestProperty("Content-Type", "application/json");
        httpUrlConnection.setRequestMethod("POST");
        httpUrlConnection.setDoOutput(true);

        OutputStreamWriter writer = new OutputStreamWriter(httpUrlConnection.getOutputStream());

        JsonObject output = new JsonObject();
        output.addProperty("MerchantID", "2000132");
        JsonObject rqHeader = new JsonObject();
        rqHeader.addProperty("Timestamp", System.currentTimeMillis() / 1000);
        rqHeader.addProperty("Revision", "1.3.20");
        output.add("RqHeader", rqHeader);
        JsonObject data = new JsonObject();
        data.addProperty("MerchantID", "2000132");
        data.addProperty("PayToken", payToken);
        data.addProperty("MerchantTradeNo", orderId);
        output.addProperty("Data", encrypt(data.toString()));
        
        writer.write(output.toString());
        writer.close();

		if (httpUrlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
			StringBuilder stringBuilder = new StringBuilder("");
			BufferedReader br = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream(), "utf-8"));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				stringBuilder.append(strLine);
			}
			Gson gson = new Gson();
			JsonObject jsonObject = gson.fromJson(stringBuilder.toString(), JsonObject.class);
			String dataStr = URLDecoder.decode(decrypt(jsonObject.get("Data").getAsString()), "UTF-8");
			System.out.println(dataStr);

		}
    }
}
