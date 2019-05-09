<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

<title>Home</title>

<style>
	#can{
		width: 600;
		height: 400;
		border: 5px solid black;
		
	}

</style>

<!-- 제이쿼리 사용 임포트 -->
<script src="resources/jquery-3.1.1.min.js"></script>
<script>
		
	$(function(){
		var	canvas = document.getElementById("can");
		alert(canvas);
		$('#can').on('mousedown', function(e){
		 			alert(canvas.getBoundingClientRect()); 
			
		})
		
	});

	function canvasX(clientX) {

		var bound = canvas.getBoundingClientRect();
		var bw = 5;
		return (clientX - bound.left - bw)
				* (canvas.width / (bound.width - bw * 2));
	}

	function canvasY(clientY) {
		var bound = canvas.getBoundingClientRect();
		var bw = 5;
		return (clientY - bound.top - bw)
				* (canvas.height / (bound.height - bw * 2));
	}

</script>

</head>
<body>

	<canvas id='can'></canvas>

</body>
</html>
