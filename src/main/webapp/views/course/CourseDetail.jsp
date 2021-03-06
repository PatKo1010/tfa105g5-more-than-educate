<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<!DOCTYPE html>
		<html>

		<head>
			<title>MoreThanEducate</title>
			<meta charset="UTF-8">
			<meta name="keywords" content="" />
			<meta name="description" content="" />
			<meta name="theme-color" content="#ffffff">
			<meta name="msapplication-TileColor" content="#9f00a7">
			<meta name="viewport" content="width=device-width, initial-scale=1.0" />
			<base href="../">

			<link rel="shortcut icon" href="../public/favicon.ico" />
			<link rel="stylesheet"
				href="https://fonts.googleapis.com/css?family=Poppins:100,300,500,600,700,900&display=swap">
			<link
				href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@200;300;400;600;700;800;900&display=swap"
				rel="stylesheet">
			<link rel="stylesheet" href="<%=request.getContextPath()%>/public/css/plugins.min.css" />
			<link rel="stylesheet" href="<%=request.getContextPath()%>/public/css/styles.css" />
		</head>

		<body>
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
										<span class="title">前往</span> <span class="icon fa fa-angle-left"></span>
									</div>
									<div data-megamenu-id="mega-menu-1" class="mega-menu mega-menu-1">
										<div class="mega-menu-inner">
											<div>
												<div class="espard-menu">
													<div class="row row-xl-5">
														<!--Col-->
														<div class="col">
															<p class="title">個人中心</p>
															<ul>
																<li><a
																		href="/tfa105g5-more-than-educate/views/member/dashboard.jsp">
																		<span class="text">個人首頁</span>
																	</a></li>
																<li><a
																		href="/tfa105g5-more-than-educate/views/member/profile.jsp">
																		<span class="text">個人資料</span>
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
							<a href="/tfa105g5-more-than-educate/index.jsp" class="primary-logo"> <span
									class="text-1">MoreThanEducate</span>
								<span class="text-2"></span>
							</a>
						</div>

						<div class="header-links">
							<!-- 如果未登入 -->
							<c:if test="${empty member}">
								<a href="<%=request.getContextPath()%>/views/member/login.jsp"
									class="button button-md button-light button-line-primary"> <span
										class="title">登入</span>
								</a>
								<a href="<%=request.getContextPath()%>/views/member/register.jsp"
									class="button button-md button-primary"> <span class="title">註冊</span>
								</a>
							</c:if>
							<!-- 如果已登入 -->
							<c:if test="${not empty member}">
								<form action="<%=request.getContextPath()%>/views/member/logout" method="post">
									<button class="button button-md button-light button-line-primary"
										type="submit">登出</button>
								</form>
							</c:if>
						</div>

						<div style="float: right;">
							<!-- 					<form action="/tfa105g5-more-than-educate/course/shoppingCart" method="post"> -->
							<input type="hidden" name="memid" value="${member.memid}">
						 	<a href="/tfa105g5-more-than-educate/views/course/CourseShoppingCart.html">
								<img src="<%=request.getContextPath()%>/public/shopping-cart2.ico"
									style="width: 40px; height: 35px;">
							</a>
							<!-- 					</form> -->
						</div>
					</div>
				</div>
			</header>
			<!--/-->
			<!--Wrapper-->
			<div class="app-wrapper">
				<div class="page page-course">
					<!--Course-->
					<section class="section section-course">
						<figure class="section-shape shape-2">
							<img class="img-fluid" src="assets/images/shapes/2.svg" alt="Image Description" />
						</figure>
						<div class="display-spacing display-spacing-plus">
							<div class="container">
								<div class="row mb--30">
									<div class="col-lg-8 col-xl-8 order-lg-1">
										<div class="el-panel el-panel-course-info">
											<!-- <div class="el-responsive-video">
                                            <iframe src="https://www.youtube.com/embed/tDS0GezECkc" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                                        </div> -->
											<div class="el-panel-body">
												<div class="course-summary">
													<div class="el-panel-title">
														<h1>課程介紹</h1>
													</div>
													<p>${course.courseintro}</p>
												</div>
											</div>
										</div>
									</div>
									<aside class="col-lg-4 col-xl-4 order-lg-2">
										<div class="sticky-sidebar">
											<div class="el-panel el-panel-course-widget">
												<div class="el-panel-body">
													<div class="teacher">
														<div class="avatar">
															<ul class="icons">
															</ul>
															<a href="page-teacher.html" target="_blank"> 
																<img
																	src="course/getMemberImg?courseid=${course.courseid}"
																	alt="teacher avatar">
															</a>
														</div>
														<p class="title">
															<a href="page-teacher.html" target="_blank">
																<span>${course.username}</span>
															</a>
														</p>
														<p class="excerpt">${course.coursetitle}</p>
													</div>
													<div class="el-panel-line">
														<div class="row row-0">
															<div class="col-6">
																<span class="label">課程總堂數：${course.classamount}</span>
															</div>
															<div class="col-6 text-right">
																<span class="label">價格：${course.price}</span>
															</div>
														</div>
													</div>

													<button
														class="button button-md button-block button-primary btn_addCart ">
														<span class="text">加入購物車</span>
													</button>
												</div>
											</div>
										</div>
									</aside>
								</div>
							</div>
						</div>
					</section>
					<!--/-->
				</div>
				<script src="<%=request.getContextPath()%>/public/js/jquery.min.js"></script>
				<script src="<%=request.getContextPath()%>/public/js/plugins.min.js"></script>
				<script src="<%=request.getContextPath()%>/public/js/main-scripts.js"></script>
				<script src="<%=request.getContextPath()%>/public/js/dashboard.js"></script>
				<script>

					$(".btn_addCart").on("click", e => {
						if ("${member.memid}") {
							fetch("/tfa105g5-more-than-educate/course/addShoppingCart", {
								method: "POST",
								headers: {
									'Content-Type': 'application/json'
								},
								body: JSON.stringify({
									'memid': '${member.memid}',
									'courseid': '${course.courseid}'
								})
							})
								.then(response => response.json())
								.then((data) => {
									console.log(data)
									alert('已經加入購物車');
								})

						} else {
							alert("請登入會員！")
						}
					})


				</script>
		</body>

		</html>