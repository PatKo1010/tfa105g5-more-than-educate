<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MoreThanEducate 新增管理員</title>
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
<link rel="stylesheet" href="resources/assets/css/plugins.min.css" />
<link rel="stylesheet" href="resources/assets/css/styles.css" />
</head>
<body>

	-->
	<!--Overlay-->
	<span class="mega-menu-overlay"></span>
	<!--/-->
	<!--Header-->
	<header class="app-header app-header-1 boxed">
		<div class="container">
			<div class="header-wrap">
				<button class="button button-menu button-open-sidenav">
					<span></span>
				</button>
				<div class="header-menu">
					<ul>
						<li class="has-menu" data-megamenu-link="mega-menu-1">
							<div class="mega-menu-link">
								<span class="title">管理員管理員 ${login.adminEmail}</span> <span
									class="icon fa fa-angle-left"></span>
							</div>

							<div data-megamenu-id="mega-menu-2" class="mega-menu mega-menu-2">
								<div class="mega-menu-inner">
									<div>
										<div class="espard-menu">
											<div class="row row-xl-5">
												<!--Col-->

												<!--/-->
												<!--Col-->
												<div class="col">
													<p class="title">Quick Access</p>
													<ul>
														<li><a href="page-blog.html"> <span class="text">Blog/News</span>
														</a></li>
														<li><a href="page-single-post.html"> <span
																class="text">Single Post</span>
														</a></li>
														<li><a href="page-cooperation.html"> <span
																class="text">Cooperation</span>
														</a></li>
														<li><a href="page-departements.html"> <span
																class="text">Departements</span>
														</a></li>
														<li><a href="page-start.html"> <span class="text">Getting
																	Started!</span>
														</a></li>
													</ul>
												</div>
												<!--/-->
												<!--Col-->
												<div class="col">
													<p class="title">Dashboard</p>
													<ul>
														<li><a href="#"> <span class="text">Dashboard</span>
														</a></li>
														<li><a href="#"> <span class="text">Profile</span>
														</a></li>
														<li><a href="#"> <span class="text">Edit
																	Skills</span>
														</a></li>
														<li><a href="#"> <span class="text">Adding
																	Classrooms</span>
														</a></li>
													</ul>
												</div>
												<!--/-->
												<!--Col-->
												<div class="col">
													<p class="title">Other Pages</p>
													<ul>
														<li><a href="#"> <span class="text">Sign-In
																	Page</span>
														</a></li>
														<li><a href="#"> <span class="text">Sign-Up
																	Page</span>
														</a></li>
														<li><a href="#"> <span class="text">Link
																	Content</span>
														</a></li>
														<li><a href="#"> <span class="text">Link
																	Content</span>
														</a></li>
													</ul>
												</div>
												<!--/-->
												<!--Col-->
												<div class="col">
													<p class="title">Communication</p>
													<ul>
														<li><a href="page-about.html"> <span class="text">About
																	Us</span>
														</a></li>
														<li><a href="page-contact.html"> <span
																class="text">Contact Us</span>
														</a></li>
														<li><a href="page-faq.html"> <span class="text">FAQ</span>
														</a></li>
														<li><a href="page-policy.html"> <span
																class="text">Policy</span>
														</a></li>
													</ul>
												</div>
												<!--/-->
											</div>
										</div>
									</div>
								</div>
							</div>
						</li>
					</ul>
				</div>
				<div class="header-logo">
					<a href="index.html" class="primary-logo"> <span class="text-1">MoreThanEducate</span>
						<span class="text-2"></span>
					</a>
				</div>
				<div class="header-links">
					<a href="page-login.html"
						class="button button-md button-line-primary"> <span
						class="title">Sign In</span>
					</a> <a href="page-register.html"
						class="button button-md button-primary"> <span class="title">Sign
							Up</span>
					</a>
				</div>
			</div>
		</div>

<body>

<h3>Welcome  ${user.custid}</h3>

<h3>新增管理員</h3>

<form action="<c:url value='/admininsert.controller' />" method="get">
<table>
	
	<tr>
		<td style="width: 110px;">管理員密碼 :</td>
		<td><input type="text" name="adminPassword" value="${param.adminPassword}"></td>
		<td><span class="error">${errors.adminPassword}</span></td>
	</tr>
	<tr>
		<td style="width: 110px;">管理員信箱 :</td>
		<td><input type="text" name="adminEmail" style=" line-height: 2em;" value="${param.adminEmail}"></td>
		<td><span class="error">${errors.adminEmail}</span></td>
	</tr>
	
	<tr>
		<td>
			<input type="submit" name="adminBean" value="Insert">
		</td>
		<td>
			<input type="button" value="Clear" onclick="clearForm()">
		</td>
	</tr>
</table>

</form>

<h3><span class="error">${errors.action}</span></h3>

<c:if test="${not empty insert}">
<h3>新增管理員成功</h3>
<table border="1">
	<tr><td>管理員密碼</td><td>${insert.adminPassword}</td></tr>
	<tr><td>管理員信箱</td><td>${insert.adminEmail}</td></tr>
</table>
</c:if>
<h3><a href="javascript:window.history.go(-1);">點此返回布告欄</a></h3>
</body>
</html>