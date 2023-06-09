<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>

    Student Name: 
    ${param.firstName}  ${param.lastName}
    <br/>
     <br/>
    Student's Favorite Languages: <br/>
      <ul>
   <%  
    String[] langs = request.getParameterValues("favoriteLanguage");
    
 
       for(String item: langs){
           
           out.println("<li>" + item + "</li>");
           
           
       }
       
  
  %>
    
    </ul>
</body>
</html>