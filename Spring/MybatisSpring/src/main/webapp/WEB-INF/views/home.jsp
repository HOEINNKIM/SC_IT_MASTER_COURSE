<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<form action="insertMember" method="post">
	ID : <input type="text" name="id"><br>
	PW : <input type="text" name="pw"><br>
	<input type="submit" value="JOIN">
	</form>

</body>
</html>
