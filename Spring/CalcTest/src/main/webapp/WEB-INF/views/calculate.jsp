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
		  alert("����ִ� ���� �ֽ��ϴ�.");
		  return;
	  }else if(isNaN(one)||isNaN(two)){
		  alert("���ڰ��� �ֽ��ϴ�.");
		  return;
	  }
	  document.getElementById("logic").value=logic;
	  document.getElementById("myForm").submit();
	  
  }

</script>
</head>
<body onload="test()">

	<form id="myForm" action="calculateNum">
	ù��°�� : <input type="text" id="numOne" name="numOne" value="${result}"><font color="red">${warning}</font><br>
	�ι�°�� : <input type="text" id="numTwo" name="numTwo"><br>
	<input type="hidden" id="logic" name="logic">
	<button type="button" onclick="submitForm('plus')">+</button>
	<button type="button" onclick="submitForm('minus')">-</button>
	<button type="button" onclick="submitForm('times')">*</button>
	<button type="button" onclick="submitForm('divide')">/</button>
	<br>
	</form>

</body>
</html>