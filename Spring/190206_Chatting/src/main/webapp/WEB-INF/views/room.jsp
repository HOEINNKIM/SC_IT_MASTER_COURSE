<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Room</title>
</head>
<body>

<table border="1">
<tr>
<td>방번호 : ${Room.roomSeq}</td>
<td>개설자 : ${Room.userId}</td>
<td>방제목 : ${Room.name}</td>
<td>개설일 : ${Room.inDate}</td>
</tr>
</table>

<form action="chat">
채팅 : <input type="text" name="message">
	<input type="hidden" name="roomSeq" value="${Room.roomSeq}">
<button>입력</button>
</form>

<form action="back">
<button>뒤로가기</button>
</form>
	
<table border="1">
<c:forEach var="Chat" items="${CList}">
<tr>
<td>${Chat.userId}님의 채팅 : ${Chat.message}</td>
<td>채팅 날짜 : ${Chat.inDate}</td>
</tr>
</c:forEach>
</table>


	
</body>
</html>