<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registerpage</title>
</head>
<body bgColor="cyan" align="center">
<h1>Registration Page Begin Here</h1>
<hr/>
<form:form action="register-success" Method="GET" modelAttribute="useReg">

    <div>
        <label>Name:</label>
        <form:input path="name"/>
        <br/>
        
        <label>User Name:</label>
        <form:input path="userName"/>
        <br/>
        
        <label>Password:</label>
        <form:password path="password"/>
        <br/>
        
        <label>Countries:</label>
        <form:select path="countries">
            <form:option value="Usa">United States</form:option>
            <form:option value="Ind">India</form:option>
            <form:option value="Fr">France</form:option>
            <form:option value="Eng">England</form:option>
            <form:option value="Can">Canada</form:option> 
        </form:select>
        <br/>
        
        Hobbies: Reading<form:checkbox path="hobbies" value="reading"/>
        Travel<form:checkbox path="hobbies" value="travel"/>
        Programming<form:checkbox path="hobbies" value="programming"/>
        Sport<form:checkbox path="hobbies" value="sport"/>
        
        <br/>
        Gender: Male<form:radiobutton path="gender" value="male"/>
        Female<form:radiobutton path="gender" value="female"/>
        <br/>
        
        <input type="submit" value="register"/>
         
    </div>


</form:form>



</body>
</html>