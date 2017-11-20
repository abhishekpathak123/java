<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Report</title>
</head>
<body>
<h1>Customer Details</h1>
	<table border=1>
		<tr>
			<th>Cust Number</th>
			<th>Base Pack</th>
			<th>Optional Pack</th>
		</tr>

		<c:forEach var="customer" items="${customerList}">
			<tr>
				<td><a href="updateCust?custId=${customer.custNum}">${customer.custNum}</a></td>
				<td>${customer.basePack}</td>
				<c:choose>
				<c:when test="${customer.optionalPack == NULL}"><td>None</td></c:when>
				<c:otherwise><td>${customer.optionalPack }</td></c:otherwise>
				</c:choose>
			</tr>
		</c:forEach>
	</table>
</body>
</html>