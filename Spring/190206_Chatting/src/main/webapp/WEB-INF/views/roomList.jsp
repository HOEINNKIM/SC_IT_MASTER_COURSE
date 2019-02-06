<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>RoomList</title>
</head>
<body>

<table border="1">
	<c:forEach var="room" items="${RList}">
<tr>
<td>방번호 : ${room.roomSeq}</td>
<td>개설자 : ${room.userId}</td>
<td>방제목 : <a href="joinRoom?roomSeq=${room.roomSeq}">${room.name}</a></td>
<td>개설일 : ${room.inDate}</td>
</tr>
	</c:forEach>
</table>

<form action="makeRoom">
<button>채팅방 만들기</button>
</form>
	
</body>
</html>
