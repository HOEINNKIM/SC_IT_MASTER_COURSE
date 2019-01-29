<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>

	<table border="1">
	<c:forEach var="product" items="${Product}">
	<tr>
	<td>
	<form action="purchase" method="post">
	상품 번호 : <input type="text" name="productSeq" value="${product.productSeq}"><br>
	상품명 : <input type="text" name="name" value="${product.name}"><br> 
	수량 : <input type="text" name="quantity" value="${product.quantity}"><br>
	가격 : <input type="text" name="price" value="${product.price}"><br>
	설명 : <input type="text" name="comments" value="${product.comments}"><br>
	수정 날짜 : <input type="text" name="comments" value="${product.inDate}"><br>
	수량 : <input type="text" name="buy">
	<button>구매하기</button>
	</form>
	</td>	
	</tr>
	</c:forEach>
	</table>

</body>
</html>