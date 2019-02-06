<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Sign Up Page</title>
</head>
<body>

	<form action="enrollment">
	ID : <input type="text" name="userId" value="${User.userId}">
	PW : <input type="text" name="userPw" value="${User.userPw}">
	<button>가입하기</button>
	</form>

</body>
</html>
