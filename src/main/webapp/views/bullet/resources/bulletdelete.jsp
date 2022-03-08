<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MoreThanEducate</title>
<meta charset="UTF-8" />
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="theme-color" content="#ffffff">
<meta name="msapplication-TileColor" content="#9f00a7">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<base href="../">
<!--	
    ========================================================================
    EXCLUSIVE ON themeforest.net
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Template Name   : Eduline - Education HTML Template
    Author          : AfraCode
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Copyright (c) 2019 - AfraCode
    ========================================================================
    -->
<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Poppins:100,300,500,600,700,900&display=swap">
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@200;300;400;600;700;800;900&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/css/plugins.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/css/styles.css" />
</head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="../css/main.css" />

<script
  src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>刪除布告欄</title>
<script type="text/javascript">
function clearForm() {
	var inputs = document.getElementsByTagName("input");
	for(var i=0; i<inputs.length; i++) {
		if(inputs[i].type=="text") {
			inputs[i].value="";
		}
	}
}

function ajaxDelete() {
	$.get( "/tfa105g5-more-than-educate/bulletdelete.controller?bulletId=" + $("#bulletId").val(), 
			function(e) {
	  alert( e);
	});
}
</script>
</head>
<body>

<h3>Welcome  ${user.custid}</h3>

<h3>刪除布告欄</h3>

<form action="<c:url value='/bulletdelete.controller' />" method="get">
<table>

	<tr>
		<td>布告欄編號</td>
		<td><input type="text" id ="bulletId" name="bulletId" value="${param.bulletId}"></td>
		<td><span class="error">${errors.bulletId}</span></td>
	</tr>

	<tr>
		<td>
			<input type="button" name="BulletBean" value="Delete" onclick="ajaxDelete()">
		</td>
		<td>
			<input type="button" value="Clear" onclick="clearForm()">
		</td>
	</tr>
</table>

</form>

<h3><span class="error">${errors.action}</span></h3><c:if test="${not empty delete}">

<h3>Delete Product Table Success : ${delete} row deleted</h3>
<script type="text/javascript">clearForm();</script>
</c:if>

<c:if test="${not empty delete}">
<h3>刪除成功</h3>
<table border="1">
	<tr><td>bulletId</td><td>${delete.bulletId}</td></tr>
</table>
<script type="text/javascript">clearForm();</script>
</c:if>
<h3><a href="javascript:window.history.go(-1);">點此返回布告欄</a></h3>

</body>
</html>