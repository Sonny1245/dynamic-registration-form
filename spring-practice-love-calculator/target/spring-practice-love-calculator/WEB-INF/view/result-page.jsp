<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>resultpage</title>
</head>
<body bgColor="pink" align="center">

    <h1>Confirmation Page</h1>
    <hr/>
    <%@ page isELIgnored="false" %>
    <p>   
        User Name is: ${userInfor.userName}   
    </p>
    <p>        
        Crush Name is: ${userInfor.crushName}   
    </p>
    

</body>
</html>