<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
	<title>drawlines</title>
	<style>
	canvas {
		border: 5px solid magenta;
	}
	</style>
	
</head>
	<!-- Firebase App is always required and must be first -->
	<script src="https://www.gstatic.com/firebasejs/5.7.1/firebase-app.js"></script>
	
	<!-- Add additional services that you want to use -->
	<script src="https://www.gstatic.com/firebasejs/5.7.1/firebase-auth.js"></script>
	<script src="https://www.gstatic.com/firebasejs/5.7.1/firebase-database.js"></script>
	<script src="https://www.gstatic.com/firebasejs/5.7.1/firebase-firestore.js"></script>
	<script src="https://www.gstatic.com/firebasejs/5.7.1/firebase-messaging.js"></script>
	<script src="https://www.gstatic.com/firebasejs/5.7.1/firebase-functions.js"></script>
	
	<!-- Comment out (or don't include) services that you don't want to use -->
	<!-- <script src="https://www.gstatic.com/firebasejs/5.7.1/firebase-storage.js"></script> -->
	<script src="https://www.gstatic.com/firebasejs/5.8.5/firebase.js"></script>
	    <!-- Firebase App is always required and must be first -->
	
	<!-- 제이쿼리 사용 임포트 -->    
	<script src="resources/jquery-3.1.1.min.js"></script>

	<script>
	  // 파이어베이스 초기화 세팅
	  var config = {
	    apiKey: "AIzaSyDbP5rLbpe6JFedjvFxaI3gM2jm1REFrJ8",
	    authDomain: "web-crawling-6562b.firebaseapp.com",
	    databaseURL: "https://web-crawling-6562b.firebaseio.com",
	    projectId: "web-crawling-6562b",
	    storageBucket: "web-crawling-6562b.appspot.com",
	    messagingSenderId: "407695243177"
	  };

	  // Initialize the default app
	  var defaultApp = firebase.initializeApp(config);
	  
	  console.log(defaultApp.name);  // "[DEFAULT]"

	  // You can retrieve services via the defaultApp variable...
	  var defaultStorage = defaultApp.storage();
	  var defaultDatabase = defaultApp.database();

	  var userId = "k7h7i7";

	  function writeMindMap(mindObj) {
		  
		    firebase.database().ref('users/' + userId + '/' + mindObj.parent + '/' + mindObj.id).set({
		    
		    x: mindObj.x,
		    y: mindObj.y,
		    afterX:mindObj.afterX,
		    afterY:mindObj.afterY,
		    kind:mindObj.kind,
		    parent:mindObj.parent,
		    id:mindObj.id
		    
		    }); 
		    
	  };
	  
/* 	  var mindRef = firebase.database().ref('/users' + userId);
		mindRef.on('value', function(snapshot) {
			
		}); */
		
	  
	</script>
<body>
	<div>
		색상 : <select id="selcolor">
			<option value="black">검정</option>
			<option value="red">빨강</option>
			<option value="green">초록</option>
			<option value="blue">파랑</option>
			<option value="magenta">분홍</option>
		</select> 굵기 : <select id="selwidth">
			<option value="1">얇게</option>
			<option value="3">중간</option>
			<option value="5">굵게</option>
		</select> <input type="button" id="clear" value="모두 지움">
	</div>

	<canvas id="canvas" width="600" height="400">
		이 브라우저는 캔버스를 지원하지 않습니다.
	</canvas>
	<script>
		var canvas;
		var ctx;
		var sx, sy; // 드래그 시작점
		var ex, ey; // 드래그 끝점
		var drawing; // 그리고 있는 중인가
		var backup;
		
		///////////////
		var area = Math.PI * 2;
		var count = 1;
		var count2 = 101;
		var rect = {
			width: 50,
			height: 50
		};
		/////////////

		//선택된 객체를 저장
 		var selectedObj;

		///////////////
		var savedArray=[];

		///////////////
		
		
		
		///////////////
		
		window.onload = function() {
			canvas = document.getElementById("canvas");
			if (canvas == null || canvas.getContext == null)
				return;
			ctx = canvas.getContext("2d");

			canvas.onmousedown = function(e) {
				e.preventDefault();
				
				// 시작 좌표 구함
				sx = canvasX(e.clientX);
				sy = canvasY(e.clientY);
				
				
				// 피타고라스로 가장 가까운 애를 구함
				pita(sx, sy);

				
				// 백업 뜨고 그리기 시작
				backup = ctx.getImageData(0, 0, canvas.width, canvas.height);
				drawing = true;

				/* alert("con : "+JSON.stringify(selectedObj)); */
			}

			canvas.onmousemove = function(e) {
				e.preventDefault();
				ex = canvasX(e.clientX);
				ey = canvasY(e.clientY);

				// 백업 복구하고 현재 선 그림
				if (drawing) {
					ctx.putImageData(backup, 0, 0);
					ctx.beginPath();
					ctx.moveTo(sx, sy);
					ctx.lineTo(ex, ey);
					ctx.stroke();
				}
			}

			canvas.onmouseup = function(e) {
				drawing = false;
				count++;
				
				//페어런트의 x, y값을 구해보자
				if(typeof(selectedObj)!='undefined'){
				alert('시작점 :\n' + 'sx :' + sx + 'sy :' + sy + '\n선택 된 부모값의 점 : \nx :' + selectedObj.id + ', y :' + selectedObj.y);					
				}
				
				
				var newObj={
						x:sx,
						y:sy,
						afterX:ex,
						afterY:ey,
						kind:'line',
						parent: typeof(selectedObj) == 'undefined'? 1 : selectedObj.id,
						id: count2++
					};

				savedArray.push(newObj);
				writeMindMap(newObj);
									
				var id = count2 - 1;
				var parentId = typeof(selectedObj) == 'undefined'? 1 : selectedObj.id;
				
				ctx.strokeRect(ex - (rect.width/2), ey - (rect.height/2), rect.width, rect.height);
				ctx.fillText('아이디 : ' + id, ex, ey);
				ctx.fillText('엄마 : ' + parentId, ex, ey + 10);
			}
			
			
			//피타고라스의 원리
			
			
			
			/* for(var i=0;i<savedArray.length;i++){
				
				if(savedArray[i].kind=='line'){
					sx = savedArray[i].x;
					sy = savedArray[i].y;
					
					// 백업 뜨고 그리기 시작
					 backup = ctx.getImageData(0, 0, canvas.width, canvas.height);
					drawing = true;
					drawing = false;
					ctx.fillText(count++, savedArray[i].afterX, savedArray[i].afterY);
					 
					ctx.beginPath();
					ctx.moveTo( savedArray[i].x, savedArray[i].y);
					ctx.lineTo(savedArray[i].afterX, savedArray[i].afterY);
					ctx.stroke();
				}
				
				
			}  */
		}

		var selcolor = document.getElementById("selcolor");
		selcolor.onchange = function(e) {
			ctx.strokeStyle = selcolor.value;
		}

		var selwidth = document.getElementById("selwidth");
		selwidth.onchange = function(e) {
			ctx.lineWidth = selwidth.value;
		}

		var btnclear = document.getElementById("clear");
		btnclear.onclick = function(e) {
			ctx.clearRect(0, 0, canvas.width, canvas.height);
		}

		function canvasX(clientX) {
			var bound = canvas.getBoundingClientRect();
			var bw = 5;
			return (clientX - bound.left - bw)
					* (canvas.width / (bound.width - bw * 2));
		}

		function canvasY(clientY) {
			var bound = canvas.getBoundingClientRect();
			var bw = 5;
			return (clientY - bound.top - bw)
					* (canvas.height / (bound.height - bw * 2));
		}
		
		function pita(cx, cy){
			
			var selectOne;
			var buf = 0;
			
			for(var i = 0; i < savedArray.length; i++){
				
			 	var calX = savedArray[i].afterX - cx;
			 	var calY = savedArray[i].afterY - cy;
			 	
			 	var pitagoras = (calX * calX) + (calY * calY);
			 	

			 	if(i==0){
			 		selectOne = savedArray[i];
			 		buf = pitagoras;
			 		continue;
			 	}

			 	if(pitagoras < buf){
			 		selectOne = savedArray[i];
			 	}
		 		
			};

			selectedObj = selectOne;			
		} 
		
	</script>
</body>
</html>


