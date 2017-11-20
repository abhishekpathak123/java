<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainee Application</title>
</head>
<body>
<center>
<h1 style="color: #0066CC">CapG</h1>
</center>
<c:url var="myAction" value="viewEmployee.obj"></c:url>
<form:form action="${myAction}" method="post" modelAttribute="employee">
	<center>
	<h2>Enter Employee ID:</h2>
	<br>
	<form:input path="empId"></form:input> <br>
	<input type="submit" value="Search" /></center>
</form:form>

<c:if test="${isFirst!=true}">
	<u>
	<h2 align="center">Employee Information</h2>
	</u>
	<table border="1" align="center">
		<tr>
			<th bgcolor="bisque"> ID</th>
			<th bgcolor="bisque">Name</th>
			<th bgcolor="bisque">Salary</th>
		
		</tr>
		<tr>
			<td><c:out value="${eBean.empId}" /></td>
			<td><c:out value="${eBean.empName}" /></td>
			<td><c:out value="${eBean.salary}" /></td>
			
		</tr>
		<tr>
			<td colspan="5" align="center"><a href="showHomePage.obj">Click
			Here To Go to Home</a></td>
		</tr>
	</table>

</c:if>
</body>
</html>