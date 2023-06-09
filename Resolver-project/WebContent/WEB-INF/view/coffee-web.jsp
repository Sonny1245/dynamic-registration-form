<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coffee</title>
</head>
<body bgColor="green" align="center">
    <h1>Welcome to Sonny's Coffee Shop</h1>
    <hr/>
  <form action="processOrder" Method="GET">  
    <div>
        <label for="item_name">Item Name: </label>
        <input type="text" name="foodType" id="item_name"/>
        <input type="submit" value="Order Now"/>   
    </div>    
  </form>  
    
</body>
</html>