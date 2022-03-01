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
 
    <link rel="shortcut icon" href="<%=request.getContextPath() %>/public/favicon.ico" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:100,300,500,600,700,900&display=swap">
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
    <!--/-->
    <!--Header-->
    <header class="app-header app-header-1 empty">
        <div class="container">
            <div class="header-wrap">
                <button class="button button-menu button-open-sidenav">
                    <span></span>
                </button>
                <div class="header-menu">
    <ul>
<!--         <li class="has-menu" data-megamenu-link="mega-menu-1"> -->
<!--             <div class="mega-menu-link"> -->
<!--                 <span class="title">Languages</span> -->
<!--                 <span class="icon fa fa-angle-left"></span> -->
<!--             </div> -->
<!--             <div data-megamenu-id="mega-menu-1" class="mega-menu mega-menu-1"> -->
<!--                 <div class="mega-menu-inner"> -->
<!--                     <div> -->
<!--                         <div class="megamenu-info mb-15"> -->
<!--                             <p class="text-center mb-30">Lorem, ipsum dolor sit amet consectetur adipisicing elit.</p> -->
<!--                         </div> -->
<!--                         <div class="row row-lg-5 row-xl-5"> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/uk.svg" alt="alt"> -->
<!--                                         <span class="title">English</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/germany.svg" alt="alt"> -->
<!--                                         <span class="title">Germany</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/france.svg" alt="alt"> -->
<!--                                         <span class="title">French</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/italy.svg" alt="alt"> -->
<!--                                         <span class="title">Italian</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/spain.svg" alt="alt"> -->
<!--                                         <span class="title">Spanish</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/portugal.svg" alt="alt"> -->
<!--                                         <span class="title">Portuguese</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/china.svg" alt="alt"> -->
<!--                                         <span class="title">Mandarin</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/japan.svg" alt="alt"> -->
<!--                                         <span class="title">Japanese</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/south-korea.svg" alt="alt"> -->
<!--                                         <span class="title">Korean</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/russia.svg" alt="alt"> -->
<!--                                         <span class="title">Russian</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/india.svg" alt="alt"> -->
<!--                                         <span class="title">Hindi</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/arabic.svg" alt="alt"> -->
<!--                                         <span class="title">Arabic</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/iran.svg" alt="alt"> -->
<!--                                         <span class="title">Persian</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/turkey.svg" alt="alt"> -->
<!--                                         <span class="title">Turkish</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/iran.svg" alt="alt"> -->
<!--                                         <span class="title">Kurdish</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/vietnam.svg" alt="alt"> -->
<!--                                         <span class="title">Vietnamese</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/india.svg" alt="alt"> -->
<!--                                         <span class="title">Urdu</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/poland.svg" alt="alt"> -->
<!--                                         <span class="title">Polish</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/israel.svg" alt="alt"> -->
<!--                                         <span class="title">Hebrew</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col el-flag"> -->
<!--                                 <div class="inner"> -->
<!--                                     <a href="page-departements.html"> -->
<!--                                         <img src="assets/images/flags/bangladesh.svg" alt="alt"> -->
<!--                                         <span class="title">Bengali</span> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--             </div> -->
<!--         </li> -->
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
                                            <a href="page-start.html">
                                                <span class="text">Getting Started!</span>
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
                                </div>
                                <!--/-->
                                <!--Col-->
                                <div class="col">
                                    <p class="title">學生中心</p>
                                    <ul>
                                        <li>
                                            <a href="views/member/dashboard.jsp">
                                                <span class="text">個人首頁</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="views/member/profile.jsp">
                                                <span class="text">個人資料</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="views/orderDetail/StudentCourse.html">
                                                <span class="text">課程</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="teacher/dashboard-classrooms.html">
                                                <span class="text">X Classrooms X</span>
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
                                <!--Col-->
                                <div class="col">
                                    <p class="title">Other Pages</p>
                                    <ul>
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
                                <!--/-->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </li>
        <li>
            <a href="<%=request.getContextPath() %>/views/member/teacherProfile.jsp">
                <span class="text">成為老師</span>
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
				<!-- jstl -->
						<!-- 如果沒登入 -->
					    <c:if test="${empty member}">
        					<a href="<%=request.getContextPath() %>/views/member/login.jsp" class="button button-md button-light button-line-primary">
	                        	<span class="title">登入</span>
	                    	</a>
	                    	<a href="<%=request.getContextPath() %>/views/member/register.jsp" class="button button-md button-primary">
	                        	<span class="title">註冊</span>
	                    	</a> 
					    </c:if>
						<!-- 如果已登入 -->
					    <c:if test="${not empty member}">
		                   	<form action="<%= request.getContextPath() %>/views/member/logout" method="post">
		                        <button class="button button-md button-light button-line-primary" type="submit">登出</button>
		                    </form>
					    </c:if>
                </div>
            </div>
        </div>
    </header>
    <!--/-->
	<!-- 漢堡選單 -->
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
                            <span class="text">前往</span>
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
                            <p class="title">個人中心</p>
                            <ul class="sidenav-menu-ul">
                                <li>
                                    <a href="teacher/dashboard.html">
                                        <span class="text">首頁</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="teacher/dashboard-profile.html">
                                        <span class="text">個人資料</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="teacher/dashboard-skills.html">
                                        <span class="text">X Edit Skills X</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="teacher/dashboard-classrooms.html">
                                        <span class="text">X Classrooms X</span>
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
<div class="page-home">
    <!--Hero-->
    <section class="section section-hero section-hero-5 bg-gradient-180">
        <figure class="section-shape shape-1">
            <img src="assets/images/shapes/1.svg" alt="Image Description" />
        </figure>
        <div class="display-center">
            <div class="container">
                <div class="hero-content">
                    <h1>Learn a new language<br /> with an online tutor</h1>
                    <p class="text-light">Hold an online language class with your favorite teacher!<br />Find your teacher, choose the time and start learning the language.</p>
                </div>
            </div>
        </div>
        <div class="el-floating-shapes">
            <span class="shape shape-1">
                <img src="assets/images/shapes/1.png" alt="--Alternative--">
            </span>
            <span class="shape shape-2">
                <img src="assets/images/shapes/2.png" alt="--Alternative--">
            </span>
            <span class="shape shape-3">
                <img src="assets/images/shapes/3.png" alt="--Alternative--">
            </span>
            <span class="shape shape-4">
                <img src="assets/images/shapes/4.png" alt="--Alternative--">
            </span>
        </div>
    </section>
    <!--/-->
     <!--Features-->
 <section class="section section-features section-features-1">
    <div class="container">
        <div class="row row-xs">
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/uk.svg" alt="alt" />
                            <h3>
                                <span class="text">English</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/spain.svg" alt="alt" />
                            <h3>
                                <span class="text">Spanish</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/germany.svg" alt="alt" />
                            <h3>
                                <span class="text">German</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/italy.svg" alt="alt" />
                            <h3>
                                <span class="text">Italian</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/france.svg" alt="alt" />
                            <h3>
                                <span class="text">French</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/portugal.svg" alt="alt" />
                            <h3>
                                <span class="text">Portuguese</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/russia.svg" alt="alt" />
                            <h3>
                                <span class="text">Russian</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/china.svg" alt="alt" />
                            <h3>
                                <span class="text">Mandarin</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/japan.svg" alt="alt" />
                            <h3>
                                <span class="text">Japanese</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/iran.svg" alt="alt" />
                            <h3>
                                <span class="text">Persian</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/india.svg" alt="alt" />
                            <h3>
                                <span class="text">Hindi</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
            <!--Col-->
            <div class="col-6 col-sm-4 col-md-4 col-lg-2">
                <a href="page-departements.html">
                    <div class="item">
                        <div class="inner">
                            <img src="assets/images/flags/turkey.svg" alt="alt" />
                            <h3>
                                <span class="text">Turkish</span>
                            </h3>
                        </div>
                    </div>
                </a>
            </div>
            <!--/-->
        </div>
    </div>
