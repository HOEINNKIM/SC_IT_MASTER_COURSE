<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

	<c:if test="${sessionScope.loginId==null}">
	<a href="signup">회원가입하기</a>
	<a href="login">로그인하기</a>	
	</c:if>

	<c:if test="${sessionScope.loginId!=null}">
	<h1>${sessionScope.loginId}님, 환영합니다!</h1>
	<a href="logout">로그아웃</a>	
	<a href="board?page=1">게시판 가기</a>	
	</c:if>



</body>
</html>
