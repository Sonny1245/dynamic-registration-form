<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homepage</title>

<style type="text/css">
	.error{
		color: red;
		position: fixed;
		text-align: left;
		margin-left: 10px;
	}
</style>
</head>
<body bgColor="cyan" align="center">
<h1>Love Cal App</h1>
<hr/>


<form:form action="homepage-process" method="GET" modelAttribute="info">
<div>
<p>
<label>User Name: </label>
<form:input path="userName"/>
<form:errors path="userName" cssClass="error"/>
</p>
<p>
<label>Last Name: </label>
<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
</p>
<p>
<label>Term and Condition: </label>
<form:checkbox path="termAndCondition"/>
<form:errors path="termAndCondition" cssClass="error"/>
</p>
<div>
Communication
<p>
<label>Email: </label>
<form:input path="communication.email"/>
<form:errors path="communication.email"/>
</p>
<p>
<label>Phone</label>
<form:input path="communication.phone"/>
<form:errors path="communication.phone"/>
</p>
</div>
<input type="submit" value="Submit"/>
</div>
</form:form>


</body>
</html>