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
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/plugins.min.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/styles.css" />

</head>


<c:if test="${not empty select}">
<table>
	<thead>
	<tr>
		<th>布告欄編號</th>
		<th>管理員編號</th>
		<th>布告欄標題</th>
		<th>布告欄內文</th>
		<th>發布日期</th>
	</tr>
	</thead>
	<tbody>
	
	<c:forEach var="select" items="${select}">
		<c:url value="/pages/bulletselect.jsp" var="path">
			<c:param name="bulletId" value="${select.bulletId}" />
			<c:param name="adminId" value="${select.adminId}" />
			<c:param name="bulletTitle" value="${select.bulletTitle}" />
			<c:param name="bulletContent" value="${select.bulletContent}" />
			<c:param name="bulletTime" value="${select.bulletTime}" />
		</c:url>
	<tr>
		<td><a href="${path}">${select.bulletId}</a></td>
		<td>${select.adminId}</td>
		<td>${select.bulletTitle}</td>
		<td>${select.bulletContent}</td>
		<td>${select.bulletTime}</td>
		<td>

			<button onclick="deleteAjax(${param.bulletId})">刪除該筆布告欄</button>
		</td>
	</tr>
	
</c:forEach>	

	
	</tbody>
</table>
</c:if>
<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/plugins.min.js"></script>
	<script src="assets/js/main-scripts.js"></script>
	<script src="assets/js/dashboard.js"></script>
	
<h3><a href="javascript:window.history.go(-1);">點此返回布告欄</a></h3>


</body>
</html>










