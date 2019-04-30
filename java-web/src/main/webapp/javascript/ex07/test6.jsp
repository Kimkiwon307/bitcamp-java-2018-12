<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
response.setHeader("Access-Control-Allow-Origin","*");
%>
[
 {"no":1, "title":"제목입니다.", "writer":"홍길동", "viewCnt":100},
 {"no":2, "title":"제목입니다.", "writer":"홍동",  "viewCnt":200},
 {"no":3, "title":"제목입니다.", "writer":"홍길", "viewCnt":300},
 {"no":4, "title":"제목입니다.", "writer":"길동", "viewCnt":400},
 {"no":5, "title":"제목입니다.", "writer":"힝길동", "viewCnt":500}
]
