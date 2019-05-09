<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Home</title>
</head>
<script type="text/javascript">

	/* 	function selectNews(){
	
	 $.ajax({
	
	 url : "selectNews",
	 data : "",
	 type : "get",
	
	 })
	
	
	
	 } */
</script>
<body>
	<h1>Hello world!</h1>
	
	<form action="selectNews">
		키워드 : <input type="text" name="key_word"><br>
		보고싶은 페이지(1~30) : <input type="text" name="page"><br>
		<input type="submit" value="크롤링">
	</form>

</body>
</html>
