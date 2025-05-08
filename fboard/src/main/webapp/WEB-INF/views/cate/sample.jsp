<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% String pjName = "/fboard"; %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> views/cate/sample.jsp </title>
</head>
<body>

<h1>여기가 cate/sample.jsp 뷰페이지</h1>

<a href="<%=pjName%>/board/getBoardList.do">게시판목록보기(절대경로)</a><hr/>
<a href="../board/getBoardList.do">게시판목록보기(상대경로)</a><hr/>

</body>
</html>