<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
                <link rel="stylesheet"
                    href="https://fonts.googleapis.com/css?family=Poppins:100,300,500,600,700,900&display=swap">
                <link
                    href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@200;300;400;600;700;800;900&display=swap"
                    rel="stylesheet">
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
                                            <a
                                                href="<%=request.getContextPath() %>/views/member/regiTeacherProfile.jsp">
                                                <span class="text">申請成為教師</span>
                                                <span class="icon fa fa-angle-left"></span>
                                            </a>
                                        </li>
                                    </c:if>
                                    <!-- 已成為老師 -->
                                    <c:if test="${member.teaqual == true}">
                                        <li>
                                            <a
                                                href="<%=request.getContextPath() %>/views/member/updateTeacherProfile.jsp">
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
                                        <form action="<%= request.getContextPath() %>/views/member/logout"
                                            method="post">
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
                                                                <a
                                                                    href="<%=request.getContextPath() %>/views/member/dashboard.jsp">
                                                                    <i class="fa fa-cog"></i>
                                                                    <span class="text">個人首頁</span>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    href="<%=request.getContextPath() %>/views/member/profile.jsp">
                                                                    <i class="fa fa-cog"></i>
                                                                    <span class="text">更新資料</span>
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="<%=request.getContextPath()%>/views/orderDetail/StudentCourse.html">
                                                                    <i class="fa fas fa-book"></i>
                                                                    <span class="text">課程</span>
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
                                                        <h2>歡迎!!</h2>
                                                        <h2 style="color: blue;">${member.username}</h2>
                                                    </div>

                                                    <!-- 上傳表單 -->
                                                    <form class="form-3"
                                                        action="<%= request.getContextPath() %>/views/member/update"
                                                        method="post" enctype="multipart/form-data">
                                                        <div class="row row-sm">
                                                            <!-- 上傳頭貼 -->
                                                            <div class="col-12 col-sm-12 col-md-12 col-lg-2">
                                                                <div class="el-avatar">
                                                                    <div class="avatar-upload">
                                                                        <!-- 頭貼上傳 -->
                                                                        <div class="avatar-edit">
                                                                            <input type="hidden" name="memID"
                                                                                value="${member.memid}" />
                                                                            <input type="file" id="imageUpload"
                                                                                accept=".png, .jpg, .jpeg"
                                                                                name="image" />
                                                                        </div>
                                                                        <!-- 頭貼預覽 -->
                                                                        <div class="avatar-preview">
                                                                            <c:if test="${not empty member.photo}">
																				<div id="imagePreview" style="background-image: url(/tfa105g5-more-than-educate/views/member/getProfilePhotoController);"></div>
                                                                            </c:if>
                                                                            <c:if test="${empty member.photo}">
                                                                                <div id="imagePreview"
                                                                                    style="background-image: url(https://i.pinimg.com/564x/1d/83/a6/1d83a6d88d8be5b041a9a98fd5048311.jpg);">
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
                                                                        <label for="input-name"
                                                                            class="form-label">E-mail</label>
                                                                        <input name="email" type="hidden" id="input-email"
                                                                            value=${member.email}>
                                                                        <span class="error" style="color:red;">
                                                                            ${errors.email} </span>
                                                                    </div>
                                                                    <div class="form-item">
                                                                        <label for="input-lastname"
                                                                            class="form-label">密碼</label>
                                                                        <input name="password" type="hidden"
                                                                            id="input-password"
                                                                            value="${member.password}">
                                                                        <span class="error" style="color:red;">
                                                                            ${errors.password} </span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <!-- 儲存使用者名稱 -->
                                                            <div class="col-12 col-sm-12 col-md-12 col-lg-6">
                                                                <div class="form-item">
                                                                    <label for="input-mobile"
                                                                        class="form-label">使用者名稱</label>
                                                                    <input name="username" type="text"
                                                                        id="input-username" class="text-left"
                                                                        value=${member.username} disabled>
                                                                    <span class="error" style="color:red;">
                                                                        ${errors.username} </span>
                                                                </div>
                                                            </div>
                                                            <!-- 儲存電話 -->
                                                            <div class="col-12 col-sm-12 col-md-12 col-lg-6">
                                                                <div class="form-item">
                                                                    <label for="input-email"
                                                                        class="form-label">電話</label>
                                                                    <input name="phonenum" type="text"
                                                                        id="input-phonenum" class="text-left"
                                                                        value="${member.phonenum}" disabled>
                                                                    <span class="error" style="color:red;">
                                                                        ${errors.phonenum} </span>
                                                                </div>
                                                            </div>
                                                            <!-- 儲存生日 -->
                                                            <div class="col-12 col-sm-12 col-md-12 col-lg-12">
                                                                <div class="form-item">
                                                                    <label for="input-birth"
                                                                        class="form-label">生日</label>
                                                                    <input name="birth" type="date" id="input-birth"
                                                                        class="text-left" value="${member.birth}"
                                                                        disabled>
                                                                    <span class="error" style="color:red;">
                                                                        ${errors.birth} </span>
                                                                </div>
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
                        <!--/-->
                    </div>
                </div>
                <script src="<%=request.getContextPath() %>/public/js/jquery.min.js"></script>
                <script src="<%=request.getContextPath() %>/public/js/plugins.min.js"></script>
                <script src="<%=request.getContextPath() %>/public/js/main-scripts.js"></script>
                <script src="<%=request.getContextPath() %>/public/js/dashboard.js"></script>
            </body>

            </html>