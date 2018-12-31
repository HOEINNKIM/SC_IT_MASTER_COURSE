<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<form action ="go">
	첫번째 수 <input type="text" name="first"><br>
	두번째 수 <input type="text" name="second"><br>
	<button name = "clicked" value ="*">*</button><br>
	<button name = "clicked" value ="+">+</button><br>
	<button name = "clicked" value ="-">-</button><br>
	<button name = "clicked" value ="/">/</button><br>
	</form>

</body>
</html>
