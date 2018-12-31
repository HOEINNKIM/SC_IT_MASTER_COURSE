<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script>
  function submitForm(logic){
	  
	  document.getElementById("myForm").action=logic;
	  document.getElementById("myForm").submit();
	  
  }


</script>
</head>
<body>

	<form id="myForm">
	첫번째수 : <input type="text" name="numOne"><br>
	두번째수 : <input type="text" name="numTwo">
	<button type="button" onclick="submitForm('plus')">+</button>
	<button type="button" onclick="submitForm('minus')">-</button>
	<button type="button" onclick="submitForm('times')">*</button>
	<button type="button" onclick="submitForm('divide')">/</button>
	<br>
	</form>

</body>
</html>