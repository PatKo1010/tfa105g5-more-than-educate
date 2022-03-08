<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

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
								<span class="title">管理員 ${login.adminEmail}</span> <span
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
			</div>
		</div>
	</header>
	<!--/-->
	<!--Wrapper-->
	<div class="app-wrapper">
		<div class="page page-dashboard page-dashboard-student">
			<!--Section-->
			<section class="section section-dashboard section-dashboard-student">
				<div class="container">
					<div class="display-spacing display-spacing-plus">
						<div class="row">
							<div class="col-12 col-sm-12 col-md-12 col-lg-4">
								<aside class="sidebar">
									<div class="el-panel el-panel-teacher-widget">
										<div class="el-panel-body">
											<div class="el-panel-title">
												<h2>布告欄</h2>
											</div>
											<ul class="el-list-icon">
												<li><a href="<%=request.getContextPath()%>
													/views/bullet/resources/bulletinsert.jsp"> 新增布告欄</a>
											</ul>
											<ul class="el-list-icon">

												<li><a class="opcion"
													href="<%=request.getContextPath()%>/bulletlistall.controller"
													method="get">列出所有布告欄</a></li>
											</ul>
											<ul class="el-list-icon">
												<li><a href="<%=request.getContextPath()%>
													/views/bullet/resources/bulletdelete.jsp"> 刪除布告欄</a>
											</ul>

										</div>
									</div>
								</aside>
							</div>
							<div class="col-12 col-sm-12 col-md-12 col-lg-8">
								<div class="el-panel">
									<div class="el-panel-body">
										<h3>Welcome ${user.custid}</h3>

										<h3>搜尋布告欄</h3>

										<form
											action="<%=request.getContextPath()%>/bulletselect.controller"
											method="get">
											<table>
												<tr>
													<td style="width: 20px; text-align: left;">布告欄編號 :</td>
													<td><input type="text" name="bulletId"
														value="${param.bulletId}" /></td>
													<td><span class="error">${errors.bulletId}</span></td>
												</tr>
												<tr>
													<td style=text-align:;><input type="submit"
														name="BulletBeanselectbyid" value="根據布告欄編號查詢" /></td>
												</tr>
											</table>
										</form>
										<form
											action="<%=request.getContextPath()%>/bulletselectbyadminid.controller"
											method="get">
											<table>
												<tr>
													<td style="width: 20px; text-align: left;">管理員編號 :</td>
													<td><input type="text" name="adminId"
														value="${param.adminId}"></td>
													<td><span class="error">${errors.adminId}</span></td>
												</tr>
												<tr>
													<td><input type="submit"
														name="BulletBeanselectbyadminid" value="根據管理員編號查詢"></td>
												</tr>
											</table>

										</form>

										<h3>
											<span class="error">${errors.action}</span>
										</h3>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</section>
			<!--/-->
		</div>
	</div>
	<script
		src="<%=request.getContextPath()%>/resources/assets/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/js/plugins.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/js/main-scripts.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/js/dashboard.js"></script>
	<h3>
		<a href="javascript:window.history.go(-1);">點此返上一頁</a>
	</h3>
</body>
</html>