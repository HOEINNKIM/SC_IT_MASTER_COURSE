<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Administrator</title>
</head>
<body>
	<h1>관리자 로그인</h1>
	
	<form action="loginAdmin" method="post">
	ID : <input type="text" name = "adminId" value="${admin.adminId}"><font color="red">${warning}</font><br>
	PW : <input type="text" name = "adminPw">
	<button>관리자 로그인</button>
	</form>
	
</body>
</html>