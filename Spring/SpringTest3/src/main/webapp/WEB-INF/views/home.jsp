<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<script>

		function func(){
			var gotOne = document.getElementById("first").value;
			var gotTwo = document.getElementById("second").value;
			
			if(gotOne == "" || gotTwo == ""){
				alert("빈칸은 허용하지 않습니다.");
				return;
			} else if(isNaN(gotOne)||isNaN(gotTwo)){
				alert("문자열은 허용하지 않습니다.");
				return;
			} else{
				document.getElementById("go").submit();
				return;
			}
			
		}
	
	
	</script>
</head>
<body>

<!-- 버튼의 type="button"을 설정할 경우는 자동으로 서브밋을 하지 않는다. --> 
<!-- java스크립트를 get방식으로 하는 경우, 변수의 값을 지우면 400에러가 발생한다 -> 스크립트만의 유효성 검사는 기본 -->
	<form action ="go" id="go">
	첫번째 수 <input type="text" name="first" id="first" value="${result}"><br>
	두번째 수 <input type="text" name="second" id="second"><br>
	<button type="button" onclick="func()" id="clicked" name = "clicked" value ="*">*</button><br>
	<button type="button" onclick="func()" id="clicked" name = "clicked" value ="+">+</button><br>
	<button type="button" onclick="func()" id="clicked" name = "clicked" value ="-">-</button><br>
	<button type="button" onclick="func()" id="clicked" name = "clicked" value ="/">/</button><br>

<!-- 
	<button type="button" onclick="func()" id="clicked" name = "clicked" value ="*">*</button><br>
	<button type="button" onclick="func()" id="clicked" name = "clicked" value ="+">+</button><br>
	<button type="button" onclick="func()" id="clicked" name = "clicked" value ="-">-</button><br>
	<button type="button" onclick="func()" id="clicked" name = "clicked" value ="/">/</button><br>

 -->
	</form>

</body>
</html>
