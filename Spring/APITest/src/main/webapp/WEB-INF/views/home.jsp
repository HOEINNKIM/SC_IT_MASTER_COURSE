<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<html>
<head>
	<title>Home</title>
</head>
<script>
 function testFunc(){
	 
	 $.get("http://tour.chungnam.net/_prog/openapi/?func=festival").done(function (data) {
		    console.log(data);
		});
	 
	/*  $.ajax({
		   type:"GET",
		   url:"http://tour.chungnam.net/_prog/openapi/?func=festival",
		   headers: {"X-My-Custom-Header": "some value"},
		   data : "",
		   dataType : "xml",
		   success:function(object){
			   alert(object);
		   },
		   error: function(xhr,status,error){
		   }
		  });  */

 }

</script>
<body>
	<button onclick="testFunc()">TEST</button>
</body>
</html>
