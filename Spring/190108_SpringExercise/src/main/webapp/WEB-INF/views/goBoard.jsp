<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판에 오신걸 환영합니다.</title>
</head>
<body>

	<form action="insertBoard" method="post">
	<table>
	<tr><td>제목 : <input type="text" name="boardTitle" value="${board.boardTitle}"></td></tr>
	<tr><td>내용 : <TextArea name="boardContent" rows="10" cols="23">${board.boardContent}</TextArea></td></tr>
	<input type=hidden name="boardSeq" value="${board.boardSeq}">	
	</table>
		<button>작성하기</button>
	</form>
</body>
</html>