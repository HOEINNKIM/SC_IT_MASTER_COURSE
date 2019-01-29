<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Board</title>
	<script>
		function submitForm(page){
			document.getElementById("page").value = page;
			document.getElementById("myForm").submit();
		}
	</script>
</head>
<body>
	<c:forEach var="board" items="${board}">
	-------------------------------------------------------------
	제목 : <a href="detail?boardSeq=${board.boardSeq}">${board.title}</a><br>
	내용 : ${board.content}<br>
	게시일 : ${board.inDate}<br>
	-------------------------------------------------------------	
	</c:forEach>

	<!-- 게시글 작성	폼 -->
	<form action="write">
		<input type="submit" value="게시글쓰기">
	</form>
	<a href="javascript:submitForm(${navi.currentPage - 1})">이전</a>

	<c:forEach var="page" begin="${navi.startPageGroup}" end="${navi.endPageGroup}">

	<c:if test="${navi.currentPage==page}">
	&nbsp;<a href="selectBoard?page=${page}"><b>${page}</b></a>&nbsp;
	</c:if>

	<c:if test="${navi.currentPage!=page}">
	&nbsp;<a href="javascript:submitForm(${page})">${page}</a>&nbsp;
	</c:if>
	
	</c:forEach>


	<a href="javascript:submitForm(${navi.currentPage + 1})">다음</a>
	
 	<form action="selectBoard" id="myForm">
 	<input type="hidden" name = "page" id="page" value="1">
 	<input type="text" name = "search" id="search">
 	<button>검색</button>
 	</form>
	
</body>
</html>