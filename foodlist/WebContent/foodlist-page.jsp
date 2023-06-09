<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>foodlist</title>
</head>
<body bgcolor="pink" align="center">
	<h1>List of Items are:</h1>
<table align="center" border="1" cellpadding="20" 
	   bordercolor="black" style="width:100%">

	<tr>
		<th>ID</th>
		<th>ITEM</th>
		<th>PRICE</th>
	</tr>
	
	<c:forEach var = "tempItem" items= "${foodItems}">
	<tr>
		<td>${tempItem.id}</td>
		<td>${tempItem.item}</td> 
		<td>${tempItem.price}</td> 	
	</tr>
	</c:forEach>
</table>		
</body>
</html>