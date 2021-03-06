<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


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

    <link rel="shortcut icon" href="<%=request.getContextPath() %>/public/favicon.ico" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:100,300,500,600,700,900&display=swap">
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@200;300;400;600;700;800;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/public/css/plugins.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath() %>/public/css/styles.css" />
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
                <span class="title">??????</span>
                <span class="icon fa fa-angle-left"></span>
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
                                        <li>
                                            <a href="#">
                                                <span class="text">Teacher Profile</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="text">List of Teachers</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="text">Course Details</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="text">List of Courses</span>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                                <!--/-->
                                 <!--Col-->
                                 <div class="col">
                                    <p class="title">Quick Access</p>
                                    <ul>
                                        <li>
                                            <a href="page-blog.html">
                                                <span class="text">Blog/News</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="page-single-post.html">
                                                <span class="text">Single Post</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="page-cooperation.html">
                                                <span class="text">Cooperation</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="page-departements.html">
                                                <span class="text">Departements</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="page-start.html">
                                                <span class="text">Getting Started!</span>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                                <!--/-->
                                 <!--Col-->
                                 <div class="col">
                                    <p class="title">????????????</p>
                                    <ul>
                                        <li>
                                            <a href="<%=request.getContextPath() %>/views/member/dashboard.jsp">
                                                <span class="text">????????????</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="<%=request.getContextPath() %>/views/member/profile.jsp">
                                                <span class="text">????????????</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="text">Edit Skills</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="text">Adding Classrooms</span>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                                <!--/-->
                                 <!--Col-->
                                 <div class="col">
                                    <p class="title">Other Pages</p>
                                    <ul>
                                        <li>
                                            <a href="#">
                                                <span class="text">Sign-In Page</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="text">Sign-Up Page</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="text">Link Content</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <span class="text">Link Content</span>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                                <!--/-->
                                 <!--Col-->
                                 <div class="col">
                                    <p class="title">Communication</p>
                                    <ul>
                                        <li>
                                            <a href="page-about.html">
                                                <span class="text">About Us</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="page-contact.html">
                                                <span class="text">Contact Us</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="page-faq.html">
                                                <span class="text">FAQ</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="page-policy.html">
                                                <span class="text">Policy</span>
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
        <li>
            <a href="<%=request.getContextPath()%>/views/member/updateTeacherProfile.jsp">
                <span class="text">????????????</span>
                <span class="icon fa fa-angle-left"></span>
            </a>
        </li>
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
                        <button class="button button-md button-primary" type="submit">??????</button>
                    </form>
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
                    </a>
                    <a href="page-register.html" class="button button-md button-block button-primary">
                        <span class="text">Sign Up</span>
                    </a>
                </div>
                <ul>
                    <li>
                        <a href="home.html">
                            <span class="text">Home</span>
                            <span class="icon fa fa-angle-right"></span>
                        </a>
                    </li>
                    <li class="has-menu">
                        <a href="#">
                            <span class="text">All Pages</span>
                            <span class="icon fa fa-angle-right"></span>
                        </a>
                        <div class="mega-menu">
                            <p class="title">Quick Access</p>
                            <ul class="sidenav-menu-ul">
                                <li>
                                    <a href="page-blog.html">
                                        <span class="text">Blog/News</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-single-post.html">
                                        <span class="text">Single Post</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-cooperation.html">
                                        <span class="text">Cooperation</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-start.html">
                                        <span class="text">Getting Started!</span>
                                    </a>
                                </li>
                            </ul>
                            <p class="title">Quick Access</p>
                            <ul class="sidenav-menu-ul">
                                <li>
                                    <a href="page-teacher.html">
                                        <span class="text">Teacher</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-teachers.html">
                                        <span class="text">List of Teachers</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-course.html">
                                        <span class="text">Course Details</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-courses.html">
                                        <span class="text">List of Courses</span>
                                    </a>
                                </li>
                            </ul>
                            <p class="title">Dashboard</p>
                            <ul class="sidenav-menu-ul">
                                <li>
                                    <a href="teacher/dashboard.html">
                                        <span class="text">Dashboard</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="teacher/dashboard-profile.html">
                                        <span class="text">Profile</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="teacher/dashboard-skills.html">
                                        <span class="text">Edit Skills</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="teacher/dashboard-classrooms.html">
                                        <span class="text">Classrooms</span>
                                    </a>
                                </li>
                            </ul>
                            <p class="title">Communication</p>
                            <ul class="sidenav-menu-ul">
                                <li>
                                    <a href="page-about.html">
                                        <span class="text">About Us</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-contact.html">
                                        <span class="text">Contact Us</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-faq.html">
                                        <span class="text">FAQ</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-policy.html">
                                        <span class="text">Policy</span>
                                    </a>
                                </li>
                            </ul>
                            <p class="title">Other Pages</p>
                            <ul class="sidenav-menu-ul">
                                <li>
                                    <a href="page-login.html">
                                        <span class="text">Sign-In</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-register.html">
                                        <span class="text">Sign-Up</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="page-departements.html">
                                        <span class="text">Departements</span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li class="has-menu">
                        <a href="#">
                            <span class="text">Languages</span>
                            <span class="icon fa fa-angle-right"></span>
                        </a>
                        <div class="mega-menu">
                            <ul>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/uk.svg" alt="alt" />
                                            <h3>English</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/germany.svg" alt="alt" />
                                            <h3>German</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/france.svg" alt="alt" />
                                            <h3>French</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/italy.svg" alt="alt" />
                                            <h3>Italian</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/china.svg" alt="alt" />
                                            <h3>Chinese</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/japan.svg" alt="alt" />
                                            <h3>Japanese</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/south-korea.svg" alt="alt" />
                                            <h3>Korean</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/russia.svg" alt="alt" />
                                            <h3>Russian</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/arabic.svg" alt="alt" />
                                            <h3>Arabic</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/turkey.svg" alt="alt" />
                                            <h3>Turkish</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/iran.svg" alt="alt" />
                                            <h3>Persian</h3>
                                        </a>
                                    </div>
                                </li>
                                <li class="el-flag">
                                    <div class="inner">
                                        <a href="page-departements.html">
                                            <img src="assets/images/flags/spain.svg" alt="alt" />
                                            <h3>Spanish</h3>
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a href="page-teachers.html">
                            <span class="text">Teachers</span>
                            <span class="icon fa fa-angle-right"></span>
                        </a>
                    </li>
                    <li>
                        <a href="page-courses.html">
                            <span class="text">Courses</span>
                            <span class="icon fa fa-angle-right"></span>
                        </a>
                    </li>
                    <li>
                        <a href="page-cooperation.html">
                            <span class="text">Join Now.</span>
                            <span class="icon fa fa-angle-right"></span>
                        </a>
                    </li>
                    <li>
                        <a href="page-start.html">
                            <span class="text">Let's get started</span>
                            <span class="icon fa fa-angle-right"></span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <span class="sidenav-close"></span>
