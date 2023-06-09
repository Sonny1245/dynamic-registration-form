<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>succespage</title>
</head>
<body bgColor="pink" align="center">
<h1>Confirmation Registration Success Page</h1>
<hr/>
    <%@ page isELIgnored="false" %>
    <%@ page trimDirectiveWhitespaces="true" %>
    
    Name:           ${useReg.name}<br/>
    User Name:      ${useReg.userName}<br/>
    Password:
    <c:forEach var="temp1" items=" ${useReg.password}">   
        ${temp1}  
    </c:forEach>   
    <br/>
    Country:        ${useReg.countries}<br/>
    Hobby: 
    <c:forEach var="temp" items="${useReg.hobbies}" varStatus="loop">   
        ${temp}
        <c:if test="${!loop.last}">,</c:if>   
    </c:forEach>           
    <br/>
    Gender:         ${useReg.gender}

</body>
</html>