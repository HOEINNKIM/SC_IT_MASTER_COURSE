<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action ="insertMember" method="post">
		ID : <input type="text" name = "id" value="${member.id}"><font color="red">${warning}</font><br>
		PW : <input type="password" name = "pw" value="${member.pw}"><br>
		NAME : <input type="text" name = "name" value="${member.name}"><br>
		PHONE : <input type="text" name = "phone" value="${member.phone}"><br>
		EMAIL : <input type="text" name = "email" value="${member.email}"><br>
		BIRTHDATE : <input type="text" name = "birthDate" value="${member.birthDate}"><br>
		<button>SignIn</button>
	</form>

</body>
</html>