</section>
<!--/-->
    <!--Teachers-->
<section class="section section-teachers section-teachers-slider">
    <div class="display-spacing">
        <div class="container">
            <header class="el-heading center">
                <h2>Our professional teachers</h2>
                <p>We provide the best service that comes with the best results.</p>
                <div class="divider divider-line"></div>
            </header>
            <div class="el-slider">
                <div class="swiper-container swiper-teachers">
                    <div class="swiper-wrapper">
                        <!-- Slides -->
                        <div class="swiper-slide">
                            <div class="card el-card">
                                <a href="page-teacher.html">
                                    <div class="inner">
                                        <div class="avatar">
                                            <img src="assets/images/people/1.jpg" alt="alt" />
                                        </div>
                                        <div class="details">
                                            <h3>Miranda Fox</h3>
                                            <p>Lorem ipsum dolor sit amet consectetur elit sed do.</p>
                                        </div>
                                        <div class="other">
                                            <p class="price">
                                                <span>Price</span>
                                                <span class="text-color">$25.00</span>
                                            </p>
                                        </div>
                                        <ul class="icons icons-left">
                                            <li>
                                                <div class="icon-lang">
                                                    <img src="assets/images/flags/russia.svg" alt="Lang" />
                                                </div>
                                            </li>
                                            <li>
                                                <div class="icon-lang">
                                                    <img src="assets/images/icons/graduation.svg" alt="Is experienced" />
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <!-- Slides -->
                        <div class="swiper-slide">
                            <div class="card el-card">
                                <a href="page-teacher.html">
                                    <div class="inner">
                                        <div class="avatar">
                                            <img src="assets/images/people/2.jpg" alt="alt" />
                                        </div>
                                        <div class="details">
                                            <h3>James Maxwell</h3>
                                            <p>Lorem ipsum dolor sit amet consectetur elit sed do.</p>
                                        </div>
                                        <div class="other">
                                            <p class="price">
                                                <span>Price</span>
                                                <span class="text-color">$25.00</span>
                                            </p>
                                        </div>
                                        <ul class="icons icons-left">
                                            <li>
                                                <div class="icon-lang">
                                                    <img src="assets/images/flags/germany.svg" alt="Lang" />
                                                </div>
                                            </li>
                                            <li>
                                                <div class="icon-lang">
                                                    <img src="assets/images/icons/language-exhange.svg" alt="language exhange" />
                                                </div>
                                            </li>
                                        </ul>
                                        <ul class="icons icons-right">
                                            <li>
                                                <p class="icon-status bg-danger">
                                                    <span>Native</span>
                                                </p>
                                            </li>
                                        </ul>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <!-- Slides -->
                        <div class="swiper-slide">
                            <div class="card el-card">
                                <a href="page-teacher.html">
                                    <div class="inner">
                                        <div class="avatar">
                                            <img src="assets/images/people/3.jpg" alt="alt" />
                                        </div>
                                        <div class="details">
                                            <h3>John Woo</h3>
                                            <p>Lorem ipsum dolor sit amet consectetur elit sed do.</p>
                                        </div>
                                        <div class="other">
                                            <p class="price">
                                                <span>Price</span>
                                                <span class="text-color">$25.00</span>
                                            </p>
                                        </div>
                                        <ul class="icons icons-left">
                                            <li>
                                                <div class="icon-lang">
                                                    <img src="assets/images/flags/italy.svg" alt="Lang" />
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <!-- Slides -->
                        <div class="swiper-slide">
                            <div class="card el-card">
                                <a href="page-teacher.html">
                                    <div class="inner">
                                        <div class="avatar">
                                            <img src="assets/images/people/4.jpg" alt="alt" />
                                        </div>
                                        <div class="details">
                                            <h3>Emily Thompson</h3>
                                            <p>Lorem ipsum dolor sit amet consectetur elit sed do.</p>
                                        </div>
                                        <div class="other">
                                            <p class="price">
                                                <span>Price</span>
                                                <span class="text-color">$25.00</span>
                                            </p>
                                        </div>
                                        <ul class="icons icons-left">
                                            <li>
                                                <div class="icon-lang">
                                                    <img src="assets/images/flags/uk.svg" alt="Lang" />
                                                </div>
                                            </li>
                                        </ul>
                                        <ul class="icons icons-right">
                                            <li>
                                                <p class="icon-status bg-secondary">
                                                    <span>Starter</span>
                                                </p>
                                            </li>
                                        </ul>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <!-- Slides -->
                        <div class="swiper-slide">
                            <div class="card el-card">
                                <a href="page-teacher.html">
                                    <div class="inner">
                                        <div class="avatar">
                                            <img src="assets/images/people/5.jpg" alt="alt" />
                                        </div>
                                        <div class="details">
                                            <h3>Robert Fox</h3>
                                            <p>Lorem ipsum dolor sit amet consectetur elit sed do.</p>
                                        </div>
                                        <div class="other">
                                            <p class="price">
                                                <span>Price</span>
                                                <span class="text-color">$25.00</span>
                                            </p>
                                        </div>
                                        <ul class="icons icons-left">
                                            <li>
                                                <div class="icon-lang">
                                                    <img src="assets/images/flags/india.svg" alt="Lang" />
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <!-- Slides -->
                        <div class="swiper-slide">
                            <div class="card el-card">
                                <a href="page-teacher.html">
                                    <div class="inner">
                                        <div class="avatar">
                                            <img src="assets/images/people/6.jpg" alt="alt" />
                                        </div>
                                        <div class="details">
                                            <h3>Ava Taylor</h3>
                                            <p>Lorem ipsum dolor sit amet consectetur elit sed do.</p>
                                        </div>
                                        <div class="other">
                                            <p class="price">
                                                <span>Price</span>
                                                <span class="text-color new-price">$20.00</span>
                                                <span class="text-color old-price">$25.00</span>
                                            </p>
                                        </div>
                                        <ul class="icons icons-left">
                                            <li>
                                                <div class="icon-lang">
                                                    <img src="assets/images/flags/france.svg" alt="Lang" />
                                                </div>
                                            </li>
                                            <li>
                                                <div class="icon-off">
                                                    <span>%20</span>
                                                </div>
                                            </li>
                                        </ul>
                                        <ul class="icons icons-right">
                                            <li>
                                                <p class="icon-status bg-danger">
                                                    <span>Native</span>
                                                </p>
                                            </li>
                                        </ul>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="swiper-button-prev"></div>
                    <div class="swiper-button-next"></div>
                </div>
            </div>
            <div class="el-read-more div-center text-center">
                <a href="page-teachers.html" class="el-popover">
                    <p class="button button-circle-lg button-circle button-primary">
                        <span class="fa fa-refresh"></span>
                    </p>
                    <p class="el-popover-title">
                        <span>More Teachers?</span>
                    </p>
                </a>
            </div>
        </div>
    </div>
