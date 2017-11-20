<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Trainee</title>
</head>
<body>
	<h1>Enter trainee details</h1>
	<c:url var="myAction" value="/addTrainee.obj">
	</c:url>
	<form:form action="${myAction}" method="post" modelAttribute="trainee">
		<table>
			<tr>
				<td>Trainee Id</td>
				<td><form:input path="traineeId" /></td>
				<td style="color: red;"><form:errors path="traineeId"></form:errors></td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><form:input path="traineeName" /></td>
				<td style="color: red;"><form:errors path="traineeName"></form:errors></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><form:radiobutton path="traineeLocation" value="Chennai"
						label="Chennai" /> <form:radiobutton path="traineeLocation"
						value="Bangalore" label="Bangalore" /> <form:radiobutton
						path="traineeLocation" value="Pune" label="Pune" /> <form:radiobutton
						path="traineeLocation" value="Mumbai" label="Mumbai" /></td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td><form:select path="traineeDomain">
						<form:option value="" label="Please Select" />
						<form:options items="${domainList}" />
					</form:select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Trainee" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>