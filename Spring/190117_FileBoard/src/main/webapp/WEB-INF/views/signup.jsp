<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
</head>
<body>

	<form action="insertMember" method="post">
		ID:<input type="text" name="id" value="${member.id}"><font color="red">${message}</font> 
		PW:<input type="password" name="pw" value="${member.pw}">
		이름:<input type="text" name="name" value="${member.name}">
		이메일:<input type="text" name="email" value="${member.email}">
		전화번호:<input type="text" name="phone" value="${member.phone}">
		생년월일:<input type="text" name="birthdate" value="${member.birthdate}">			
		<input type="submit" value="회원가입하기">
	</form>

</body>
</html>