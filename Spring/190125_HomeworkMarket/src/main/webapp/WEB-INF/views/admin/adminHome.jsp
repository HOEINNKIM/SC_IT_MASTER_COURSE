<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home</title>
</head>
<body>

	<table border="2">
		<c:if test="${sessionScope.adminId!=null}">
			<tr>
				<td><a href="manageProduct">상품관리</a></td>	
			</tr>
			<tr>
				<td><a href="manageCustomer">회원관리</a></td>	
			</tr>
		</c:if>	

	</table>



</body>
</html>