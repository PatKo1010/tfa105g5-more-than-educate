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
															<p class="title">Quick Access</p>
															<ul>
																<li><a href="#"> <span class="text">Teacher
																			Profile</span>
																	</a></li>
																<li><a href="#"> <span class="text">List
																			of Teachers</span>
																	</a></li>
																<li><a href="#"> <span class="text">Course
																			Details</span>
																	</a></li>
																<li><a href="#"> <span class="text">List
																			of Courses</span>
																	</a></li>
															</ul>
														</div>
														<!--/-->
														<!--Col-->
														<div class="col">
															<p class="title">Quick Access</p>
															<ul>
																<li><a href="page-blog.html"> <span
																			class="text">Blog/News</span>
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
																<li><a href="page-start.html"> <span
																			class="text">Getting
																			Started!</span>
																	</a></li>
															</ul>
														</div>
														<!--/-->
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
																<li><a href="page-faq.html"> <span
																			class="text">FAQ</span>
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
								<li><a href="/tfa105g5-more-than-educate/views/member/teacherProfile.jsp">
										<span class="text">成為老師</span> <span class="icon fa fa-angle-left"></span>
									</a></li>
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
							<a
								href="http://localhost:7080/tfa105g5-more-than-educate/views/course/CourseShoppingCart.html">
								<img src="<%=request.getContextPath()%>/public/shopping-cart1.ico"
									style="width: 40px; height: 35px;">
							</a> <a
								href="http://localhost:7080/tfa105g5-more-than-educate/views/course/CourseShoppingCart.html">
								<img src="<%=request.getContextPath()%>/public/shopping-cart2.ico"
									style="width: 40px; height: 35px;">
							</a>
							<!-- 					</form> -->
						</div>
					</div>
				</div>
			</header>
			<!--/-->
			<!--Sidenav-->
			<div class="app-sidenav app-sidenav-1">
				<div class="sidenav-menu">
					<div class="sidenav-head">
						<img src="assets/images/sidenav.jpg" alt="sidenav banner">
						<button class="button button-close-sidenav"></button>
					</div>
					<div class="sidenav-body">
						<div class="sidenav-body-inner">
							<div class="sidenav-links">
								<a href="page-login.html" class="button button-md button-block button-line-primary">
									<span class="text">Sign In</span>
								</a> <a href="page-register.html" class="button button-md button-block button-primary">
									<span class="text">Sign Up</span>
								</a>
							</div>
							<ul>
								<li><a href="home.html"> <span class="text">Home</span> <span
											class="icon fa fa-angle-right"></span>
									</a></li>
								<li class="has-menu"><a href="#"> <span class="text">All
											Pages</span> <span class="icon fa fa-angle-right"></span>
									</a>
									<div class="mega-menu">
										<p class="title">Quick Access</p>
										<ul class="sidenav-menu-ul">
											<li><a href="page-blog.html"> <span class="text">Blog/News</span>
												</a></li>
											<li><a href="page-single-post.html"> <span class="text">Single Post</span>
												</a></li>
											<li><a href="page-cooperation.html"> <span class="text">Cooperation</span>
												</a></li>
											<li><a href="page-start.html"> <span class="text">Getting
														Started!</span>
												</a></li>
										</ul>
										<p class="title">Quick Access</p>
										<ul class="sidenav-menu-ul">
											<li><a href="page-teacher.html"> <span class="text">Teacher</span>
												</a></li>
											<li><a href="page-teachers.html"> <span class="text">List
														of Teachers</span>
												</a></li>
											<li><a href="page-course.html"> <span class="text">Course
														Details</span>
												</a></li>
											<li><a href="page-courses.html"> <span class="text">List
														of Courses</span>
												</a></li>
										</ul>
										<p class="title">Dashboard</p>
										<ul class="sidenav-menu-ul">
											<li><a href="teacher/dashboard.html"> <span class="text">Dashboard</span>
												</a></li>
											<li><a href="teacher/dashboard-profile.html"> <span
														class="text">Profile</span>
												</a></li>
											<li><a href="teacher/dashboard-skills.html"> <span class="text">Edit
														Skills</span>
												</a></li>
											<li><a href="teacher/dashboard-classrooms.html"> <span
														class="text">Classrooms</span>
												</a></li>
										</ul>
										<p class="title">Communication</p>
										<ul class="sidenav-menu-ul">
											<li><a href="page-about.html"> <span class="text">About
														Us</span>
												</a></li>
											<li><a href="page-contact.html"> <span class="text">Contact
														Us</span>
												</a></li>
											<li><a href="page-faq.html"> <span class="text">FAQ</span>
												</a></li>
											<li><a href="page-policy.html"> <span class="text">Policy</span>
												</a></li>
										</ul>
										<p class="title">Other Pages</p>
										<ul class="sidenav-menu-ul">
											<li><a href="page-login.html"> <span class="text">Sign-In</span>
												</a></li>
											<li><a href="page-register.html"> <span class="text">Sign-Up</span>
												</a></li>
											<li><a href="page-departements.html"> <span class="text">Departements</span>
												</a></li>
										</ul>
									</div>
								</li>
								<li class="has-menu"><a href="#"> <span class="text">Languages</span>
										<span class="icon fa fa-angle-right"></span>
									</a>
									<div class="mega-menu">
										<ul>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/uk.svg" alt="alt" />
														<h3>English</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/germany.svg" alt="alt" />
														<h3>German</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/france.svg" alt="alt" />
														<h3>French</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/italy.svg" alt="alt" />
														<h3>Italian</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/china.svg" alt="alt" />
														<h3>Chinese</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/japan.svg" alt="alt" />
														<h3>Japanese</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/south-korea.svg" alt="alt" />
														<h3>Korean</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/russia.svg" alt="alt" />
														<h3>Russian</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/arabic.svg" alt="alt" />
														<h3>Arabic</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/turkey.svg" alt="alt" />
														<h3>Turkish</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/iran.svg" alt="alt" />
														<h3>Persian</h3>
													</a>
												</div>
											</li>
											<li class="el-flag">
												<div class="inner">
													<a href="page-departements.html"> <img
															src="assets/images/flags/spain.svg" alt="alt" />
														<h3>Spanish</h3>
													</a>
												</div>
											</li>
										</ul>
									</div>
								</li>
								<li><a href="page-teachers.html"> <span class="text">Teachers</span>
										<span class="icon fa fa-angle-right"></span>
									</a></li>
								<li><a href="page-courses.html"> <span class="text">Courses</span>
										<span class="icon fa fa-angle-right"></span>
									</a></li>
								<li><a href="page-cooperation.html"> <span class="text">Join
											Now.</span> <span class="icon fa fa-angle-right"></span>
									</a></li>
								<li><a href="page-start.html"> <span class="text">Let's
											get started</span> <span class="icon fa fa-angle-right"></span>
									</a></li>
							</ul>
						</div>
					</div>
				</div>
				<span class="sidenav-close"></span>
			</div>
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
																<!-- 														<li> -->
																<!-- 															<div class="icon-lang"> -->
																<!-- 																<img src="course/getMemberImg" alt="Lang" /> -->
																<!-- 															</div> -->
																<!-- 														</li> -->
															</ul>
															<a href="page-teacher.html" target="_blank"> <img
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
									memid: '${member.memid}',
									courseid: '${course.courseid}'
								})
							})
								.then(

									alert("已加入購物車！")
								)
						} else {
							alert("請登入會員！")
						}
					})


				</script>
		</body>

		</html>