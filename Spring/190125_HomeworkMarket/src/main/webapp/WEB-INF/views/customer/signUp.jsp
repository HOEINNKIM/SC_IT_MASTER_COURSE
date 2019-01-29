<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signUp</title>
</head>
<body>
	
	<form action = "insertCustomer" method="post">
	ID : <input type="text" name="customerId" value="${customer.customerId}"><br>
	PW : <input type="text" name="customerPw" value="${customer.customerPw}"><br>
	NAME : <input type="text" name="name" value="${customer.name}"><br>
	PHONE : <input type="text" name="phone" value="${customer.phone}"><br>
	BIRTHDATE : <input type="text" name="birthDate" value="${customer.birthDate}"><br>
	ADDRESS : <input type="text" name="address" value="${customer.address}"><br>
	<button>회원가입</button>
	</form>
	${warning}

</body>
</html>