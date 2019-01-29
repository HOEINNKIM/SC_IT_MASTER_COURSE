<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>컨텐츠 작성</title>
</head>
<body>

	<form action="upload" enctype="multipart/form-data" method="post">	
		<input type="hidden" name="boardSeq" value="${board.boardSeq}">
		제목 : <input type="text" name="title" value="${board.title}">
		내용 : <input type="text" name="content" value="${board.content}">
		첨부파일 : <input type="file" name="files"><br>
		<button>작성완료</button>
	</form>
	
</body>
</html>