<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>상세보기</title>
</head>
<body>

<table>
	<tr><td>제목 : </td>
	<td>${board.title}</td>
	</tr>
	<tr><td>내용 : </td>
	<td>${board.content}</td></tr>
	<tr><td>첨부파일</td>
	<td><a href="download?boardSeq=${board.boardSeq}">${board.fileList[0].orgname}</a>
	</td>
	</tr>


</table>
</body>
</html>