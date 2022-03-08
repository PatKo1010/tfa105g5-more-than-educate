<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!DOCTYPE html>
		<html lang="en" dir="ltr">

		<head>
			<title>MoreThanEducate</title>
			<meta charset="UTF-8" />
			<meta name="keywords" content="" />
			<meta name="description" content="" />
			<meta name="theme-color" content="#ffffff">
			<meta name="msapplication-TileColor" content="#9f00a7">
			<title>MoreThanEducate</title>
			<meta charset="UTF-8" />
			<meta name="viewport" content="width=device-width, initial-scale=1.0" />
			<link rel="shortcut icon" href="../../public/favicon.ico" />
			<link rel="stylesheet"
				href="https://fonts.googleapis.com/css?family=Poppins:100,300,500,600,700,900&display=swap">
			<link rel="stylesheet" href="<%=request.getContextPath()%>/public/css/plugins.min.css" />
			<link rel="stylesheet" href="<%=request.getContextPath()%>/public/css/search.css">
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
						<div class="header-menu">
							<ul>

								<li class="has-menu" data-megamenu-link="mega-menu-1">
									<div class="mega-menu-link">
										<span class="title">前往</span>
										<span class="icon fa fa-angle-left"></span>
									</div>
									<div data-megamenu-id="mega-menu-1" class="mega-menu mega-menu-1">
										<div class="mega-menu-inner">
											<div>
												<div class="espard-menu">
													<div class="row row-xl-5">
														<!--Col-->
														<div class="col">
															<p class="title">學生中心</p>
															<ul>
																<li>
																	<a
																		href="<%=request.getContextPath() %>/views/member/dashboard.jsp">
																		<span class="text">學生首頁</span>
																	</a>
																</li>
																<li>
																	<a
																		href="<%=request.getContextPath() %>/views/member/profile.jsp">
																		<span class="text">學生資料</span>
																	</a>
																</li>
																<li>
																	<a
																		href="<%=request.getContextPath() %>/views/orderDetail/StudentCourse.html">
																		<span class="text">學生課程</span>
																	</a>
																</li>
															</ul>
														</div>
														<!--/-->
													</div>
												</div>
											</div>
										</div>
									</div>
								</li>
								<!-- 學生中心 -->
								<li>
									<a href="<%=request.getContextPath() %>/views/member/dashboard.jsp">
										<span class="text">學生中心</span>
										<span class="icon fa fa-angle-left"></span>
									</a>
								</li>
								<!-- 申請成老師 -->
								<c:if test="${member.teaqual == false}">
									<li>
										<a href="<%=request.getContextPath() %>/views/member/regiTeacherProfile.jsp">
											<span class="text">申請成為教師</span>
											<span class="icon fa fa-angle-left"></span>
										</a>
									</li>
								</c:if>
								<!-- 已成為老師 -->
								<c:if test="${member.teaqual == true}">
									<li>
										<a href="<%=request.getContextPath() %>/views/member/updateTeacherProfile.jsp">
											<span class="text">教師中心</span>
											<span class="icon fa fa-angle-left"></span>
										</a>
									</li>
								</c:if>
							</ul>
						</div>
						<div class="header-logo">
							<a href="<%=request.getContextPath() %>/index.jsp" class="primary-logo">
								<span class="text-1">MoreThanEducate</span>
								<span class="text-2"></span>
							</a>
						</div>
						<div class="header-links">
							<form action="<%= request.getContextPath() %>/views/member/logout" method="post">
								<button class="button button-md button-primary" type="submit">登出</button>
							</form>
						</div>
					</div>
				</div>
			</header>

			<!--Wrapper-->
			<div class="app-wrapper">
				<div class="page page-teachers">
					<!--Teachers-->
					<section class="section section-teachers section-teachers-list section-teachers-list-1">
						<figure class="section-shape shape-2">
							<img src="assets/images/shapes/2.svg" alt="Image Description" />
						</figure>
						<figure class="section-shape shape-3">
							<img src="assets/images/shapes/3.svg" alt="Image Description" />
						</figure>
						<div class="display-spacing display-spacing-double">
							<div class="container">
								<div class="mb-30">
									<div class="section-navbar">
										<div class="row">
											<div class="col-12 col-sm-12 col-md-6">
												<div class="el-sortination">
													<p>
														<span class="nowtitle">目前排序</span>
													</p>
													<ul>


														<form name="form4" method="post"
															action="<%=request.getContextPath()%>/search.controller">
															<button class="favorpriority" onmouseover="mouseover(event)"
																onmouseout="mouseout(event)">優質教師優先</button>
															<input type="hidden" name="action"
																value="goodOrder"></input>
														</form>
														<form name="form5" method="post"
															action="<%=request.getContextPath()%>/search.controller">
															<button class="newpriority" onmouseover="mouseover(event)"
																onmouseout="mouseout(event)">新教師優先</button>
															<input type="hidden" name="action" value="newOrder"></input>
														</form>
													</ul>
												</div>
											</div>

										</div>
									</div>
								</div>
								<div class="sysRecBar">
									<c:forEach var="member" items="${members}">

										<form name="form" method="post"
											action="<%=request.getContextPath()%>/search.controller">
											<div class="bar1" onmouseover="barmouseover(event)"
												onmouseout="barmouseout(event)">
												<input type="hidden" name="action" value="showTeacher"></input>
										</form>
										<img class="person1"
											src="<%=request.getContextPath()%>/member/getTeahcerPic?memid=${member.memid}"
											alt="尚無圖片">
										<div class="membertitle" onclick="direct(${member.memid})"
											onmouseover="mouseover(event)" onmouseout="mouseout(event)">
											${member.username} ${member.teatitle}</div>
										<div class="comment">
											<img src="<%=request.getContextPath()%>/public/images/star.png"
												class="starimg"> ${member.ratesum} · ${member.ratecount}個評論
										</div>

										<div class="introduction1">
											${member.introcontent}
										</div>
										<div class="selfbotton">
											<form name="form3" method="post"
												action="<%=request.getContextPath()%>/search.controller">
												<button class="reserve1">聯繫老師</button>
												<input type="hidden" name="action" value="contact"></input>
											</form>
										</div>
								</div>
								</c:forEach>
							</div>
							<br>
							<br>
							<br>
						</div>
				</div>
			</div>
			</section>
			<!--/-->
			</div>
			<!--Footer-->
			<footer class="section app-footer app-footer-2">
				<div class="footer-info">
					<div class="container"></div>
				</div>
				<div class="footer-widgets">
					<div class="container">
						<div class="footer-widgets-links">
							<div class="row row-xl-5">
								<div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
									<div class="widget widget-links">
										<div class="widget-title">
											<h4>Quick Access</h4>
										</div>
										<div class="widget-body">
											<ul>
												<li><a href="page-cooperation.html"> <span
															class="icon ti-angle-left"></span> <span class="text">Apply
															to Teach</span>
													</a></li>
												<li><a href="page-teachers.html"> <span
															class="icon ti-angle-left"></span> <span class="text">Search
															for Teachers</span>
													</a></li>
												<li><a href="page-courses.html"> <span
															class="icon ti-angle-left"></span> <span class="text">List
															of Courses</span>
													</a></li>
												<li><a href="page-departements.html"> <span
															class="icon ti-angle-left"></span> <span
															class="text">Departments</span>
													</a></li>
											</ul>
										</div>
									</div>
								</div>
					
								<div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
									<div class="widget widget-links">
										<div class="widget-title">
											<h4>Languages</h4>
										</div>
										<div class="widget-body">
											<ul>
												<li><a href="page-departements.html"> <span
															class="icon ti-angle-left"></span> <span class="text">Learn
															English</span>
													</a></li>
												<li><a href="page-departements.html"> <span
															class="icon ti-angle-left"></span> <span class="text">Learn
															Spanish</span>
													</a></li>
												<li><a href="page-departements.html"> <span
															class="icon ti-angle-left"></span> <span class="text">Learn
															German</span>
													</a></li>
												<li><a href="page-departements.html"> <span
															class="icon ti-angle-left"></span> <span class="text">Learn
															French</span>
													</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
									<div class="widget widget-links">
										<div class="widget-title">
											<h4>Teachers</h4>
										</div>
										<div class="widget-body">
											<ul>
												<li><a href="page-teachers.html"> <span
															class="icon ti-angle-left"></span> <span
															class="text">English
															Tutors</span>
													</a></li>
												<li><a href="page-teachers.html"> <span
															class="icon ti-angle-left"></span> <span
															class="text">Spanish
															Tutors</span>
													</a></li>
												<li><a href="page-teachers.html"> <span
															class="icon ti-angle-left"></span> <span class="text">French
															Tutors</span>
													</a></li>
												<li><a href="page-teachers.html"> <span
															class="icon ti-angle-left"></span> <span
															class="text">Japanese
															Tutors</span>
													</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
									<div class="widget widget-links">
										<div class="widget-title">
											<h4>Communication</h4>
										</div>
										<div class="widget-body">
											<ul>
												<li><a href="page-about.html"> <span class="icon ti-angle-left"></span>
														<span class="text">About
															Us</span>
													</a></li>
												<li><a href="page-contact.html"> <span
															class="icon ti-angle-left"></span> <span
															class="text">Contact
															Us</span>
													</a></li>
												<li><a href="page-faq.html"> <span class="icon ti-angle-left"></span>
														<span class="text">Faq</span>
													</a></li>
												<li><a href="page-policy.html"> <span class="icon ti-angle-left"></span>
														<span class="text">Policy</span>
													</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="footer-copyright">
					<div class="container">
						<span class="footer-line"></span>
						<div class="row">
							<div class="col-md-8">
								<p>© 2020 All Rights Reserved</p>
							</div>
							<div class="col-md-4">
								<ul class="el-social-links">
									<li><a href="#"> <span class="fa fa-facebook"></span>
										</a></li>
									<li><a href="#"> <span class="fa fa-google"></span>
										</a></li>
									<li><a href="#"> <span class="fa fa-linkedin"></span>
										</a></li>
									<li><a href="#"> <span class="fa fa-twitter"></span>
										</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</footer>
			</div>
			<script type="text/javascript" src="<%=request.getContextPath()%>/public/js/searchresult.js"></script>
			<script src="<%=request.getContextPath() %>/public/js/jquery-3.4.1.min.js"></script>
			<scirpt src="<%=request.getContextPath()%>/public/js/searchresult.js"></scirpt>
			<script src="<%=request.getContextPath()%>/public/js/jquery.min.js"></script>
			<script src="<%=request.getContextPath()%>/public/js/plugins.min.js"></script>
			<script src="<%=request.getContextPath()%>/public/js/main-scripts.js"></script>
		</body>

		</html>