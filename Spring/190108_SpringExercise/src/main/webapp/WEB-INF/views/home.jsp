<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	<form action = "loginCheck" method="post">
	ID : <input type="text" name="id"><font color="red">${warning}</font><br>
	PW : <input type="password" name="pw"><br>
	<button>Login</button>
	</form>
	
	
	<!-- a태그를 사용해서도 action을 전달할 수 있다. -->
	<!-- <a href="loginCheck?param=asdfeqwer"">로그인</a> -->
	
	
	<form action = "signIn" method="post">
	<button>SignIn</button>
	</form>
	
	<font color="red">${congrats}</font>
	
</body>
</html>
