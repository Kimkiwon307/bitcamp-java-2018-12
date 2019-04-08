<%@ page language="java" 
contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"
  errorPage="ex20_error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex20</title>
</head>
<body>
<h1>pageError, isPageError</h1>
10 / 0 = <%= 10 / 0%>



</body>
</html>
<%--
errorPage
=> JSP를 실행하는 주엥 오류가 발생했을 때 실행할 JSP를 지정할 수 있다.
=> 어떻게?
        <%@ page errorPage="URL"%>
        
    
==> d
 
 --%>




