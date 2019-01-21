<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>게시판</title>
</head>
<body>
	
	<form action="boardWrite">
	<input type="submit" value="글쓰기">	
	</form>
	
	<table>
	<c:forEach var="board" items="${bList}">
	<tr>
	<td style="width:40%;">
	<a href="boardDetail?boardSeq=${board.boardSeq}">${board.title}</a>
	</td>
	<td style="width:20%;">${board.id}</td>
	<td>${board.indate}</td>
	</tr>
	</c:forEach>
	</table>

	<a href="board?page=${navi.currentPage - 1}">이전페이지</a>

	<c:forEach var="page" begin="${navi.startPageGroup}" end="${navi.endPageGroup}">

	<c:if test="${navi.currentPage==page}">
	&nbsp;<a href="board?page=${page}"><b>${page}</b></a>&nbsp;
	</c:if>

	<c:if test="${navi.currentPage!=page}">
	&nbsp;<a href="board?page=${page}">${page}</a>&nbsp;
	</c:if>

	</c:forEach>

	<a href="board?page=${navi.currentPage + 1}">다음페이지</a>

</body>
</html>
