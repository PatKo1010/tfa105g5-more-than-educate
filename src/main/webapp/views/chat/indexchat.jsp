<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
    Object account = session.getAttribute("account");                  // 從 session內取出 (key) account的值
    if (account == null) {                                             // 如為 null, 代表此user未登入過 , 才做以下工作
      session.setAttribute("location", request.getRequestURI());       //*工作1 : 同時記下目前位置 , 以便於login.html登入成功後 , 能夠直接導至此網頁(須配合LoginHandler.java)
      response.sendRedirect(request.getContextPath()+"/views/chat/login.html");   //*工作2 : 請該user去登入網頁(login.html) , 進行登入
      return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<style type="text/css">
html, body {
	font: 15px verdana, Times New Roman, arial, helvetica, sans-serif,
		Microsoft JhengHei;
	width: 90%;
	height: 90%;
	background: #eeeeda;
}

#userName {
	position: absolute;
	top: 50%;
	left: 50%;
	height: 30px;
	width: 250px;
	margin: -50px 121px 0 -130px;
}

#outPopUp {
	position: absolute;
	width: 500px;
	height: 300px;
	z-index: 15;
	top: 50%;
	left: 50%;
	margin: -200px 250px 0 -250px;
}

.button {
	background-color: #0078ae;
	color: #ffffff;
	border-radius: 5px;
	position: absolute;
	width: 100px;
	height: 40px;
	top: 50%;
	left: 50%;
	top: 50%;
	left: 50%;
	margin: 20px 200px 0 -50px;
}
</style>
<title>Join Us</title>
<%
	String userName = (String)session.getAttribute("account");
%>
</head>
<body>
	<jsp:useBean id="memberSvc" scope="page"
		class="web.chat.service.MemberService" />
	<div id="outPopUp">
		<h1 align="center">tibame最大的私聊上線囉～</h1>
		<form id="myForm" action="<%=request.getContextPath()%>/chat.do"method="POST">

			<li>
				<FORM METHOD="post" ACTION="chat.do">
<!-- 					<b>選擇身分:</b> <select size="1" name="mess_id"> -->
<%-- 						<c:forEach var="memberVO" items="${memberSvc.all}"> --%>
<%-- 							<option value="${memberVO.username}">${memberVO.username} --%>
<%-- 						</c:forEach> --%>
<!-- 					<input type="submit" value="送出"> -->
					
					<input type="hidden" name="account" value="${account}">
					
					
					<b>選擇對話的人:</b> <select size="1" name="talkTo">
						<c:forEach var="memberVO" items="${memberSvc.all}">
							<option value="${memberVO.username}">${memberVO.username}
						</c:forEach>
					<input type="submit" value="送出">
				</FORM>
			</li>

		</form>
	</div>
</body>
<script>
	var inputUserName = document.getElementById("userName");
	inputUserName.focus();

	function sendName() {
		var userName = inputUserName.value.trim();
		if (userName === "") {
			alert("Input a user name");
			inputUserName.focus();
			return;
		} else {
			document.getElementById("myForm").submit();
		}
	}
</script>

</html>