<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 	<link rel="stylesheet" type="text/css" href="../css/main.css" /> -->
	<title>註冊頁</title>
</head>


<body>
	<h3>Welcome  ${member.username}</h3>
	
	<h3>註冊頁</h3>
	
	<form action="<c:url value="registerTrial" />" method="get">  <!-- 啟動servlet: get方法 -->
		<table>
<!-- 			<tr> -->
<!-- 				<td>ID : </td> -->
<%-- 				<td><input type="text" name="id" value="${param.id}"></td> --%>
<%-- 				<td><span class="error">${errors.id}</span></td> --%>
<!-- 			</tr> -->
			<tr>
				<td>Email : </td>
				<td><input type="text" name="email" value="${param.email}"></td>
				<td><span class="error">${errors.email}</span></td>
				<td></td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><input type="text" name="password" value="${param.password}"></td>
				<td><span class="error">${errors.price}</span></td>
			</tr>
			
<!-- 			<tr> -->
<!-- 				<td> -->
<!-- 					<input type="submit" name="prodaction" value="Insert"> -->
<!-- 					<input type="submit" name="prodaction" value="Update"> -->
<!-- 				</td> -->
<!-- 				<td> -->
<!-- 					<input type="submit" name="prodaction" value="Delete"> -->
<!-- 					<input type="submit" name="prodaction" value="Select"> -->
<!-- 					<input type="button" value="Clear" onclick="clearForm()"> -->
<!-- 				</td> -->
<!-- 			</tr> -->

			<tr>
				<td>
					<input type="submit" name="member" value="註冊">
					<input type="button" value="清除重填" onclick="clearForm()">
				</td>
			</tr>
		</table>
	</form>





	<h3><span class="error">${errors.action}</span></h3>
	
	<c:if test="${not empty delete}">
		<h3>Delete Product Table Success : ${delete} row deleted</h3>
		<script type="text/javascript">clearForm();</script>
	</c:if>
	
	<c:if test="${not empty insert}">
		<h3>Insert Product Table Success</h3>
		<table border="1">
			<tr><td>Id</td><td>${insert.id}</td></tr>
			<tr><td>Name</td><td>${insert.name}</td></tr>
			<tr><td>Price</td><td>${insert.price}</td></tr>
			<tr><td>Make</td><td>${insert.make}</td></tr>
			<tr><td>Expire</td><td>${insert.expire}</td></tr>
		</table>
		<script type="text/javascript">clearForm();</script>
	</c:if>
	
	<c:if test="${not empty update}">
		<h3>Update Product Table Success</h3>
		<table border="1">
			<tr><td>Id</td><td>${update.id}</td></tr>
			<tr><td>Name</td><td>${update.name}</td></tr>
			<tr><td>Price</td><td>${update.price}</td></tr>
			<tr><td>Make</td><td>${update.make}</td></tr>
			<tr><td>Expire</td><td>${update.expire}</td></tr>
		</table>
		<script type="text/javascript">clearForm();</script>
	</c:if>

</body>

</html>