<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Todo</title>
</head>
<body>

<h2>할일 등록</h2>

<form action = "createTodo" method="POST">
<h5>어떤 일인가요?</h5><br>
<input type="text" name="title" placeholder="swift로 공부하기(24자까지)"><br>

<h5>누가 할 일인가요?</h5><br>
<input type="text" name="name" placeholder="홍길동"><br>

<h5>우선순위를 선택하세요.</h5><br>
<input type="radio" name="seq" value="1"> 1순위<br>
<input type="radio" name="seq" value="2"> 2순위<br>
<input type="radio" name="seq" value="3"> 3순위<br>

<button>TODO 등록</button>
</form>

</body>
</html>