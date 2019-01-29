<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Purchased Items</title>
</head>
<body>

	<font color="blue">${sessionScope.customerId}님의 구매 목록</font>
	<table border="1">
	<c:forEach var="sold" items="${Sold}">
	<tr>
	<td>
	<form action="cancelOrder" method="post">
	아이디 : <input type="text" name="productSeq" value="${sold.customerId}"><br>
	상품번호 : <input type="text" name="name" value="${sold.productSeq}"><br> 
	수량 : <input type="text" name="comments" value="${sold.quantity}"><br>
	구매일 : <input type="text" name="quantity" value="${sold.inDate}"><br>
	<input type="hidden" name="soldSeq" value="${sold.soldSeq}">
	<button>취소하기</button>
	</form>
	</td>	
	</tr>
	</c:forEach>
	</table>

</body>
</html>