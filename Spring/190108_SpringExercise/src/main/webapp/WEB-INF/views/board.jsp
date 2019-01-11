<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${Info}</h2>
		<table border="1">
			<tr>
				<td style="width:45%;">게시자</td>
				<td style="width:15%;">제목</td>
				<!-- <td style="width:15%;">글내용</td> -->				
			</tr>
				<c:forEach var="board" items="${boardList}">
					<tr>
						<td style="width:20%;">
						<a href="boardDetail?boardSeq=${board.boardSeq}">${board.id}</a>
						</td>
						<td style="width:50%;">${board.boardTitle}</td>
						<%-- <td style="width:15%;">${brdList.boardContent}</td> --%>
					</tr>								
			</c:forEach>
		</table>

</body>
</html>