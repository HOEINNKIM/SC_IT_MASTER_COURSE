<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	${sessionScope.loginId}
	
	
	<c:if test="${sessionScope.loginId==null}">
	<form action="signup">
		<button>가입하기</button>
	</form>
	<font color="red">${Success}</font>
	<form action="login">
		<button>로그인하기</button>
	</form>
	</c:if>

	<c:if test="${sessionScope.loginId!=null}">
	<font color="green">${sessionScope.loginId} 님 환영합니다.</font>
	<form action="Board">
		<button>게시판 보기</button>
	</form>
	</c:if>
	
</body>
</html>
