<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Product Management System</h2>
	<table border="2" align="center">
		<tr>
			<th>Product Id</th>
			<th>Product</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Description</th>
			<th>Actions</th>
			</tr>
		<c:forEach var="stocklist" items="${slist}">
			<tr>
				<%-- <td><a href="stockname?name=${stocklist.stock}">${stocklist.stock}</a></td> --%>
				<td>${stocklist.productId}</td>
				<td>${stocklist.productName}</td>
				<td>${stocklist.productPrice}</td>
				<td>${stocklist.productQuantity}</td>
				<td>${stocklist.description}</td>
				<td><a href="deleteProduct.obj?productId=${stocklist.productId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>