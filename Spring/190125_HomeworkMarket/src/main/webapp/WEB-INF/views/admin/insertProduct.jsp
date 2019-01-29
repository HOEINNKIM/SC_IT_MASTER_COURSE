<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ManageProduct</title>
</head>
<body>
	<form action="insertProduct" method="post">
		상품명 : <input type="text" name="name" value="${Product.name}"><br>
		수량 : <input type="text" name="quantity" value="${Product.quantity}"><br>
		가격 : <input type="text" name="price" value="${Product.price}"><br>
		설명 : <input type="text" name="comments" value="${Product.comments}"><br>
		<input type="hidden" name="productSeq" value="${Product.productSeq}">
		<button>상품 등록</button>
		<font color="red">${warning}</font>
	</form>


</body>
</html>