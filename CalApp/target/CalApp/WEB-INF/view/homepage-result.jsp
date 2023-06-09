<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>resultpage</title>
</head>
<body bgColor="pink" align="center">
<h1>Result Page</h1>
<div>
	<%@ page isELIgnored="false"%>
	<p>User Name: ${info.userName }</p>
	<p>Last Name: ${info.lastName }</p><br/>
	<p>Communication Channel</p>
	<p>Email: ${info.communication.email}</p>
	<p>Phone: ${info.communication.phone}</p>
	
</div>
</body>
</html>