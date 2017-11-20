<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FRS</title>
</head>
<body>


	<h1>Add Flat Details</h1>
	<c:url var="myAction" value="addFlat.obj"></c:url>
	<table>
		<form:form action="${myAction}" method="post" modelAttribute="frsbean">


			<tr>
				<td>Enter Your Name</td>
				<td><form:input path="CustName" /></td>
				<form:errors path="CustName" cssStyle="red" />
			</tr>


			<tr>
				<td>BHK</td>
				<td><form:radiobuttons items="${bhklist}"
						path="bhk" /></td>
				<td></td>
			</tr>
			
				<tr>
				<td>Enter Amount</td>
				<td><form:input path="Amount" /></td>
				<form:errors path="Amount" cssStyle="red" />
			</tr>
			

<tr>
	<td colspan="3"><input type="submit" value="ADD Flat" /></td>
</tr>



</form:form>
</table>
</body>
</html>