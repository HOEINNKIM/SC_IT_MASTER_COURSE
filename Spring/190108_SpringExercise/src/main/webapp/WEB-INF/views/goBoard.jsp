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
		제목 : <input type="text" name="boardTitle">
		<br>
		내용 : <input type="text" name="boardContent">
		<br>
		<button>작성하기</button>
	</form>
</body>
</html>