</div>
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
                    <h2>????????????</h2>
                </div>
                <ul class="el-list-icon">
                    <li>
                        <a href="<%=request.getContextPath() %>/views/member/updateTeacherProfile.jsp">
                            <i class="fa fa-cog"></i>
                            <span class="text">????????????</span>
                        </a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath() %>/views/member/updateTeacherSkills.jsp">
                            <i class="fa fa-cog"></i>
                            <span class="text">????????????</span>
                        </a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath() %>/views/course/CourseOverview1.html">
                            <i class="fa fas fa-book"></i>
                            <span class="text">??????????????????</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </aside>
</div>
<div class="col-12 col-sm-12 col-md-12 col-lg-8">
	<div class="el-panel">
		<div class="el-panel-body">
			<div class="el-panel-title">
				<h2>????????????</h2>
			</div>
			<form class="form-3" action="<%=request.getContextPath()%>/views/course.update" method="post">
			
				  	<input type="hidden" name="courseid" value="${param.courseid}">
												
                    <input type="hidden" name="memid" value="${param.memid}">
			
				<div class="row">
					
					<div class="col-12 col-sm-12 col-md-12 col-lg-12">
						<div class="form-item">
							<label for="input-type" class="form-label">???????????????</label> 
                            <input type="text" name="coursetitle" value="${param.coursetitle}">
                            <span class="errors" style="color:red;">${errors.coursetitle}</span>
						</div>
					</div>
					<div class="col-12">
						<hr>
					</div>
					<div class="col-12 col-sm-12 col-md-6">
												<div class="form-item">
													<label for="input-type" class="form-label">???????????????</label>
													<div class="input-select">
														<select class="el-select2-select-hour" name="expertiseid" required>
															<option value="">&nbsp;</option>
															<option <c:if test='${expertiseid == 2001}'>selected</c:if> value="2001">TOEIC</option>
															<option <c:if test='${expertiseid == 2002}'>selected</c:if> value="2002">TOEFL</option>
															<option <c:if test='${expertiseid == 2003}'>selected</c:if> value="2003">IELTS</option>
															<option <c:if test='${expertiseid == 2004}'>selected</c:if> value="2004">GEPT</option>
															<option <c:if test='${expertiseid == 2005}'>selected</c:if> value="2005">????????????</option>
														</select>
														<span class="errors" style="color:red;">${errors.expertiseid}</span>
													</div>
												</div>
											</div>
					<div class="col-12 col-sm-12 col-md-3">
						<div class="form-item">
								<label for="input-type" class="form-label">??????????????????</label>
							<div>
                               <input onkeypress="return (/[\d]/.test(String.fromCharCode(event.keyCode)))" type="number" name="classamount" value="${param.classamount}">
                               <span class="errors" style="color:red;">${errors.classamount}</span>
							</div>
						</div>
					</div>
					<div class="col-12 col-sm-12 col-md-3">
						<div class="form-item">
								<label for="input-type" class="form-label">???????????????</label>
							<div>
                              <input onkeypress="return (/[\d]/.test(String.fromCharCode(event.keyCode)))" type="number" name="price" value="${param.price}">
                              <span class="errors" style="color:red;">${errors.price}</span>
							</div>
						</div>
					</div>
					<div class="col-12">
						<hr>
					</div>
					<div class="col-12 col-sm-12 col-md-12 pt-15">
						<div class="form-item">
							<label class="form-label">???????????????</label>
							<textarea name="courseintro">${param.courseintro}</textarea>
                            <span class="errors" style="color:red;">${errors.courseintro}</span>
						</div>
					</div>
					<h3><span class="errors">${errors.action}</span></h3>
					<div class="col-12">
						<hr>
					</div>
					<div class="col-12">
						<div class="form-item mb-0">
							<input type="hidden" value="??????">
							<input type="submit" class="button button-md button-block button-primary" value="??????">
						</div>
					</div>
				</div>
			</form>
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
	
	
	
	
	
	
	
	<style>
/* 		input{ */
/* 			color:black; */
/* 			background:#ccc; */
/* 			border:1 none; */
/* 			border-radius:5px; */
/* 		} */
		
		textarea{
			color:black;
			resize:none;
			width:300px;
			height:300px;
			border-radius:5px;
		}
	</style>
	
	
	
	
	
</body>

</html>