<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

	<form action="login">
	ID : <input type="text" name="id" value="${Owner.id}"><br>
	PW : <input type="password" name="pw" value="${Owner.pw}"><br>
	<font color="red">${Warning}</font>	
	<font color="red">${Success}</font>
	<button>로그인하기</button>
	</form>

	<form action="moveSignIn">
	<button>회원가입</button>
	</form>
</body>