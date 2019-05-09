<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="resources/JQuery.js"></script>	
	<script>

		$(function(){

			var persons = [];
			
			$("#button").on("click", function(){
				var name = $("#name").val();
				var score = $("#score").val();
				var person = {	
						name:name,
						score:score
					};
				persons.push(person);
				listPerson();
			}); 
			
			$("#del").on("click", function(){
				var deleteNum =	Number($("#delNum").val());
				deletePerson(deleteNum - 1);
			});

		
		function listPerson(){
			var content="";
			var sum = 0;
			var avg = 0;
						
			$.each(persons, function(index, item){
				
				content+="NAME : " + item.name + ", SCORE : " + item.score + "<br>";
				sum += Number(item.score);	

			});
			
			content+="<hr>";
			if(isNaN(sum/persons.length)){
				content+="SUM : " + sum + ", AVG : 0";						
			} else {				
			content+="SUM : " + sum + ", AVG : " + (sum/persons.length);		
			}

			$("#list").html(content);	
		}		
		
		function deletePerson(delNum){
			
			persons.splice(delNum, 1);
			listPerson();			
		}
						
	});
	
	</script>
</head>
<body>

	Name:	<input type="text" id="name">
	SCORE:	<input type="text" id="score">
	<button id="button">Register</button>
	<div id="list">
	
	</div>
	<input type="text" id="delNum" placeholder="Delete Line">
	<button id="del">Splice</button>
</body>
</html>
