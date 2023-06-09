<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body bgcolor="#f2e6ff">
	<h1 align="center">Please Register Here</h1>
	<hr/>
	<form:form action="registration-success" method="GET" modelAttribute="userReg">
	 <div align="center">
		<label for="user">User: </label>
		<form:input id="user" path="user"/>
		<br/>
		<label for="un">User Name: </label>
		<form:input id="un" path="userName"/>
		<br/>
		<label for="pw">Password: </label>
		<form:password id="pw" path="password"/>
		<br/>	
		<label for="cn">Country: </label>
		<form:select id="cn" path="countryName">
			<form:option value="Ind" label="India"></form:option>
			<form:option value="USA" label="United States"></form:option>
			<form:option value="UK" label="United Kingdom"></form:option>
		</form:select>
		<br/>
		<label>Hobbies: </label>
		Cricket: <form:checkbox path="hobbies" value="cricket"/>
		Reading: <form:checkbox path="hobbies" value="reading"/>
		Travel: <form:checkbox path="hobbies" value="travel"/>
		Programming: <form:checkbox path="hobbies" value="programming"/>
		<br/>
		<label for="rb">Gender: </label>
		Male: <form:radiobutton id="rb" path="gender" value="male"/>
		Female: <form:radiobutton id="rb" path="gender" value="female"/>
		<br/>
		<input type="submit" value="register"/>
	</div>
	</form:form>	
</body>
</html>