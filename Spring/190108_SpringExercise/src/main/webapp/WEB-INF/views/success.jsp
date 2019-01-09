<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>

	<c:if test="${sessionScope.member!=null}">
	<h2>로그인 성공</h2>
	<h3>${sessionScope.member}님 환영합니다!</h3>	
	<form action="logout">
		<input type="submit" value="LOGOUT">
	</form>
	</c:if>
</body>
</html>