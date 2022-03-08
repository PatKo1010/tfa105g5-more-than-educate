<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/table.css" />
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

<title>布告欄總覽</title>
</head>
<body>
	<table>
		<thead>
			<div class="col-12">
				<div class="card">
					<div class="card-header">
						<h3 class="card-title">布告欄總覽</h3>
						<div class="card-tools">
							<div class="input-group input-group-sm" style="width: 150px;">
							</div>
						</div>
					</div>

					<div class="card-body table-responsive p-0">
						<table class="table table-hover text-nowrap">
							<thead>
								<tr>
									<th>布告欄編號</th>
									<th>管理員帳號</th>
									<th>布告欄標題</th>
									<th>布告欄內文</th>
									<th>發布日期</th>
								</tr>
							</thead>
							<tbody>
								<!-- HTML 迴圈start with c:foreach 一般包含2個屬性 items(controller 定義的name var 是自訂義) -->
								<c:forEach items="${beanlist}" var="bean">
									<tr>
										<td>${bean.bulletId}</td>
										<td>${bean.adminId}</td>
										<td>${bean.bulletTitle}</td>
										<td>${bean.bulletContent}</td>
										<td>${bean.bulletTime}</td>


									</tr>

								</c:forEach>
							</tbody>
						</table>
					</div>

				</div>

			</div>

			<tr>

			</tr>
		</thead>

	</table>

	<h3>
	
	</h3>
	
	<script
			src="<%=request.getContextPath()%>/resources/assets/js/jquery.min.js"></script>
		<script
			src="<%=request.getContextPath()%>/resources/assets/js/plugins.min.js"></script>
		<script
			src="<%=request.getContextPath()%>/resources/assets/js/main-scripts.js"></script>
		<script
			src="<%=request.getContextPath()%>/resources/assets/js/dashboard.js"></script>
	
<h3><a href="javascript:window.history.go(-1);">點此返回布告欄</a></h3>
</body>
</html>