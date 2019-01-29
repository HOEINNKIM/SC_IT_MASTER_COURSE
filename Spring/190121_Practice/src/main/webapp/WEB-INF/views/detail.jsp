<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>

	제목 : <h3>${board.title}</h3><br>
	내용 : <h3>${board.content}</h3><br>
<%-- 	첨부파일 : <a href="download?boardSeq=${board.boardSeq}">${board.fileList[0].orgname}</a>
 --%>
 	<form action="back">
 		<input type="submit" value = "뒤로가기">
 	</form>
 
 
 	<form action="updateWrite" method="post">
 		<input type="submit" value = "수정하기">
 		<input type="hidden" name="title" value="${board.title}">
 		<input type="hidden" name="content" value="${board.content}">
 		<input type="hidden" name="boardSeq" value="${board.boardSeq}"> 		
 	</form>
 	
 	<form action="deleteWrite" method="post">
 		<input type="hidden" name="boardSeq" value="${board.boardSeq}">
 		<input type="submit" value = "삭제하기">
 	</form>
 	
 	<form action="insertComment">
 		댓글 : <input type="text" name="comments">
 		<input type="hidden" name="boardSeq" value="${board.boardSeq}">
 		<button>댓글 달기</button>
 	</form>
 	
 	<br>

	<table> 	
 		<c:forEach var="comment" items="${Comment}">
			<tr>
				<td>작성자 : ${comment.id}</td>
				<td>내용 : ${comment.comments}</td>
				<td>날짜 : ${comment.inDate}</td>	
			</tr>
		</c:forEach>
 	</table>
 	
 
</body>
</html>