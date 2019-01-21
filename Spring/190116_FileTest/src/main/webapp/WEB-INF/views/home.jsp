<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<form action="fileUpload" enctype="multipart/form-data" method="post">
	<input type="file" name="uploadFile">
	<input type="submit" value="UPLOAD">
	</form>

	<a href="fileDownLoad?fileName=${fileName}">${fileName}</a>

</body>
</html>