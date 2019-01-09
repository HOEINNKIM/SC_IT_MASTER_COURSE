<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<form action = "insertMember" method="post">
		ID : <input type="text" name="id"><br>
		<font color="red">${warning}</font><br>
		PW : <input type="text" name="pw"><br>
		<button>Login</button>
	</form>


</body>
</html>
