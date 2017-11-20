<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Welcome to SharePrice</h2>
<table border="2" align="center">
<tr><td colspan="2" align="center">Order Summary</td></tr>
<tr><td>Order Amount </td><td>${order.orderAmount }</td></tr>
<tr><td>Commission </td><td>${order.commission }</td></tr>
<tr><td colspan="2" align="center"><a href="home">Home Page</a></td></tr>
</table>
</body>
</html>