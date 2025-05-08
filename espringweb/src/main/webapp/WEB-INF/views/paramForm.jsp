<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> paramForm.jsp </title>
</head>
<body>

<h1>폼의 데이타값을 출력 </h1>
결과아이디 : ${ memberVO.id } <br/>
결과이름 : ____ <br/>
결과나이 : ____ <br/>

<hr/><hr/>
세션값 : ${sessionScope.login }

</body>
</html>