<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>TODO</title>
	<style>
	h4{
		font-size: 20px;
		line-height:50px;
		text-align: center;
	
	}
	.title{
		width:400px;
		height: 50px;
		line-height: 50px;
		font-size: 30px;
		
		vertical-align: middle;
		text-align: center;
		background: green;
		
	}
	.title, .todoClass{
		margin: 20px;
	
	}
	#todo, #doing, #done{
		margin: 5px;
	}
	.todoClass {
		background: lightgreen; 
		width: 400px;
		height: 130px;
		position: relative;
	}
	#todo{
		width: 400px;
		float: left;
	}
	#doing{
		width: 400px;
		float: left;
	}
	#done{
		width: 400px;	
		float: left;
	}
	.info{
		float: left;
	}
	.actButton{
		float: left;
		position: absolute; bottom: 0; right: 0;
	}
	</style>
</head>
<body>
	<form action="create">
	<button>TODO 추가하기</button>
	</form>

	<div id="entireTodo">
		<div id="todo">
			<div class="title">TODO</div>
				<c:forEach var="todoList" items="${todo}">
					<div class="todoClass">
						<div class="info">
							<h4>${todoList.title}</h4>
							<h6>등록날짜 : ${todoList.regdate}, ${todoList.name}, 우선순위 ${todoList.seq}</h6>
						</div>
						<div class="actButton">
							<form action="moveTodo" method="POST">
							<input type="hidden" name="id" value="${todoList.id}">
							<button>→</button>
							</form>
						</div>
					</div>
				</c:forEach>
		</div>

		<div id="doing">
			<div class="title">DOING</div>
				<c:forEach var="doingList" items="${doing}">
					<div class="todoClass">				
						<div class="info">
							<h4>${doingList.title}</h4>
							<h6>등록날짜 : ${doingList.regdate}, ${doingList.name}, 우선순위 ${doingList.seq}</h6>
						</div>
						<div class="actButton">
							<form action="moveDoing" method="POST">
								<input type="hidden" name="id" value="${doingList.id}">
								<button>→</button>
							</form>
						</div>
					</div> 
				</c:forEach>				
		</div>

		<div id="done">
			<div class="title">DONE</div>
				<c:forEach var="doneList" items="${done}">
					<div class="todoClass">
						<div class="info">
							<h4>${doneList.title}</h4>
							<h6>등록날짜 : ${doneList.regdate}, ${doneList.name}, 우선순위 ${doneList.seq}</h6>
						</div>
						<div class="actButton">
							<form action="deleteDone" method="POST">
								<input type="hidden" name="id" value="${doneList.id}">
								<button>→</button>
							</form>
						</div>
					</div>
				</c:forEach>
		</div>
	</div>

</body>
</html>
