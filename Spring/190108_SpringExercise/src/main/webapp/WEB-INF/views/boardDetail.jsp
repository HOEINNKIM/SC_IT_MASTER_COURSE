<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
</head>
<body>

	<table>
	<tr><td>제목 : </td><td>${board.boardTitle}</td></tr>
	<tr><td>게시자 : </td><td>${board.id}</td></tr>
	<tr><td>조회수 : </td><td>${board.hitCount}</td></tr>
	<tr><td>등록일 : </td><td>${board.inDate}</td></tr>
	</table>

	<hr>
	<div>${board.boardContent}</div>
	
	<form action = "boardList">
	<input type="submit" value="돌아가기">
	</form>
	
	<c:if test="${sessionScope.member.id==board.id}">
	<div style="inine-flex;">
	<form action = "deleteBoard">
	<input type="submit" value="삭제하기">
	<input type="hidden" name = "boardSeq" value="${board.boardSeq}">
	</form>
	
	
	<!-- 다음부터는 수정일도 적용될 수 있게 설정할 것 -->
	<form action = "updateBoard">
	<input type="submit" value="수정하기">
	<input type="hidden" name = "boardSeq" value="${board.boardSeq}">
	<input type="hidden" name = "boardTitle" value="${board.boardTitle}">
	<input type="hidden" name = "boardContent" value="${board.boardContent}">
	</form>
	</div>

	<form action = "insertComment">
	<input type="text" name="comments">
	<input type="hidden" name = "id" value="${sessionScope.member.id}">
	<input type="hidden" name = "boardSeq" value="${board.boardSeq}">
	<input type=hidden name="commentSeq" value="">
	
	<button>댓글달기</button>
	</form>
	
	</c:if>	

	

</body>
</html>