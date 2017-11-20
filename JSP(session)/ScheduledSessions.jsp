<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduled Sessions</title>
</head>
<body>

	<div style="text-align: center;">
		<h1>
			<u>Scheduled Sessions</u>
		</h1>
		<table align="center" cellspacing="10">
			<tr>
				<th>SessionName</th>
				<th>Duration(Days)</th>
				<th>Faculty</th>
				<th>Mode</th>
			</tr>


			<c:forEach var="scheduledSession" items="${scheduledSessionList}">

				<tr>
					<td>${scheduledSession.name}</td>
					<td>${scheduledSession.duration}</td>
					<td>${scheduledSession.faculty}</td>
					<td>${scheduledSession.mode1}</td>
					<td><a
						href="showUpdate.obj?name=${scheduledSession.name}&duration=${scheduledSession.duration}&faculty=${scheduledSession.faculty}&role=${scheduledSession.mode1}">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>