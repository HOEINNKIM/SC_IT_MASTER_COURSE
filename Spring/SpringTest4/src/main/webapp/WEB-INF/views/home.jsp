<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
<script>

function function1(){
	var calc = document.getElementbyId("1").value;
	alert(calc);

	if(calc == "*"){
		document.myForm.hidden.value = "*";
		alert(document.myForm.hidden.value);
	} else if(calc == "+"){
		document.myForm.hidden.value = "+";
		
	} else if(calc == "-"){
		document.myForm.hidden.value = "-";
		
	} else if(calc == "/"){
		document.myForm.hidden.value = "/";		
	}
}


</script>


</head>
<body>

	<form action ="go2" name="myForm">
	첫번째 수 <input type="text" name="first"><br>
	두번째 수 <input type="text" name="second"><br>
	<input type="hidden" name = "hidden">
	<button onClick = "function1()" id = "1" name = "clicked" value ="*">*</button><br>
	<button onClick = "function1()" id = "1" name = "clicked" value ="+">+</button><br>
	<button onClick = "function1()" id = "1"  name = "clicked" value ="-">-</button><br>
	<button onClick = "function1()" id = "1"  name = "clicked" value ="/">/</button><br>
	</form>

</body>
</html>
