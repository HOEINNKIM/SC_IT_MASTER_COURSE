<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signIn</title>
</head>
<body>

	<form action="signIn" method="POST">
	ID : <input type="text" name="id" value="${Owner.id}"><font color="red">${Warning}</font><br>
	PW : <input type="password" name="pw" value="${Owner.pw}"><br>
	<button>회원가입하기</button>
	</form>

</body>
</html>