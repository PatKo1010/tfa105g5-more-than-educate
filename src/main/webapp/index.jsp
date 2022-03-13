<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
            <link rel="stylesheet"
                href="https://fonts.googleapis.com/css?family=Poppins:100,300,500,600,700,900&display=swap">
            <link rel="stylesheet" href="<%=request.getContextPath() %>/public/css/plugins.min.css" />
            <link rel="stylesheet" href="<%=request.getContextPath() %>/public/css/styles.css" />
        </head>

        <body>
            <header class="app-header app-header-1 empty">
                <div class="container">
                    <div class="header-wrap">
                        <button class="button button-menu button-open-sidenav">
                            <span></span>
                        </button>
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
                                                            </ul>
                                                        </div>
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
                                <!-- 學生中心 -->
                                <c:if test="${not empty member}">
                                    <li>
                                        <a href="<%=request.getContextPath() %>/views/member/dashboard.jsp">
                                            <span class="text">學生中心</span>
                                            <span class="icon fa fa-angle-left"></span>
                                        </a>
                                    </li>
                                </c:if>

                                <!-- 申請成老師 -->
                                <c:if test="${member.teaqual == false}">
                                    <li>
                                        <a href="<%=request.getContextPath() %>/views/member/regiTeacherProfile.jsp">
                                            <span class="text">申請成為教師</span>
                                            <%-- <span class="text">${member.teaqual}</span> --%>
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
                            <!-- jstl -->
                            <!-- 如果未登入 -->
                            <c:if test="${empty member}">
                                <a href="<%=request.getContextPath() %>/views/member/login.jsp"
                                    class="button button-md button-light button-line-primary">
                                    <span class="title">登入</span>
                                </a>
                                <a href="<%=request.getContextPath() %>/views/member/register.jsp"
                                    class="button button-md button-primary">
                                    <span class="title">註冊</span>
                                </a>
                            </c:if>
                            <!-- 如果已登入 -->
                            <c:if test="${not empty member}">
                                <form action="<%= request.getContextPath() %>/views/member/logout" method="post">
                                    <button class="button button-md button-light button-line-primary"
                                        type="submit">登出</button>
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
                            <img src="public/images/shapes/1.svg" alt="Image Description" />
                        </figure>
                        <div class="display-center">
                            <div class="container">
                                <div class="hero-content">
                                    <h1>Learn a new language<br /> with an online tutor</h1>
                                    <p class="text-light">Hold an online language class with your favorite
                                        teacher!<br />Find your teacher, choose the time and start learning the
                                        language.</p>
                                </div>
                            </div>
                        </div>
                        <!--                         <div class="el-floating-shapes"> -->
                        <!--                             <span class="shape shape-1"> -->
                        <!--                                 <img src="public/images/shapes/1.png" alt="--Alternative--"> -->
                        <!--                             </span> -->
                        <!--                             <span class="shape shape-2"> -->
                        <!--                                 <img src="public/images/shapes/2.png" alt="--Alternative--"> -->
                        <!--                             </span> -->
                        <!--                             <span class="shape shape-3"> -->
                        <!--                                 <img src="public/images/shapes/3.png" alt="--Alternative--"> -->
                        <!--                             </span> -->
                        <!--                             <span class="shape shape-4"> -->
                        <!--                                 <img src="public/images/shapes/4.png" alt="--Alternative--"> -->
                        <!--                             </span> -->
                        <!--                         </div> -->
                    </section>
                    <!--/-->
                    <!--Teachers-->

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
                    <div class="footer-copyright">
                        <div class="container">
                            <span class="footer-line"></span>
                            <div class="row">
                                <div class="col-md-8">
                                    <p>© 2020 All Rights Reserved</p>
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