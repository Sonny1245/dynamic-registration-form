<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>

<h1>Hello World From JSP</h1>

JSP Expression:
<br/>
<%= new java.util.Date() %> 
<br/>
<%= new String("Sonny Nguyen".toUpperCase()) %>
<br/>
25*4 = <%= 25*4 %>
<br/>
 Is 69 < 75? <%= 69 < 75 %>
 <br/>
 <br/>
 JSP Scriptlet example using Looping as follows:
 <%
     for(int i=0; i<3; i++){
         out.println("<br/> Here is the loop: " +i);
     }
 %>
 <br/>
 <br/>
 JSP Declaration by writing a Method as follows:
 <%!
    String makeItLower(String data){
     return data.toLowerCase();
 }
 %>
  <br/>
 Call Method Using JSP Expression:  
 <%= makeItLower("Hello Sonny Nguyen!") %>

</body>
</html>