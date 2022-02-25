<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-Hant" dir="ltr">

<head>
<title>MoreThanEducate</title>
<meta name="theme-color" content="#ffffff">
<meta name="msapplication-TileColor" content="#9f00a7">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<base href="../">

<link rel="shortcut icon" href="language.ico" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Poppins:100,300,500,600,700,900&display=swap">
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@200;300;400;600;700;800;900&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="<%=request.getContextPath()%>/public/css/plugins.min.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/public/css/styles.css" />
</head>

<body>
	<!-- Loading -->
	<div id="preloader" class="preloader">
		<div class="preloader-inner">
			<div class="preloader-6">
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
			</div>
		</div>
	</div>
	<!-- / -->
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
				<div class="header-menu"></div>
				<div class="header-logo">
					<a href="index.html" class="primary-logo"> <span class="text-1">MoreThanEducate</span>
						<span class="text-2"></span>
					</a>
				</div>
				<div class="header-links">
					<a href="page-login.html"
						class="button button-md button-line-primary"> <span
						class="title">登入</span>
					</a> <a href="page-register.html"
						class="button button-md button-primary"> <span class="title">註冊</span>
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
												<h2>設定</h2>
											</div>
											<ul class="el-list-icon">
												<li><a href="teacher/dashboard-profile.html"> <i
														class="fa fa-cog"></i> <span class="text">個人資料</span>
												</a></li>
												<li><a href="teacher/dashboard-courses.html"> <i
														class="fa fas fa-book"></i> <span class="text">課程</span>
												</a></li>

											</ul>
										</div>
									</div>
									<div class="el-panel el-panel-financial bg-primary">
										<div class="el-panel-body">
											<p class="text-center text-light">近期收益</p>
											<p class="price">
												<span class="currency">$0</span>
											</p>
											<a href="student/dashboard-wallet.html"
												class="button button-md button-radius button-block button-light">
												<span class="text text-center text-primary">錢包</span>
											</a>
										</div>
									</div>
								</aside>
							</div>
							<div class="col-12 col-sm-12 col-md-12 col-lg-8">
								<div class="el-panel">
									<div class="el-panel-body">
										<div class="el-panel-title">
											<h2>課程</h2>
										</div>
										<form action="<%=request.getContextPath()%>/views/course.update" method="post">
											<div>
												
													<div class="col-12 col-sm-12 col-md-6">
														<label for="input-type" class="form-label">課程編號：</label> 
                                                        <input type="text" name="courseid" value="${param.courseid}">
                                                        <span class="errors">${errors.courseid}</span>
													</div>
												
											</div>
										
											<div>
												
													<div class="col-12 col-sm-12 col-md-6">
														<label for="input-type" class="form-label">會員編號：</label> 
                                                        <input type="text" name="memid" value="${param.memid}">
                                                        <span class="errors">${errors.memid}</span>
													</div>
												
											</div>
											<br>
											<div>
												
													<div class="col-12 col-sm-12 col-md-6">
														<label for="input-type" class="form-label">專精編號：</label>
                                                        <input type="text" name="expertiseid" value="${param.expertiseid}">
                                                        <span class="errors">${errors.expertiseid}</span>
													</div>
												
											</div>
											<br>
											<div>
													<div class="col-12 col-sm-12 col-md-6">
														<label for="input-type" class="form-label">課程名稱：</label> 
                                                        <input type="text" name="coursetitle" value="${param.coursetitle}">
                                                        <span class="errors">${errors.coursetitle}</span>
													</div>
											</div>
											<br>
											<div>
													<div class="col-12 col-sm-12 col-md-6">
														<label for="input-type" class="form-label">課程簡介：</label> 
                                                        <input type="text" name="courseintro" value="${param.courseintro}">
                                                            <span class="errors">${errors.courseintro}</span>
													</div>
											</div>
											<br>
											<div>
													<div class="col-12 col-sm-12 col-md-6">
														<label for="input-type" class="form-label">課程總堂數：</label>
														<input type="text" name="classamount" value="${param.classamount}">
                                                        <span class="errors">${errors.classamount}</span>
													</div>
											</div>
											<br>
											<div>
													<div class="col-12 col-sm-12 col-md-6">
														<label for="input-type" class="form-label">課程價格：</label>
                                                        <input type="text" name="price" value="${param.price}">
                                                            <span class="errors">${errors.price}</span>
													</div>
											</div>
											<h3><span class="errors">${errors.action}</span></h3>
											<br>
											<div class="col-12">
												<div class="form-item mb-0">
													<input type="hidden" name="production" value="修改">
													<input type="submit"
														class="button button-md button-block button-primary"
														value="修改">
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</section>
		</div>
		<!--/-->
	</div>

	<script src="<%=request.getContextPath()%>/public/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/public/js/plugins.min.js"></script>
	<script src="<%=request.getContextPath()%>/public/js/main-scripts.js"></script>
	<script src="<%=request.getContextPath()%>/public/js/dashboard.js"></script>
</body>

</html>