<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> re / request.jsp </title>
</head>
<body>

<h2> re/request.jsp 결과 뷰페이지 </h2>

아이디 : ${ param.id } <br/>
이름 :  ${ param.name } <br/>
나이 :  ${ param.age } <br/>

<hr/><hr/>
 
아이디 : ${ memberVO.id } <br/>
이름 :  ${ memberVO.name } <br/>
나이 :  ${ memberVO.age } <br/>

<hr/>

</body>
</html>