<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grocery Form</title>
</head>
<body>
	<h1>Add Grocery Form</h1>
	<form:form action="submitGrocery.obj" modelAttribute="grocery">
		<table border="1">
			<tr>
				<td>Item Name</td>
				<td><form:input path="name"/>
				<form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Price(Rs)</td>
				<td><form:input path="price"/>
				<form:errors path="price" /></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><form:select path="category">
				<form:option value="Select" />
				<form:options items="${clist}"/>
				</form:select>
				<form:errors path="category" /></td>
			</tr>	
			<tr>
				<td>Quantity</td>
				<td><form:input path="quantity"/>
				<form:errors path="quantity" /></td>
			</tr>
			<tr>
				<td>Unit</td>
				<td><form:input path="unit"/>
				<form:errors path="unit" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><form:input path="description"/>
				<form:errors path="description" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Grocery" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>