</section>
<!--/-->
    <!--Call-To-Action-->
    <div class="section el-cta el-cta-1 overlay-color bg-animation-2">
        <div class="display-center">
            <div class="container">
                <div class="heading">
                    <h2>Learn a new language<br/>with an online tutor</h2>
                    <p>Let's work together. We can help to develop your business. <br />We provide the best service that comes with the best results.</p>
                    <a href="page-start.html" class="button button-md button-light">
                        <span class="wave-hover"></span>
                        <span class="text text-primary">Let's get started.</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
    <!--/-->
    <section class="section section-services">
    <figure class="section-shape shape-2">
        <img class="img-fluid" src="assets/images/shapes/2.svg" alt="Image Description" />
    </figure>
    <figure class="section-shape shape-3">
        <img src="assets/images/shapes/3.svg" alt="Image Description" />
    </figure>
    <div class="display-spacing">
        <div class="container">
            <header class="el-heading center">
                <h2>Join our global community</h2>
                <p>We provide the best service that comes with the best results.</p>
                <div class="divider divider-line"></div>
            </header>
            <div class="row row-sm row-lg-5 row-xl-5 mb--30" style="margin: auto;">
                <div class="col-6 col-md-4 col-lg-3">
                    <h3>America</h3>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/us.svg" /></div>
                        <span class="name">ایالت متحده</span>
                        <span class="name name-en">United States</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/br.svg" /></div>
                        <span class="name">برزیل</span>
                        <span class="name name-en">Brasil</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/ca.svg" /></div>
                        <span class="name">کانادا</span>
                        <span class="name name-en">Canada</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/mx.svg" /></div>
                        <span class="name">مکزیک</span>
                        <span class="name name-en">Mexico</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/pr.svg" /></div>
                        <span class="name">پورتوریکو</span>
                        <span class="name name-en">Puerto Rico</span>
                    </div>
                </div>
                <div class="col-6 col-md-4 col-lg-3">
                    <h3>Asia</h3>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/hk.svg" /></div>
                        <span class="name">هنگ کنگ</span>
                        <span class="name name-en">Hong Kong</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/in.svg" /></div>
                        <span class="name">هند</span>
                        <span class="name name-en">India</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/id.svg" /></div>
                        <span class="name">اندونزی</span>
                        <span class="name name-en">Indonezia</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/ma.svg" /></div>
                        <span class="name">مالزی</span>
                        <span class="name name-en">Malaysia</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/ph.svg" /></div>
                        <span class="name">فیلیپین</span>
                        <span class="name name-en">Philippines</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/sg.svg" /></div>
                        <span class="name">سنگاپور</span>
                        <span class="name name-en">Singapore</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/ir.svg" /></div>
                        <span class="name">ایران</span>
                        <span class="name name-en">Iran</span>
                    </div>
                </div>
                <div class="col-6 col-md-4 col-lg-3">
                    <h3>Europe</h3>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/pt.svg" /></div>
                        <span class="name">پرتغال</span>
                        <span class="name name-en">Portugal</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/es.svg" /></div>
                        <span class="name">اسپانیا</span>
                        <span class="name name-en">España</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/ch.svg" /></div>
                        <span class="name">سویس</span>
                        <span class="name name-en">Suisse</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/gb.svg" /></div>
                        <span class="name">انگلیس</span>
                        <span class="name name-en">United Kingdom</span>
                    </div>
                   
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/fr.svg" /></div>
                        <span class="name">فرانسه</span>
                        <span class="name name-en">France</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/de.svg" /></div>
                        <span class="name">دانمارک</span>
                        <span class="name name-en">Deutschland</span>
                    </div>
                </div>
                <div class="col-6 col-md-4 col-lg-3">
                    <h3><span class="opacity-0">Africa</span></h3>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/no.svg" /></div>
                        <span class="name">نروژ</span>
                        <span class="name name-en">Norge</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/at.svg" /></div>
                        <span class="name">اتریش</span>
                        <span class="name name-en">Österreich</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/be.svg" /></div>
                        <span class="name">بلژیک</span>
                        <span class="name name-en">België</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/dk.svg" /></div>
                        <span class="name">دانمارک</span>
                        <span class="name name-en">Danmark</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/fi.svg" /></div>
                        <span class="name">فنلاند</span>
                        <span class="name name-en">Suomi</span>
                    </div>
                </div>
                <div class="col-6 col-md-4 col-lg-3">
                    <h3><span class="opacity-0">Australia</span></h3>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/au.svg" /></div>
                        <span class="name">استرالیا</span>
                        <span class="name name-en">Australia</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/pr.svg" /></div>
                        <span class="name">نیوزیلند</span>
                        <span class="name name-en">Australia</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/au.svg" /></div>
                        <span class="name">استرالیا</span>
                        <span class="name name-en">Australia</span>
                    </div>
                    <div class="item d-flex align-items-center">
                        <div class="image"><img alt="Image placeholder" src="assets/images/flags/pr.svg" /></div>
                        <span class="name">نیوزیلند</span>
                        <span class="name name-en">Australia</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

        <!--Testimonial-->
    <section class="section section-testimonial bg-primary">
        <div class="display-spacing">
            <header class="el-heading center light">
                <h2>What clients say about us?</h2>
                <p>We provide the best service that comes with the best results.</p>
                <div class="divider divider-line"></div>
            </header>
            <div class="container">
                <div class="el-slider el-slider-dots">
                    <div class="swiper-container swiper-testimonial">
                        <div class="swiper-wrapper">
                            <!-- Slides -->
                            <div class="swiper-slide">
                                <div class="item">
                                    <div class="content">
                                        <p>You've saved our business! I can't say enough about you. We were treated like royalty. We can't understand how we've been living without you.</p>
                                    </div>
                                    <div class="author">
                                        <div class="avatar">
                                            <img src="assets/images/people/1.jpg" alt="alt" />
                                        </div>
                                        <h4>Miranda Fox</h4>
                                        <h5>Our Customer</h5>
                                    </div>
                                </div>
                            </div>
                            <!-- Slides -->
                            <div class="swiper-slide">
                                <div class="item">
                                    <div class="content">
                                        <p>Dude, your stuff is the bomb! I love your system. It's all good. I was treated like royalty. Keep up the excellent work. I will definitely be ordering again!</p>
                                    </div>
                                    <div class="author">
                                        <div class="avatar">
                                            <img src="assets/images/people/2.jpg" alt="alt" />
                                        </div>
                                        <h4>James Maxwell</h4>
                                        <h5>Our Customer</h5>
                                    </div>
                                </div>
                            </div>
                            <!-- Slides -->
                            <div class="swiper-slide">
                                <div class="item">
                                    <div class="content">
                                        <p>You've saved our business! I can't say enough about you. We were treated like royalty. We can't understand how we've been living without you.</p>
                                    </div>
                                    <div class="author">
                                        <div class="avatar">
                                            <img src="assets/images/people/3.jpg" alt="alt" />
                                        </div>
                                        <h4>John Whoo</h4>
                                        <h5>Our Customer</h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="swiper-pagination"></div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--/-->
    <!--Courses-->
