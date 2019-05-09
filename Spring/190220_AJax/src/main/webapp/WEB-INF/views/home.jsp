<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="resources/JQuery.js">
	</script>

	<script>
	
	$(function(){

		$("#test").on("click",function(event){

			$.ajax({
				
				url:"ajaxTest",
				type:"get",
				data: {userId:"hong"},
				success:function(serverData){
					alert(serverData["a"]);
				}				

			});
		})
	});
	
	</script>

</head>
<body>

	<button id="test">TEST</button>

</body>
</html>