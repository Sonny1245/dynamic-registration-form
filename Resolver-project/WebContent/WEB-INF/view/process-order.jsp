<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Received</title>
</head>
<body bgColor="cyan" align="center">
    <h1>Process Order Page Received.</h1>
    Your order <span style="color:red;font-family:Arial"> ${itemName}</span> has been received and processed. Thank you!
    <br />
    Currently TimeStamp is: <%= new java.util.Date() %>
</body>
</html>