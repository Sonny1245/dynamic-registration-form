<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register page</title>
</head>
<body bgcolor="cyan">
	<div align="center">
		<h1>Employees Register Form</h1>
		<form action="<%= request.getContextPath()%>/register" method="POST" >
			<table  style="width 80%">
			
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName"/></td>
				</tr>
				
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName"/></td>
				</tr>
				
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName"/></td>
				</tr>
				
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"/></td>
				</tr>
				
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"/></td>
				</tr>
				
				<tr>
					<td>Contact</td>
					<td><input type="text" name="contact"/></td>
				</tr>
				
			</table>
			
			<input type="submit" value="Submit"/>
		
		</form>
	</div>
</body>
</html>