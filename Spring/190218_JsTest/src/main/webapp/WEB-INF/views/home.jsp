<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="resources/JQuery.js">
	</script>

</head>

 <script>
/*    	window.onload=function(){
		var button = document.getElementById("button");
		button.addEventListener("click", function(){
			
			var content = document.getElementById("content").value;
			
			document.getElementById("header").innerHTML=content;
		
			document.getElementById("content").value = "";

		})		
	} */	//javascript 

	
/* 	$(function(){
		
		$("#button").on("click", function(){
			var content = $("#content").val();

			$("#header").html("content");
			
			$("#content").val("");
		});
		
	}); */	//JQuery

	$(function(){
		$("h1").on("click",function(event){
/* 			var target = $(event.target);
			alert(target.html()); */

		})
	})
	
</script> 
<body>

	<h1 id="header1">111</h1>
	<h1 id="header2">222</h1>
	<h1 id="header3">333</h1>
	<input type="text" id="content">
	<button id="button">TEST</button>



</body>
</html>