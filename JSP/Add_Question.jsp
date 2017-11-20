<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Question</title>
</head>
<body>
	<center>
		<h1>Gear Quiz Bank Maintenance</h1>
		<h1>Add Question</h1>
		<a href="showHomePage.obj">Home</a>
		<c:url var="myAction" value="/addQuestion.obj"></c:url>
		<form:form action="${myAction}" method="post"
			modelAttribute="question">
			<table>
				<tr>
					<td>Select Topic:</td>
					<td><form:select path="Ques_subtopic">
							<form:option value="" label="....SELECT...." />
							<form:options items="${topicList}" />
						</form:select></td>
					<td></td>
				</tr>
				<tr>
					<td>Question Category:</td>
					<td><form:radiobutton path="Ques_category" value="C"
							label="Complex" /> <form:radiobutton path="Ques_category"
							value="S" label="Simple" /></td>

				</tr>
				<tr>
					<td>Question:</td>
					<td><form:input path="Question" /></td>
					<td style="color: red;"><form:errors path="Question"></form:errors></td>
				</tr>
				<tr>
					<td>Option 1:</td>
					<td><form:input path="Option1" /></td>
					<td style="color: red;"><form:errors path="Option1"></form:errors></td>
				</tr>
				<tr>
					<td>Option 2:</td>
					<td><form:input path="option2" /></td>
					<td style="color: red;"><form:errors path="option2"></form:errors></td>
				</tr>
				<tr>
					<td>Option 3:</td>
					<td><form:input path="option3" /></td>
					<td style="color: red;"><form:errors path="option3"></form:errors></td>
				</tr>
				<tr>
					<td>Option 4:</td>
					<td><form:input path="option4" /></td>
					<td style="color: red;"><form:errors path="option4"></form:errors></td>
				</tr>
				<tr>
					<td>Answer:</td>
					<td><form:input path="Answer" /></td>
					<td style="color: red;"><form:errors path="Answer"></form:errors></td>
				</tr>
				<tr>
					<td>Remarks:</td>
					<td><form:input path="Remarks" value="Date created : ${date}" /></td>
					<td style="color: red;"><form:errors path="Remarks"></form:errors></td>
				</tr>
				<tr>
					<td>No of Reviews:</td>
					<td><form:input path="Review_cnt" /></td>
					<td style="color: red;"><form:errors path="Review_cnt"></form:errors></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value="Add Question"></input></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>