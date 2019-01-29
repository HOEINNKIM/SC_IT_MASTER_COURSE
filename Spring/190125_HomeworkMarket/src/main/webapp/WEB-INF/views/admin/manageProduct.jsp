<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ManageProduct</title>
<script>

	function submitForm(page){
		document.getElementById("page").value = page;
		document.getElementById("myForm").submit();
	}
	
</script>
</head>
<body>


	<table border="1">
	<c:forEach var="product" items="${Product}">
	<tr>
	<td>상품 번호 : ${product.productSeq}<br>
	상품명 : ${product.name}<br> 
	수량 : <a href="update?productSeq=${product.productSeq}&name=${product.name}&quantity=${product.quantity}&price=${product.quantity}&comments=${product.comments}">${product.quantity}</a><br>
	가격 : ${product.price}<br>
	설명 : ${product.comments}<br>
	수정 날짜 : ${product.inDate}</td>
	</tr>
	</c:forEach>
	</table>


	<form action="insert">
		<button>상품 등록</button>
	</form>


	<a href="javascript:submitForm(${navi.currentPage - 1})">이전 페이지</a>
	
	
	<c:forEach var="page" begin="${navi.startPageGroup}" end="${navi.endPageGroup}">

	<c:if test="${navi.currentPage==page}">
	&nbsp;<a href="javascript:submitForm(${page})"><b>${page}</b></a>&nbsp;
	</c:if>

	<c:if test="${navi.currentPage!=page}">
	&nbsp;<a href="javascript:submitForm(${page})">${page}</a>&nbsp;
	</c:if>

	</c:forEach>

	<a href="javascript:submitForm(${navi.currentPage + 1})">다음 페이지</a>

	<form action="selectProduct" id="myForm">
		<input type="hidden" id="page" name="page" value="${page}">
	검색 : <input type="text" name="search" value="${search}">
		<button>검색</button>
	</form>
	
</body>
</html>