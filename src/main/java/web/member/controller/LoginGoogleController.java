package web.member.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import web.member.entity.MemberBean;
import web.member.service.impl.MemberService;

@Controller
public class LoginGoogleController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(path= {"/views/member/loginWithGoogle"})
	public void oauth2LoginHandler(HttpServletRequest req, HttpServletResponse resp, HttpSession session) throws ServletException, IOException {
		// Google取得access_token的url
        URL urlObtainToken = new URL("https://accounts.google.com/o/oauth2/token");
        HttpURLConnection connectionObtainToken =  (HttpURLConnection) urlObtainToken.openConnection();
            
        // 設定此connection使用POST
        connectionObtainToken.setRequestMethod("POST");
        connectionObtainToken.setDoOutput(true);
        
        // 開始傳送參數 
        OutputStreamWriter writer = new OutputStreamWriter(connectionObtainToken.getOutputStream());
        writer.write("code="+req.getParameter("code")+"&");   // 取得Google回傳的參數code
        writer.write("client_id=1064292731610-gq88kia62m4187k3j0nusfuoq10gj6i7.apps.googleusercontent.com&");   // 這裡請將xxxx替換成自己的client_id
        writer.write("client_secret=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&");   // 這裡請將xxxx替換成自己的client_serect
        writer.write("redirect_uri=https://localhost:8443/tfa105g5-more-than-educate/views/member/loginWithGoogle&");   // 這裡請將xxxx替換成自己的redirect_uri
        writer.write("grant_type=authorization_code");  
        writer.close();
        
        // 如果認證成功
        if (connectionObtainToken.getResponseCode() == HttpURLConnection.HTTP_OK){
            StringBuilder sbLines   = new StringBuilder("");
            
            // 取得Google回傳的資料(JSON格式)
            BufferedReader reader = 
                new BufferedReader(new InputStreamReader(connectionObtainToken.getInputStream(),"utf-8"));
            String strLine = "";
            while((strLine=reader.readLine())!=null){
                sbLines.append(strLine);
            }
            
            try {
                // 把上面取回來的資料，放進JSONObject中，以方便我們直接存取到想要的參數
            	Gson gson = new Gson();
            	
                JsonObject jo = gson.fromJson(sbLines.toString(), JsonObject.class);
                session.setAttribute("member", getEmail(jo));
//                String url = req.getContextPath() + "/views/member/dashboard.jsp";
                String url = "/views/member/dashboard.jsp";
                req.getRequestDispatcher(url).forward(req, resp);
                // 印出Google回傳的access token
                // resp.getWriter().println(jo.getString("access_token")); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
	
	
	
    private MemberBean getEmail(JsonObject jo) throws ServletException, IOException {
        URL urUserInfo =   
            new URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token="+jo.get("access_token")); 
        HttpURLConnection connObtainUserInfo =  (HttpURLConnection) urUserInfo.openConnection();
        
        //如果認證成功
        if (connObtainUserInfo.getResponseCode() == HttpURLConnection.HTTP_OK){
            StringBuilder sbLines = new StringBuilder("");
            
            // 取得Google回傳的資料(JSON格式)
            BufferedReader reader = 
            new BufferedReader(new InputStreamReader(connObtainUserInfo.getInputStream(),"utf-8"));
            String strLine = "";
            while((strLine=reader.readLine())!=null){
                sbLines.append(strLine);
            }
            
            try {
            // 把上面取回來的資料，放進JSONObject中，以方便我們直接存取到想要的參數
            	Gson gson = new Gson();
            	
                JsonObject joInfo = gson.fromJson(sbLines.toString(), JsonObject.class);
                
            // 印出Google回傳的"emailtoken
            System.out.println(joInfo.get("email").toString().replace("\"", ""));
            System.out.println(joInfo.get("name").toString().replace("\"", ""));
            
            MemberBean bean = new MemberBean();
            bean.setEmail(joInfo.get("email").toString().replace("\"", ""));
            bean.setUsername(joInfo.get("name").toString().replace("\"", ""));
            
            bean.setPassword("採第三方google登入,不可更改密碼");
            bean.setRatecount(1);
            bean.setTeaqual(false);
            memberService.insert(bean);  //可能要改update
            
            MemberBean resultBean = memberService.selectByEmail(bean.getEmail());
            
            return resultBean;
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        return null;
    }
}
