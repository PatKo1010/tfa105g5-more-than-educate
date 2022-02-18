<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Course</title>
<script type="text/javascript">
function clearForm() {
	var inputs = document.getElementsByTagName("input");
	for(var i=0; i<inputs.length; i++) {
		if(inputs[i].type=="text") {
			inputs[i].value="";
		}
	}
}
</script>
</head>
<body>

<h3>Welcome</h3>

<h3>Course Table</h3>

<form action="<c:url value="/views/course" />" method="get">
<table>
	<tr>
		<td>MemId : </td>
		<td><input type="text" name="memid" value="${param.memid}"></td>
		<td><span class="errors">${errors.memid}</span></td>
	</tr>
	
	<tr>
		<td>ExpertiseId : </td>
		<td><input type="text" name="expertiseid" value="${param.expertiseid}"></td>
		<td><span class="errors">${errors.expertiseid}</span></td>
	</tr>
	
	<tr>
		<td>CourseTitle : </td>
		<td><input type="text" name="coursetitle" value="${param.coursetitle}"></td>
	</tr>
	
	<tr>
		<td>CourseIntro : </td>
		<td><input type="text" name="courseintro" value="${param.courseintro}"></td>
	</tr>
	
	<tr>
		<td>ClassAmount : </td>
		<td><input type="text" name="classamount" value="${param.classamount}"></td>
		<td><span class="errors">${errors.classamount}</span></td>
	</tr>
	
		<tr>
		<td>Price : </td>
		<td><input type="text" name="price" value="${param.price}"></td>
		<td><span class="errors">${errors.price}</span></td>
	</tr>

	<tr>
		<td>
			<input type="submit" name="production" value="Insert">
			<input type="submit" name="production" value="Update">
		</td>
		<td>
			<input type="submit" name="production" value="Delete">
			<input type="submit" name="production" value="Select">
			<input type="button" value="Clear" onclick="clearForm()">
		</td>
	</tr>
</table>
</form>

<h3><span class="errors">${errors.action}</span></h3>

<c:if test="${not empty delete}">
<h3>Delete Product Table Success : ${delete} row deleted</h3>
<script type="text/javascript">clearForm();</script>
</c:if>

<c:if test="${not empty insert}">
<h3>Insert Product Table Success</h3>
<table border="1">
	<tr><td>MemId</td><td>${insert.memid}</td></tr>
	<tr><td>ExpertiseId</td><td>${insert.expertiseid}</td></tr>
	<tr><td>CourseTitle</td><td>${insert.coursetitle}</td></tr>
	<tr><td>CourseIntro</td><td>${insert.courseintro}</td></tr>
	<tr><td>ClassAmount</td><td>${insert.classamount}</td></tr>
	<tr><td>Price</td><td>${insert.price}</td></tr>
</table>
<script type="text/javascript">clearForm();</script>
</c:if>

<c:if test="${not empty update}">
<h3>Update Product Table Success</h3>
<table border="1">
	<tr><td>MemId</td><td>${update.memid}</td></tr>
	<tr><td>ExpertiseId</td><td>${update.expertiseid}</td></tr>
	<tr><td>CourseTitle</td><td>${update.coursetitle}</td></tr>
	<tr><td>CourseIntro</td><td>${update.courseintro}</td></tr>
	<tr><td>ClassAmount</td><td>${update.classamount}</td></tr>
	<tr><td>Price</td><td>${update.price}</td></tr>
</table>
<script type="text/javascript">clearForm();</script>
</c:if>

</body>
</html>