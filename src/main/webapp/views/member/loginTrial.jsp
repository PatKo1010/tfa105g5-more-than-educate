<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 		<link rel="stylesheet" type="text" href="../css/main.css">    -->
        <title>登入頁</title>
    </head>


    <body>
        <h3>登入</h3>
<!--         用form包要傳送的資料 -->
<!-- c:url value裡放"___" -->
<%--         <form action="<c:url value="/secure/login.controller" />" method="get"> --%>
        <form action="<c:url value="/loginTrial" />" method="get">
            <table>
                <tr>
                    <td>帳號: </td>
                    <td><input type="text" name="email" placeholder="請輸入電郵" value="${param.email}"> </td>
					<td><span class="error"> ${errors.email} </span></td>
                </tr>
                <tr>
                    <td>密碼: </td>
                    <td><input type="text" name="password" placeholder="請輸入密碼" value="${param.password}"> </td>
                    <td><span class="error"> ${errors.password} </span> </td>
                </tr>
                <tr>
                    <td align="right"><input type="submit" value="登入"></td>
<!--                		<td align="right"><button type="submit" value="登入"></td> -->
                </tr>
            </table>
        </form>
    </body>

</html>