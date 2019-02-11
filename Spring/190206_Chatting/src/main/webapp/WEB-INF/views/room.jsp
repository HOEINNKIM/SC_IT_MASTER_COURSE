<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<meta charset="UTF-8">
	<title>Room</title>
	<script>
	
	function ajaxTest(){
		$.ajax({
			/* data는 성공하고 받은 data로, json객체 */
			/* url은 액션 */			
			/* data : 클라이언트가 서버로 보내는 파라미터 */
			
			url : "selectChat",
			data : {roomSeq:${Room.roomSeq}},
			type : "get",
			success :  function(data){
/* 				alert(JSON.stringify(data)); */
/* 				alert(data[0].userId + " : " + data[0].message);*/
 				var content = "";

				for(var i = 0; i < data.length; i++){
					content+=data[i].userId + " : " + data[i].message + "<br>";
				}
				
				document.getElementById("content").innerHTML = content;
 	
			}
	 			
		});	
	}
	</script>


</head>
<body>

	<div id="content"></div>
	
<table border="1">
<tr>
<td>방번호 : ${Room.roomSeq}</td>
<td>개설자 : ${Room.userId}</td>
<td>방제목 : ${Room.name}</td>
<td>개설일 : ${Room.inDate}</td>
</tr>
</table>

<button onClick="ajaxTest()">짜잔</button>

<form action="chat">
채팅 : <input type="text" name="message">
	<input type="hidden" name="roomSeq" value="${Room.roomSeq}">
<button>입력</button>
</form>

<form action="back">
<button>뒤로가기</button>
</form>
	
<table border="1">
<c:forEach var="Chat" items="${CList}">
<tr>
<td>${Chat.userId}님의 채팅 : ${Chat.message}</td>
<td>채팅 날짜 : ${Chat.inDate}</td>
</tr>
</c:forEach>
</table>


	
</body>
</html>