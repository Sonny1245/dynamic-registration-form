<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 20px;
}
</style>
</head>
<body bgcolor="#FFFFFF">
	<h1 align="center">DMV Registration</h1>
	<hr />
	<form:form action="process-homepage" method="GET"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="un">User Name:</label>
				<form:input id="un" path="userName" />
				<form:errors path="userName" cssClass="error" />
			</p>
			<p>
				<label for="cn">Crush Name:</label>
				<form:input id="un" path="crushName" />
				<form:errors path="crushName" cssClass="error" />
			</p>
			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>Accept</label>
				<form:errors path="termAndCondition" cssClass="error"/>
			</p>
			<input type="submit" value="Submit" />
		</div>
	</form:form>
</body>
</html>