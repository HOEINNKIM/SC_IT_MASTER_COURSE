<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="UTF-8">
	<title>Login</title>
</head>
<body>
	<form action="loginMember">
		<input type="text" name="id"><font color="red">${Warning}</font>
		<input type="text" name="pw">
		<button>로그인하기</button>
	</form>
	

</body>
</html>
