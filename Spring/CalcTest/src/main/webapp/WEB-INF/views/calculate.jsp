<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script>
  function submitForm(logic){
	  
	  
	  var one=document.getElementById("numOne").value; 
	  var two=document.getElementById("numTwo").value; 
	  
	  
	  if(one==""||two==""){
		  alert("비어있는 값이 있습니다.");
		  return;
	  }else if(isNaN(one)||isNaN(two)){
		  alert("문자값이 있습니다.");
		  return;
	  }
	  document.getElementById("logic").value=logic;
	  document.getElementById("myForm").submit();
	  
  }

</script>
</head>
<body onload="test()">

	<form id="myForm" action="calculateNum">
	첫번째수 : <input type="text" id="numOne" name="numOne" value="${result}"><font color="red">${warning}</font><br>
	두번째수 : <input type="text" id="numTwo" name="numTwo"><br>
	<input type="hidden" id="logic" name="logic">
	<button type="button" onclick="submitForm('plus')">+</button>
	<button type="button" onclick="submitForm('minus')">-</button>
	<button type="button" onclick="submitForm('times')">*</button>
	<button type="button" onclick="submitForm('divide')">/</button>
	<br>
	</form>

</body>
</html>