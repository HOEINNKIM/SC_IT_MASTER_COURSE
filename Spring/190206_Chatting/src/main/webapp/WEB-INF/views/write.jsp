<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Make Room</title>
</head>
<body>

	<form action="writeRoom">
	<input type="hidden" name="userId" value="${sessionScope.loginId}">	
	채팅방 제목 : <input type="text" name="name">
	<button>채팅방 만들기</button>
	</form>

</body>
</html>
