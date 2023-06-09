<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Success Page</title>
</head>
<body bgcolor="#ffe5ec">
	<h1 align="center">Confirmation Registration Success</h1>
	<hr/>
	<div align="center">
		User:  ${userReg.user}<br/>
		User Name: ${userReg.userName}<br/>
		Password: ${userReg.password}<br/>
		Country: ${userReg.countryName}<br/>
		Hobbies: 	
		<c:forEach var="temp" items="${userReg.hobbies}" varStatus="loop">
			${temp}
			<c:if test="${!loop.last}">,</c:if>
		</c:forEach>
		<br/>
		Gender: ${userReg.gender}<br/>
	</div>
	
</body>
</html>