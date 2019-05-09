<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
<style>

	#tit{
	position:relative;
	float: left;
	margin-left: 30px;
	}
	#sub{
	position:relative;
	float: left;
	margin-left: 50px;
	}
	
	#bod, #contents{
	position:relative;
	float: left;
	}	

</style>
<script src="resources/JQuery.js"></script>	
<script>

	
	
	
	$(function(){
		
		
		$.ajax({
			url: "boardList",
			type: "GET",
			data: "",
			success: function(Blist){
				output(Blist);

				$(".udtButton").on("click", udt);
				$(".updateButton").on("click", function(){
										
					
					var sno = $(this).attr('data-sno');
					var upAmount = document.getElementById(sno).value;

					$.ajax({
						url: "updateAmount",
						type: "POST",
						data: {
							amount: upAmount,
							accountSeq: sno
						},
						success: function(result){
							output(result);

						}
					});
					
				});
			}
		});
		

		
		$("#button").on("click", function(){

			var title = $("#title").val();
			var content = $("#content").val();
			var flag = $("#flag:checked").val();
			var amount = $("#amount").val();
			var eventdate = $("#eventdate").val();

			var AccountBook = {
					title : title,
					content : content,
					flag : flag,
					amount : amount,
					eventdate : eventdate
			}
			
			$.ajax({
				url: "insertBoard",
				type: "POST",
				data: AccountBook,
				success: function(Blist){
					output(Blist);
					
				}
			
			});
			
			
		});
		

	});
	
	
	function udt(){
		var sno = $(this).attr('data-sno');
		var trTitle = $("tr[data-sno=" +sno+ "] .title").html();
		var trContent = $("tr[data-sno=" +sno+ "] .content").html();
		var trFlag = $("tr[data-sno=" +sno+ "] .flag").html();
		var trAmount = $("tr[data-sno=" +sno+ "] .amount").html();
		var trEventDate = $("tr[data-sno=" +sno+ "] .eventdate").html();
		var trInDate = $("tr[data-sno=" +sno+ "] .indate").html();
		
		var flagVal = trFlag.substring("7", "9");
		
		if(flagVal=='지출'){
			$("#flag1").attr('checked','true');
		} else{
			$("#flag2").attr('checked','true');
		}
	}
	
	
	function output(Blist){
		
		var result = '<table>';

		$.each(Blist, function(index, item){
			result += '<tr class="list" data-sno="' + item.accountSeq +'">';
			result += '<td class="title"> 제목 : ' + item.title + '</td>'
			result += '<td class="content"> 내용 :' + item.content + '</td>'
			result += '<td class="flag"> 플래그 : ';
			
			if(item.flag=='1'){
				
				result += '수입';
			
			} else {
				
				result += '지출';
					
			}

			+ '</td>'
			result += '<td class="amount"> 금액 : ' + item.amount + '</td>';
			result += '<td class="eventdate"> 발생일자 :' + item.eventdate + '</td>';
			result += '<td class="indate"> 등록일자 : ' + item.indate + '</td>';
 			result += '<td><input class="udtButton" type="button" data-sno="'+item.accountSeq +'" value="수정하기"/></td>';

		})		
		
		result += '</table>';
		$("#contents").html(result);

	}
	

</script>

</head>
<body>
	<h5><font color="blue">${loginId} 님 환영합니다~!</font></h5>
	
	<div id="test">
	<form action="test">	
		날짜 <input type="date" name="dating">
		<button>아아</button>
	</form>
	</div>

	<div id="bod">
	<div id="tit">
	제목 : <input type="text" id="title" name="title"><br>
	내용 : <input type="text" id="content" name="content">
	</div>
	<div id="sub">
		수입 <input type="radio" id="flag1" name="flag" value="1">
		지출 <input type="radio" id="flag2" name="flag" value="2"><br>
	금액 : <input type="text" id="amount" name="amount">
	날짜 : <input type="text" id="eventdate" name="eventdate">
	<button id="button">등록하기</button>
	</div>	
	</div>
	
	
	<br>
	
	<div id="contents">
	</div>
	
</body>
</html>