<section class="section section-courses">
    <figure class="section-shape shape-2">
        <img class="img-fluid" src="assets/images/shapes/2.svg" alt="Image Description" />
    </figure>
    <figure class="section-shape shape-3">
        <img src="assets/images/shapes/3.svg" alt="Image Description" />
    </figure>
    <div class="display-spacing">
        <div class="container">
            <header class="el-heading center">
                <h2>What we Learn on <span class="text-primary">Eduline</span></h2>
                <p>We provide the best service that comes with the best results.</p>
                <div class="divider divider-line"></div>
            </header>
            <div class="cards">
                <!--Card-->
                <div class="el-card card-course">
                    <div class="item d-flex align-items-center">
                        <div class="card-image">
                            <img src="assets/images/courses/1.svg" alt="alt" />
                        </div>
                        <div class="card-title">
                            <h3>
                                <a href="page-course.html">
                                    <span>Standard English</span>
                                    <span class="subtitle">Lessons:<span class="text-color">600</span></span>
                                </a>
                            </h3>
                        </div>
                        <div class="card-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                        </div>
                        <div class="card-links">
                            <a href="page-course.html" class="button button-md button-line-primary">
                                <span class="text">Read More</span>
                            </a>
                        </div>
                    </div>
                </div>
                <!--/-->
                <!--Card-->
                <div class="el-card card-course">
                    <div class="item d-flex align-items-center">
                        <div class="card-image">
                            <img src="assets/images/courses/1.svg" alt="alt" />
                        </div>
                        <div class="card-title">
                            <h3>
                                <a href="page-course.html">
                                    <span>Travelers Course</span>
                                    <span class="subtitle">Lessons:<span class="text-color">600</span></span>
                                </a>
                            </h3>
                        </div>
                        <div class="card-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                        </div>
                        <div class="card-links">
                            <a href="page-course.html" class="button button-md button-line-primary">
                                <span class="text">Read More</span>
                            </a>
                        </div>
                    </div>
                </div>
                <!--/-->
                <!--Card-->
                <div class="el-card card-course">
                    <div class="item d-flex align-items-center">
                        <div class="card-image">
                            <img src="assets/images/courses/1.svg" alt="alt" />
                        </div>
                        <div class="card-title">
                            <h3>
                                <a href="page-course.html">
                                    <span>Portuguese Course</span>
                                    <span class="subtitle">Lessons:<span class="text-color">600</span></span>
                                </a>
                            </h3>
                        </div>
                        <div class="card-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                        </div>
                        <div class="card-links">
                            <a href="page-course.html" class="button button-md button-primary">
                                <span class="text">Read More</span>
                            </a>
                        </div>
                    </div>
                </div>
                <!--/-->
                <!--Card-->
                <div class="el-card card-course">
                    <div class="item d-flex align-items-center">
                        <div class="card-image">
                            <img src="assets/images/courses/4.svg" alt="alt" />
                        </div>
                        <div class="card-title">
                            <h3>
                                <a href="page-course.html">
                                    <span>Standard Spanish</span>
                                    <span class="subtitle">Lessons:<span class="text-color">600</span></span>
                                </a>
                            </h3>
                        </div>
                        <div class="card-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                        </div>
                        <div class="card-links">
                            <a href="page-course.html" class="button button-md button-secondary">
                                <span class="text">Read More</span>
                            </a>
                        </div>
                    </div>
                </div>
                <!--/-->
            </div>
            <div class="el-read-more div-center text-center">
                <a href="page-courses.html" class="el-popover">
                    <p class="button button-circle-lg button-circle button-primary">
                        <span class="fa fa-refresh"></span>
                    </p>
                    <p class="el-popover-title">
                        <span>More Courses?</span>
                    </p>
                </a>
            </div>
        </div>
    </div>
