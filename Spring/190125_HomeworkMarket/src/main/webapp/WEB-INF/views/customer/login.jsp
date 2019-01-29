<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<form action="loginCustomer">
	ID : <input type="text" name="customerId" value="${customer.customerId}">
	PW : <input type="text" name="customerPw">	
	<button>로그인</button>
	</form>
	${warning}
</body>
</html>