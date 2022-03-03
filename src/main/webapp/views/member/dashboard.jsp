<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
<html>

<head>
    <title>個人首頁</title>
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
                                    <p class="title">個人中心</p>
                                    <ul>
                                        <li>
                                            <a href="<%=request.getContextPath() %>/views/member/dashboard.jsp">
                                                <span class="text">個人首頁</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="<%=request.getContextPath() %>/views/member/profile.jsp">
                                                <span class="text">個人資料</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="<%=request.getContextPath() %>views/orderDetail/StudentCourse.html">
                                                <span class="text">課程</span>
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
            <a href="<%=request.getContextPath()%>/views/member/teacherProfile.jsp">
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
<%--                     <a href="<%= request.getContextPath() %>/views/member/register.jsp" class="button button-md button-line-primary"> --%>
<!--                         <span class="title">註冊</span> -->
<!--                     </a> -->
<%--                     <a href="<%= request.getContextPath() %>/views/member/login.jsp" class="button button-md button-primary"> --%>
<!--                         <span class="title">登入</span> -->
<!--                     </a> -->
                    <form action="<%= request.getContextPath() %>/views/member/logout" method="post">
                        <button class="button button-md button-primary" type="submit">登出</button>
                    </form>
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
                    <h2>個人中心</h2>
                </div>
                <ul class="el-list-icon">
                    <li>
                        <a href="<%=request.getContextPath() %>/views/member/dashboard.jsp">
                            <i class="fa fa-cog"></i>
                            <span class="text">個人首頁</span>
                        </a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath() %>/views/member/profile.jsp">
                            <i class="fa fa-cog"></i>
                            <span class="text">更新資料</span>
                        </a>
                    </li>
                    <li>
                        <a href="student/dashboard-courses.html">
                            <i class="fa fas fa-book"></i>
                            <span class="text">課程</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
<!-- Wallet待做         -->
<!--         <div class="el-panel el-panel-financial bg-primary"> -->
<!--             <div class="el-panel-body"> -->
<!--                 <p class="text-center text-light">Wallet</p> -->
<!--                 <p class="price"> -->
<!--                     <span class="value">$240.00</span> -->
<!--                 </p> -->
<!--                 <a href="student/dashboard-wallet.html" class="button button-md button-radius button-block button-light"> -->
<!--                     <span class="text text-center text-primary">Details</span> -->
<!--                 </a> -->
<!--             </div> -->
<!--         </div> -->
        
    </aside>
</div>
                    <div class="col-12 col-sm-12 col-md-12 col-lg-8">
                        <div class="el-panel">
                            <div class="el-panel-body">
                                <div class="el-panel-title">
                                    <h2>歡迎!!</h2>  <h2 style="color: blue;">${member.username}</h2>
                                </div>
                                
                                <!-- 上傳表單 -->
                                <form class="form-3" action="<%= request.getContextPath() %>/views/member/update" method="post" enctype="multipart/form-data">
                                    <div class="row row-sm">
                                        <!-- 上傳頭貼 -->
                                        <div class="col-12 col-sm-12 col-md-12 col-lg-2">
                                            <div class="el-avatar">
                                                <div class="avatar-upload">
                                                	<!-- 頭貼上傳 -->
                                                    <div class="avatar-edit">
                                                    	<input type="hidden" name="memID" value= "${member.memid}" />
                                                        <input type="file" id="imageUpload" accept=".png, .jpg, .jpeg" name="image" />
<!--                                                         <label for="imageUpload"></label> -->
                                                    </div>
                                                    <!-- 頭貼預覽 -->
                                                    <div class="avatar-preview">
                                                    	
                                                            <c:if test="${not empty member.photo}">
                                                                <c:set var="image" scope="page" value="${member.photo}"/>
									                        	<div id="imagePreview" style="background-image: url(data:image/png;base64,<%=Base64.getEncoder().encodeToString((byte[])pageContext.getAttribute("image")) %>);">
	                                                        	</div>
                                                            </c:if>
                                                            <c:if test="${empty member.photo}">
                                                                <div id="imagePreview" style="background-image: url(https://i.pinimg.com/564x/1d/83/a6/1d83a6d88d8be5b041a9a98fd5048311.jpg);">
	                                                        	</div>
                                                            </c:if>
                                                        
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- 儲存email -->
                                        <div class="col-12 col-sm-12 col-md-12 col-lg-10">
                                            <div class="pr-15">
                                                <div class="form-item">
                                                    <label for="input-name" class="form-label">E-mail</label>
                                                    <input name="email" type="text" id="input-email" value="${member.email}" disabled>
                                                    <span class="error" style="color:red;"> ${errors.email} </span>
                                                </div>
                                                <div class="form-item">
                                                    <label for="input-lastname" class="form-label">密碼</label>
                                                    <input name="password" type="text" id="input-password" value="${member.password}" disabled>
                                                    <span class="error" style="color:red;"> ${errors.password} </span>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- 儲存使用者名稱 -->
                                        <div class="col-12 col-sm-12 col-md-12 col-lg-6">
                                            <div class="form-item">
                                                <label for="input-mobile" class="form-label">使用者名稱</label>
                                                <input name="username" type="text" id="input-username" class="text-left" value="${member.username}" disabled>
                                            	<span class="error" style="color:red;"> ${errors.username} </span>
                                            </div>
                                        </div>
                                        <!-- 儲存電話 -->
                                        <div class="col-12 col-sm-12 col-md-12 col-lg-6">
                                            <div class="form-item">
                                                <label for="input-email" class="form-label">電話</label>
                                                <input name="phonenum" type="text" id="input-phonenum" class="text-left" value="${member.phonenum}" disabled>
                                            	<span class="error" style="color:red;"> ${errors.phonenum} </span>
                                            </div>
                                        </div>
                                        <!-- 儲存生日 -->
                                        <div class="col-12 col-sm-12 col-md-12 col-lg-12">
                                            <div class="form-item">
                                                <label for="input-birth" class="form-label">生日</label>
                                                <input name="birth" type="date" id="input-birth" class="text-left" value="${member.birth}" disabled>
                                            	<span class="error" style="color:red;"> ${errors.birth} </span>
                                            </div>
                                        </div>

                                        <!-- 繳交按鈕 -->
<!--                                         <div class="col-12"> -->
<!--                                             <div class="form-item mb-0"> -->
<!--                                                 <button class="button button-md button-block button-primary" type="submit"> -->
<!--                                                     <span class="text">儲存</span> -->
<!--                                                 </button> -->
<!--                                             </div> -->
<!--                                         </div> -->
                                    </div>
                                </form>
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
    <script src="<%=request.getContextPath() %>/public/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/public/js/plugins.min.js"></script>
    <script src="<%=request.getContextPath() %>/public/js/main-scripts.js"></script>
    <script src="<%=request.getContextPath() %>/public/js/dashboard.js"></script>
</body>

</html>