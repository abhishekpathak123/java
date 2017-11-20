<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Operation</title>
</head>
<body>
	<h1>Modify Operation</h1>
	<c:url var="myAction" value="/showModifiedTrainee.obj">
	</c:url>
	<form:form action="${myAction}" method="post" modelAttribute="trainee">
		<table border="1">
			<tr>
				<td>Please enter trainee ID</td>
				<td><form:input path="traineeId" /></td>
				<td><input type="submit" value="modify" /></td>
			</tr>
		</table>
	</form:form>

	<c:url var="myAction" value="/modifyTrainee.obj">
	</c:url>
	<form:form action="${myAction}" method="post" modelAttribute="trainee">
		<h1>Trainee Info</h1>
		<table border="1">
			<tr>
				<td>Trainee ID</td>
				<td><form:input path="traineeId" value="${trainee.traineeId}" /></td>
				<td style="color: red;"><form:errors path="traineeId"></form:errors></td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><form:input path="traineeName"
						value="${trainee.traineeName}" /></td>
				<td style="color: red;"><form:errors path="traineeName"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><form:input path="traineeLocation"
						value="${trainee.traineeLocation}" /></td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td><form:input path="traineeDomain"
						value="${trainee.traineeDomain}" /></td>

			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="modify" /></td>
		</table>
	</form:form>
</body>
</html>