<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<style>
	td {		
		text-align: "right";
	}
	</style>
	<script src="resources/JQuery.js">
	</script>
	<script>
	var result = "";
	var color = "";
	
	$(function(){
	
		$("button").on("click", function(){
			result = $("#content").val();
			color = "red";
			var a = 0;
		});

		
		$("td").on("click", function(event){
			var target = $(event.target);
			$(event.target).html;
			
			target.html(result);
			target.css("background-color", color);
			result="";
			color="white";
			$("#content").val("");
		});		
		
		$("td").on("mouseenter", function(event){
			var target = $(event.target);
			//change the style of css by jquery 
			target.css("background-color","yellow");
		});	
	});
	
	//javascript
	 window.onload = function(event){
		var button = document.getElementById("button");
		button.addEventListener("click", function(){
			content = document.getElementById("content").value;
			document.getElementById("content").value;
			
		})
		
		var tds = document.querySelectorAll("td");
		for(var i = 0; i <tds.length; i++){
			tds[i].addEventListener("click", function(event){
				if(event.target.innerHTML=""){
					event.target.innerHTML = content;
				} else{
					event.target.innerHTML="";
				}
			})
			
			tds[i].addEventListener("mouseenter", function(event){
				event.target.style.backgroundColor="yellow";
			})
			
			tds[i].addEventListener("mouseleave", function(event){
				
				event.target.style.backgroundColor="white";
			})
		}
	} 
	
	
	</script>
	
</head>
<body>
	<table border="1" width="500px" height="500">
	<tr>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
	</tr>
	<tr>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
	</tr>
	<tr>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
	</tr>
	<tr>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
	</tr>
	<tr>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
		<td width="100" height="100" align="center"></td>
	</tr>
	</table>
	<input type="text" id="content">
	<button id="button">TEST</button>
</body>
</html>
