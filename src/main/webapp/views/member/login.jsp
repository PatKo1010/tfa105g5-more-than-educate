<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <title>登入</title>
    <meta charset="UTF-8" />
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!--     <link rel="shortcut icon" href="../../public/favicon.ico" /> -->
    <link rel="shortcut icon" href="<%=request.getContextPath()%>/public/favicon.ico" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/public/css/plugins.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/public/css/styles.css" />
</head>


<body>
    <!--Header-->
    <header class="app-header app-header-default">
        <a href="<%=request.getContextPath()%>/index.jsp" class="button button-md button-arrow button-go-back">
            <span class="icon-arrow arrow-right"></span>
        </a>
    </header>
    <!--/-->
    <!--Wrapper-->
    <div class="app-wrapper">
        <div class="page page-auth">
            <!--Login-->
            <section class="section section-auth">
                <div class="auth-form">
                    <div class="display-spacing display-spacing-plus">
                        <div class="container">
                            <header class="el-heading center">
                                <h2>登入MoreThanEducate</h2>
                                <h3>
                                    <a href="<%=request.getContextPath() %>/views/member/register.jsp">尚未成為會員?  來註冊八</a>
                                </h3>
                            </header>

<!--  FORM -->
<!--                             <form class="form-3 max-w-576"> -->
<!-- 							!!!!啟動servlet by網址-->
               				<form name="loginForm" class="form-3 max-w-576" action="<c:url value="/views/member/loginResult" />" method="post">
                                <div class="form-item">
                                    <label class="form-label">Email</label>
                                    <input type="text" name="email" value="${param.email}" placeholder="請輸入電郵">
                                	<span class="error" style="color:red;"> ${errors.email} </span>
                                </div>
                                <div class="form-item">
                                    <label class="form-label">Password</label>
                                    <input type="password" name="password" value="${param.password}" placeholder="請輸入密碼">
                                	<span class="error" style="color:red;"> ${errors.password} </span>
                                </div>
                                
<!--  ~~~~待做~~~~ -->
<!--                                 <div class="form-item form-input-q"> -->
<!--                                     <div class="row"> -->
<!--                                         <div class="col"> -->
<!--                                             <div class="input-checkbox"> -->
<!--                                                 <label class="checkbox-wrap"> -->
<!--                                                     <span class="checkbox-label">Remember Me</span> -->
<!--                                                     <input type="checkbox" name="remember"> -->
<!--                                                     <span class="checkbox-mark"></span> -->
<!--                                                 </label> -->
<!--                                             </div> -->
<!--                                         </div> -->
<!--                                         <div class="col text-right"> -->
<!--                                             <a href="#" class="input-fp">Forgot Password?</a> -->
<!--                                         </div> -->
<!--                                     </div> -->
<!--                                 </div> -->

                                <div class="form-item mb-0">
<!--                                     <a href="teacher/dashboard.html" class="button button-md button-block button-primary text-center"> -->
<!--                                         <span class="text text-center" >登入</span> -->
                                    <span class="button button-md button-block button-primary text text-center" onclick="loginForm.submit()" >登入</span>
<!--                                     </a> -->
                                </div>
                                
                                <div class="form-item">
                                    <button class="button button-md button-block button-gmail button-primary" type="button" onclick="window.location.href='https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com%2Fauth%2Fuserinfo.email+https://www.googleapis.com%2Fauth%2Fuserinfo.profile&amp;state=/profile&amp;redirect_uri=https://localhost:8443/tfa105g5-more-than-educate/views/member/loginWithGoogle&amp;response_type=code&amp;client_id=1064292731610-gq88kia62m4187k3j0nusfuoq10gj6i7.apps.googleusercontent.com'">
                                        <span class="text" >有google嗎 用它登入巴~</span>
                                    </button>
                                </div>
                                
                            </form>
                        </div>
                    </div>
                </div>
<!--                 <div class="auth-image overlay-image" style="background-image: url();"></div> -->
<!--                 <div class="auth-image overlay-image" style="background-image: url(public/images/auth/AChenError.jpg);"></div> -->
            </section>

        </div>
    </div>
    <script src="<%=request.getContextPath()%>/public/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/public/js/plugins.min.js"></script>
    <script src="<%=request.getContextPath()%>/public/js/main-scripts.js"></script>
</body>

</html>