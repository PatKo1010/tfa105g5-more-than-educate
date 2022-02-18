<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <title>註冊</title>
    <meta charset="UTF-8" />
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    
<!--     <link rel="shortcut icon" href="http://localhost:7080/hwproj-morethanedu-hibernate/public/favicon.ico" /> -->
    <link rel="shortcut icon" href="../../public/favicon.ico" />
    <link rel="stylesheet" href="../../public/css/plugins.min.css" />
    <link rel="stylesheet" href="../../public/css/styles.css" />

<!--     <link rel="stylesheet" href="./assets/css/custom.css">  for自加的CSS -->
</head>


<body>
    <!--Header-->
    <header class="app-header app-header-default">
        <a href="../../index.jsp" class="button button-md button-arrow button-go-back">
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
                                <h2>註冊MoreThanEducate</h2>
                                <h3>
                                    <a href="./login.jsp">已經是會員? 馬上登入!</a>
                                </h3>
                            </header>

<%-- <form action="<c:url value="/Register" />" method="get">  <!-- 啟動servlet: get方法 --> --%>
                            <!-- <form class="form-3 max-w-576"> -->
                            <!-- 註冊表單 -->
                            <form name="registerForm" class="form-3 max-w-576" action="<c:url value="/views/member/register" />" method="post">
<!--                        	<tr> -->
<!-- 								<td>ID : </td> -->
<%-- 								<td><input type="text" name="username" value="${param.username}"></td> --%>
<%-- 								<td><span class="error">${errors.username}</span></td> --%>
<!-- 							</tr> -->
                                <!-- 註冊信箱 -->
                                <div class="form-item">
                                    <label class="form-label">Email</label>
                                    <input type="text" name="email" value="${param.email}" >
                                    <span class="error" style="color:red;"> ${errors.email} </span>
                                </div>
                                <!-- 註冊使用者名稱 -->
                                <div class="form-item">
                                    <label class="form-label">使用者名稱</label>
                                    <input type="text" name="username" value="${param.username}" >
                                    <span class="error" style="color:red;"> ${errors.username} </span>
                                </div>
                                <!-- 註冊使用者密碼 -->
                                <div class="form-item">
                                    <label class="form-label">密碼</label>
                                    <input type="password" name="password" value="${param.password}" >
                                   	<span class="error" style="color:red;"> ${errors.password} </span>
                                </div>
                                <!-- 確認密碼 -->
                                <div class="form-item">
                                    <label class="form-label">確認密碼</label>
                                    <input type="password" name="passwordConf" value="${parma.passwordConf}" >
                                    <span class="error" style="color:red;"> ${errors.passwordConf} </span>
                                </div>
                                <!-- 註冊按鈕 -->
                                <div class="form-item mb-0">
                                    <button class="button button-md button-block button-primary" type="submit">
                                        <span class="text">註冊</span>
                                    </button>
                                </div>
<!--                                 <div class="form-item"> -->
<!--                                     <button class="button button-md button-block button-gmail button-primary" type="button"> -->
<!--                                         <span class="text">Register with Google</span> -->
<!--                                     </button> -->
<!--                                 </div> -->
                            </form>
                        </div>
                    </div>
                </div>
                <div class="auth-image overlay-image" style="background-image: url(assets/images/auth/auth-register.jpg);"></div>
            </section>
            <!--/-->
        </div>
    </div>
    <script src="../../public/js/jquery.min.js"></script>
    <script src="../../public/js/plugins.min.js"></script>
    <script src="../../public/js/main-scripts.js"></script>

<!--     <script src="./assets/js/custom.js"></script>自加的 -->
</body>

</html>