<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

	<form action="login">
	ID : <input type="text" name="userId" value="${User.userId}">
	PW : <input type="password" name="userPw" value="${User.userPw}">
	<button>로그인</button>
	</form>

	<br>

	<form action="signUp">
	<button>회원가입</button>
	</form>

	<font color="red">${Success}</font>
	<font color="red">${Warning}</font>
	
</body>
</html>
