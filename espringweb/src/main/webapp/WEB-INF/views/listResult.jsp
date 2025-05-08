<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> WEB-INF/views/listResult.jsp </title>
</head>
<body>

<h1>멤버리스트</h1>

<table>
	<tr>
		<td>아이디</td><td>이름</td><td>나이</td>
	</tr>
	<!-- **************************
		 위에 taglib 지정
	 -->
	<c:forEach var='vo' items='${memberVOList.list}'>
		<c:if test="${vo.state }">
			<tr>
				<td>${vo.id }</td>
				<td>${vo.name }</td>
				<td>${vo.age }</td>
			</tr>
		</c:if>
	</c:forEach>

</table>


</body>
</html>