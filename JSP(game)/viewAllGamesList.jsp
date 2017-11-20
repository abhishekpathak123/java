<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border=1>
			<tr>
				<th bgcolor="bisque">Game Id</th>
				<th bgcolor="bisque">Game Name</th>
				<th bgcolor="bisque">Game Price</th>
				<th bgcolor="bisque">Select Game</th>

			</tr>
			<c:forEach var="gameList" items="${list}">
				<tr>
					<td>${gameList.gameId}</td>
					<td>${gameList.gameName}</td>
					<td>${gameList.price}</td>
					<td><a href="UserIdGameForm.obj?price=${gameList.price}">Play
							a game</a></td>

				</tr>
			</c:forEach>
			<tr>
				<td colspan="5" align="center"><a href="showHomePage.obj.obj">Click
						Here To Go to Home</a></td>
			</tr>
		</table>
	</center>
</body>
</html>