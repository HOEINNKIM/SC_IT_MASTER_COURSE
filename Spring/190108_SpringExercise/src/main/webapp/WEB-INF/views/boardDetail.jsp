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


	<form action = "insertComment" method="post">
	<input type="text" name="comments">
	<!--<input type="hidden" name = "id" value="${sessionScope.member.id}"> -->
	<input type="hidden" name = "boardSeq" value="${board.boardSeq}">
	<!--<input type=hidden name="commentSeq" value=""> -->
	
	<button>댓글달기</button>
	</form>
	
	</c:if>	

	<c:forEach var="comment" items="${commentList}">
		<tr>
			<td>${comment.id} : </td>
			<td>${comment.comments} </td>
			<td>${comment.inDate}</td>
			<td>

			<!-- 댓글의 기본키로 댓글을 삭제 하기 위해,
			삭제 후에도 이 페이지에 남기 위해
			두 값을 전달한다. -->
			<!-- 헤더는 겟, 바디는 포스트
			http패킷에 대해서 찾아볼 것 -->
			<c:if test="${sessionScope.member.id==comment.id}">
			<c:if test="${comment.comments!='(삭제된 덧글입니다.)'}">
			<form action="deleteComment" method="post">
			<input type="hidden" name="commentSeq" value="${comment.commentSeq}">
			<input type="hidden" name="boardSeq" value="${board.boardSeq}">
			<input type="submit" value="삭제">
			</form>			
			</c:if>
			</c:if>
			</td>
			
			<br>
		</tr>	
	</c:forEach>
	
	

</body>
</html>