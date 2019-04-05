<%@ page 
    language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.Socket"
    import="java.net.ServerSocket"
    import="java.util.List,java.util.Map,java.util.Set"
    trimDirectiveWhitespaces="true"
    buffer="1kb"
    autoFlush="false"%>
    <%@ page import="java.sql.Connection" %> 
<!DOCTYPE html>

<html>
<head>

<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
<h1>지시문 </h1>

<%
for(int i = 0; i <1000; i++){
  out.print(". ");
}

%>
</body>

</html>
<%-- 
 지시문
 1) page
      -서블릿 실행과 고나련하여 특정 기능을 설정한다.
 2) include
      - 다른 파일의 내용을 복사해온다
 3)  taglib
        -JSTL 등 외부 태그 정의를 가져온다
      
    page 지시문
    1) language="java"
              -JSP 페이지에서 코드를 작성할 때 사용할 언어를 지정한다.
                -즉 <% 코드 %>, <%= 포현식 %>, <%! 코드 %> 태그를   
    
 --%>