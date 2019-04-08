<%@ page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex10</title>
</head>
<body>
<h1>JSP 빌트인 객체 - JSP에서 기본으로 사용할 수 있는 객체</h1>
<%

//JSp 에서 기본으로 준비한 변수 사용가능
request.setAttribute("aaa", "okok");
session.setAttribute("bbb", "nono");
application.setAttribute("ccc", "hhaha");
out.println("gdgd");

%>
</body>
</html>
<%-- 

JSP 빌트인 객체
  - JSP를 가지고 서블릿 클래스를 만들 때 _jspService() 메서드에서 기본으로 준비하는 객체
  - 반드시 다음과 같은 이름으로 레퍼런스를 선언해야 한다.
    즉 서블릿 컨테이너(ex: 톰캣, jetty, resin 등)에 상관없이 이름이 같다.
    
  1) request - HttpServletRequest => _jspService() 파라미터이다.
  2) response - HttpServletResponse => _jspService() 파라미터이다.
  3) pageContext - PageContext => _jspService()의 로컬 변수이다.
  4)  session - HttpSession => _jspService()의 로컬 변수이다.
  5)  application - ServletContext => _jspService()의 로컬변수이다. 
  6) 
--%>








