<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<style>
    body {background-color: rgb(213, 245, 245);}
    h1   {color: blue;
          text-align:center;}
</style>

<body>
	<h1>Login Page</h1>
	<hr/>

	<div class="container">
		<div class="row">
		
			<div class="col-lg-3"></div>
			
			<div class="col-lg-6">
				<div id="ui"></div>
					<form class="form-group" action="LoginCheck" method="post">
						<div class="row">
						
							<div class="col-lg-6">
								<label for="fname">First Name: </label>
								<input type="text" name="firstName" id="fname" 
								class="form-control"
								placeholder="Enter your first name"/>	
							</div>
						
							<div class="col-lg-6">
								<label for="lname">Last Name: </label>
								<input type="text" name="lastName" id="lname"
								class="form-control" 
								placeholder="Enter your last name"/>	
							</div>
							
							<div class="col-lg-6">
								<label for="user_name">User Name: </label>
								<input type="text" name="username" id="user_name" 
								class="form-control"
								placeholder="Enter your user name"/>	
							</div>
							
							<div class="col-lg-6">
								<label for="pw">Password: </label>
								<input type="password" name="password" id="pw"
								class="form-control" 
								placeholder="Enter your password"/>	
							</div>
						</div>
						<br/>
						<input type="submit" name="submit" value="Submit"
						 class="btn- btn-primary btn-block"/>		
					</form>	
			</div>
			
			<div class="col-lg-3"></div>
		
		</div>
	</div>

	<!-- <form action="LoginCheck" method="post">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
 -->
</body>
</html>