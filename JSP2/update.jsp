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
<center>
<h1 style="color: #0066CC">CapG</h1>
</center>

<c:if test="${isFirst!=true}">
	<u>
	<h2>Modify Employee Information</h2>
	</u>
	<c:url var="myAction" value="updateEmployee.obj"></c:url>
	<form:form action="${myAction}" method="post" modelAttribute="employee">
	ID:<form:input path="empId" readonly="true"/><br><br>
	<%-- Name:<form:input path="empName" value="${name}"/><br><br> --%>
	Salary:<form:input path="salary" value="${salary}"/><br><br>
	<input type="submit" value="Update">
	</form:form>

</c:if>
</body>
</html>