</section>
<!--/-->    
</div>
        <!--Footer-->
        <footer class="section app-footer app-footer-2">
            <div class="footer-info">
                <div class="container">
                    <div class="el-cta el-cta-4">
                        <h3>What <span class="text-primary">language</span> do you want to learn?</h3>
                        <p>We have teachers in 64 languages! </p>
                        <a href="page-teachers.html" class="button button-md button-secondary">
                            <span class="text text-light">Browse Them Now</span>
                        </a>
                    </div>
                </div>
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
                                            <li>
                                                <a href="page-cooperation.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Apply to Teach</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-teachers.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Search for Teachers</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-courses.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">List of Courses</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Departments</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3 d-none d-xl-block">
                                <div class="widget widget-links">
                                    <div class="widget-title">
                                        <h4>Languages</h4>
                                    </div>
                                    <div class="widget-body">
                                        <ul>
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Learn Hindi</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Learn Farsi</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Learn Turkish</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Learn Chinese</span>
                                                </a>
                                            </li>
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
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Learn English</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Learn Spanish</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Learn German</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-departements.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Learn French</span>
                                                </a>
                                            </li>
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
                                            <li>
                                                <a href="page-teachers.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">English Tutors</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-teachers.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Spanish Tutors</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-teachers.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">French Tutors</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-teachers.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Japanese Tutors</span>
                                                </a>
                                            </li>
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
                                            <li>
                                                <a href="page-about.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">About Us</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-contact.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Contact Us</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-faq.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Faq</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="page-policy.html">
                                                    <span class="icon ti-angle-left"></span>
                                                    <span class="text">Policy</span>
                                                </a>
                                            </li>
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
                                <li>
                                    <a href="#">
                                        <span class="fa fa-facebook"></span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="fa fa-google"></span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="fa fa-linkedin"></span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="fa fa-twitter"></span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </div>
    <script src="<%=request.getContextPath() %>/public/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/public/js/plugins.min.js"></script>
    <script src="<%=request.getContextPath() %>/public/js/main-scripts.js"></script>
</body>
</html>