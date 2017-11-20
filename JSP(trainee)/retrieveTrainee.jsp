<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Retrieve Trainee</title>
</head>
<body>
	<h1>Retrieve Operation</h1>
	<c:url var="myAction" value="/retrieveTrainee.obj">
	</c:url>
	<form:form action="${myAction}" method="post" modelAttribute="trainee">
		<table border=1>
			<tr>
				<td>Please enter trainee ID</td>
				<td><form:input path="traineeId" /></td>
				<td><input type="submit" value="retrieve" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>