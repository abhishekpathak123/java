<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
</head>
<body>
<c:url var="myAction" value="viewUsers.obj"></c:url>
<form:form action="${myAction}" method="post" modelAttribute="user">
	<center>
	<h2>Enter the User ID</h2>
	<br>
	<form:input path="userId"></form:input> <br>
	<input type="submit" value="Search" /></center>
</form:form>
<c:if test="${isFirst==true}">
	
		<center><h2>User Information</h2></center>
	
	<table border="1" align="center">
		<tr>
			<th bgcolor="bisque">User Id</th>
			<th bgcolor="bisque">User Name</th>
			<th bgcolor="bisque">User Balance</th>
			
		</tr>
		<tr>
			<td><c:out value="${user1.userId}" /></td>
			<td><c:out value="${user1.userName}" /></td>
			<td><c:out value="${user1.userBalance}" /></td>
		
		</tr>
		<tr>
			<td colspan="5" align="center"><a href="showHomePage.obj.obj">Click
			Here To Go to Home</a></td>
		</tr>
	</table>

</c:if>
</body>
</html>