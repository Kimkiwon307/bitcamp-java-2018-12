<%@ page 
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
<title>ex12</title>
</head>
<body>
<h1>JSP 액션 태그 - jsp:useBean,jsp:setProperty</h1>
<%-- 보관소에 저장된 객체 꺼내기 --%>
<%
application.setAttribute("s1", "홍길동");
session.setAttribute("s2", "임꺽정");
request.setAttribute("s3","안중근");
pageContext.setAttribute("s4","윤봉길");
%>
<jsp:useBean id="s1" type="java.lang.String" scope="application"/>
<%-- 자바코드로 표현해보면,
         String s1 = (String) application.getAttribute("s1"); --%>
<jsp:useBean id="s2" type="java.lang.String" scope="session"/>
<jsp:useBean id="s3" type="java.lang.String" scope="request"/>
<jsp:useBean id="s4" type="java.lang.String" scope="page"/>

<%=s1 %><br>
<%=s2 %><br>
<%=s3 %><br>
<%=s4 %><br>

</body>
</html>
<%-- 
jsp:useBean(게속)
  1) type 속성
        - 보관소에서 꺼낸 객체의 타입을 지정할 때 쓰인다
--%>







