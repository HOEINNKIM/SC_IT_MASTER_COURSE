<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>글쓰기</title>
</head>
<body>

	<form action="writeContent" enctype="multipart/form-data" method="post">
	 <table>
	 <tr><td>제목 :</td>
	 <td><input type="text" name="title"></td></tr>
	 <tr><td>내용 :</td>
	 <td style="width:300px;height:500px;"><textarea name="content" rows="20" cols="20"></textarea></td></tr>
	 <tr><td>첨부파일 : </td>
	 <td><input type="file" name="file"></td></tr>
	 <input type="submit" value="작성하기">
	 
	</table>
	
	</form>
	


</body>
</html>


<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>글쓰기</title>
</head>
<body>

	<form action ="writeContent" enctype="multipart/form-data" method="post">
		<table>
		<tr>
		<td>제목 : </td>
		<td><input type="text" name="title"></td></tr>	
		<td>내용 : </td>
		<td style="width:300px;height:500px;"><textarea name = "content" rows="20" clos="20"></textarea></td></tr>	
		<td>첨부파일 : </td>
		<td><input type="file" name="files"></td></tr>	
		<input type="submit" value="작성하기"> 
		
		</table>
	
	</form>

</body>
</html> --%>