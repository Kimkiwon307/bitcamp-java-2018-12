<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<%! 
// 다음과 같이 상속 받은 메서드를 오버라이딩 할 수 있따.
public void jspInit(){
  System.out.println("ex06.jsp의 jspInit()");
}

%>
<meta charset="UTF-8">
<%
String []  names = {"홍길동", "임꺽정", "유관순"};
%>
<title>Insert title here</title>
</head>
<body>
<h1>선언부(decloaration element) </h1>
100,000,000 입금 = <%= calculate(100000000) %>
<ul>
</ul>
</body>
<%!
float interest = 0.025f;  
private long calculate(long money){
  return money + (long)(money * interest);
}

%>
</html>
<%-- 
  선언부
  - 클래스 멤버를 추가할 때 사용한다.
  -jspInit()나 jspDestroy()와 같은 메서드를 오버라이딩 할 때도 사용할 수 있다.
  
  - 문법:
         <%! 멤버 선언 %>
  - 자바 코드 :
   class JSP 클래스 {
        
        멤버 선언 
        
        void _jspService(){
          ...
        }
        
   }   


 --%>