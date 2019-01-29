<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
	<table border="2">


	<c:if test="${sessionScope.customerId==null}">
	<tr>
	<td><a href="signUp">회원가입</a></td>	
	</tr>

	<tr>
	<td><a href="login">로그인</a></td>	
	</tr>
	</c:if>	

	<c:if test="${sessionScope.customerId!=null}">
	<tr>
	<td><a href="listProduct">상품보기</a></td>	
	</tr>
	<tr>
	<td><a href="purchasedItems">구매내역</a></td>	
	</tr>
	<tr>
	<td><a href="logout">로그아웃</a></td>	
	</tr>
	<tr>
	<td><font color="red">${customerId}님 환영합니다!</font></td>
	</tr>

	</c:if>	


	</table>
	
	
	
</body>
</html>