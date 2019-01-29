<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ManageCustomer</title>
</head>
<body>
	<table border="1">
	<c:forEach var="customer" items="${CList}">	
	<tr>
	<td>아이디 : ${customer.customerId} 이름 : ${customer.name} 번호 : ${customer.phone},${customer.birthDate},${customer.address},${customer.inDate}</td>	
	</tr>
	</c:forEach>
	</table>
	
	<form action="adminBack">
		<button>뒤로가기</button>
	</form>
	
</body>
</html>