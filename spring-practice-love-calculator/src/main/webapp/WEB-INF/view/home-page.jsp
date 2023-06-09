<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homepage</title>

<style type="text/css">
    .errors{
        color: red;
        position: fixed;
        text-align: left;
        margin-left: 10px;
    
    }
</style>
</head>
<body bgColor="cyan" align="center">

    <h1>Love Calculator</h1>
    <hr/>
    
    <form:form action="process-homepage" Method="GET" modelAttribute="userInfor">
	    <div>
		    <p>
		    <label for="yn">Your Name:</label>
		    <form:input  id="yn" path="userName"/>
		    <form:errors path="userName" cssClass="errors"/>
		    </p>
		    <p>
		    <label for="cn">Crush Name:</label>
		    <form:input id="cn" path="crushName"/>
		     <form:errors path="crushName" cssClass="errors"/>
		    </p>
		    <p>
		    <form:checkbox path="termAndCondition" id="check"/>
		    <label> I am agreeing to check the box</label>
		    <form:errors path="termAndCondition" cssClass="errors"/>
		    </p>
		    <input type="submit" value="calculator"/>
	    </div>
    </form:form>
</body>
</html>