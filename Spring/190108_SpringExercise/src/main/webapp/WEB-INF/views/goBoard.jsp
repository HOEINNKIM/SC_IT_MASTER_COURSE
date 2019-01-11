<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판에 오신걸 환영합니다.</title>
</head>
<body>


	<!-- 인서드와 업데이트를 수행할 때
	폼의 액션을 가지고 c의 if문을 사용하여 action과 메서드를 바꿔 설정한 후 아래 내용은 그대로 쓰면 된다.-->
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