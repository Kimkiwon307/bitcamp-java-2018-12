<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test2</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
name:${param.name}<br>
age:${param.age}<br>
</body>
</html>
<% 
response.setHeader("Access-Control-Allow-Origin","*");
%>