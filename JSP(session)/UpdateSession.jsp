<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Session</title>
</head>
<body>
	<div>
		<h1 style="text-align: center;">
			<u>Update Session</u>
		</h1>
		<table align="center" cellspacing="10">
			<tr>
				<td>SessionName:</td>
				<td><form:input path="name" value="${name}" disabled="true" /></td>
			</tr>
			<tr>
				<td>Duration:</td>
				<td><form:input path="duration" value="${duration}" /></td>
			</tr>
			<tr>
				<td>Faculty:</td>
				<td><form:input path="faculty" value="${faculty}" /></td>
			</tr>
			<tr>
				<td>Role:</td>
				<td><form:select path="role">
						<form:option value="" label="${role}" />
						<form:options items="${roleList}" />
					</form:select></td>
			</tr>
		</table>
	</div>
</body>
</html>