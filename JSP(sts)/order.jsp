<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Welcome to SharePrice</h2>
<form:form action="order" modelAttribute="quantity">
<input type="hidden" value="${stock.stock }" name="stock">
<input type="hidden" value="${stock.quote }" name="quote">
<table border="2" align="center">
<tr><td>Stock</td><td>${stock.stock }</td></tr>
<tr><td>Quote</td><td>${stock.quote }</td></tr>
<tr><td>Action</td><td><input type="radio" name="sel" value="buy" checked="checked">Buy<input type="radio" name="sel" value="sell">Sell</td></tr>
<tr><td>Quantity</td><td><form:input path="quantity" /><form:errors path="*"  cssStyle="color:red" /></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="order"/></td></tr>
</table>
</form:form>
</body>
</html>