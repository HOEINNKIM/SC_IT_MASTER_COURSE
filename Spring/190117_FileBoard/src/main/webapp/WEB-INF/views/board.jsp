<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>게시판</title>
	<script>
		function submitForm(page){
			document.getElementById("page").value = page;
			document.getElementById("myForm").submit();
		}
	</script>
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

	<a href="javascript:submitForm(${navi.currentPage - 1})">이전페이지</a>	
	<%-- <a href="board?page=${navi.currentPage - 1}">이전페이지</a>--%>
	<c:forEach var="page" begin="${navi.startPageGroup}" end="${navi.endPageGroup}">

	<c:if test="${navi.currentPage==page}">
	&nbsp;<a href="board?page=${page}"><b>${page}</b></a>&nbsp;
	</c:if>

	<c:if test="${navi.currentPage!=page}">
	&nbsp;<a href="javascript:submitForm(${page})">${page}</a>&nbsp;
	</c:if>

	</c:forEach>

	<%-- <a href="board?page=${navi.currentPage + 1}">다음페이지</a> --%>
	<a href="javascript:submitForm(${navi.currentPage + 1})">다음페이지</a>
	
	<!-- 19.01.23 검색창 만들기 -->
	<form action="board" id="myForm">
	<%-- <input type="hidden" name = "page" id= "page" value="${navi.currentPage}"> --%>
		<input type="hidden" name = "page" id= "page" value="1">
	검색 : <input type="text" name = "search" id="search">
	<button>검색</button>
	</form>

</body>
</html>