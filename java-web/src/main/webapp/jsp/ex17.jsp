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
<%-- id가 가리키는 객체가 보관소에 없을 때
       class 속성에 지정된 타입의 인스턴스를 생성한다.
        그래서 class  속성에는 인터페이슨 추상 클래스를 지정할 수없다.ㅏ
        왜? 인터페이스나 추상클래스는 인스턴스를 생성 할 수없다.--%>
<jsp:useBean id="list" class="java.util.ArrayList" scope="page"/>
<%-- 자바코드로 표현해보면,
         java.util.ArrayList list = (java.util.ArrayList)pageContext.getAttribute("list");
        if(list == null){
        list = new java.util.List();
        pageContext.setAttribute("list",list);
          }
         --%>
<%
//제네릭 문법을 사용하지 못했기 떄문에 list의 타입은 java.util.ArrayListdlek.
// 따라서 for 문에서 항목의 타입을 지정할 때 String으로 지정할 수 없다.
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








