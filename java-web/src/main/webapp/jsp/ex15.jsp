<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.ArrayList"
  
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
     %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex14</title>
</head>
<body>
<h1>JSP 액션 태그 - jsp:useBean(계속)</h1>
<%--id로 지정된 객체를 찾지 못하면 예외가 발생한다. --%>
<jsp:useBean id="list" type="java.util.List<String>" scope="page"/>
<%-- 자바코드로 표현해보면,
         java.util.List<String> list = (java.util.List<String>)pageContext.getAttribute("list");
        if(list == null){
        throw new Throwabl
          }
         --%>
<%
for (String n : list){
  out.println(n+"<br>");
}

%>
</body>
</html>
<%-- 
jsp:useBean(게속)
  1) type 속성
        - 보관소에서 꺼낸 객체의 타입을 지정할 때 쓰인다
--%>







