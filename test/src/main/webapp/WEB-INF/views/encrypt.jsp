<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test2</title>
<style type="text/css">
.form{
	text-align: center;
	width: 100%;
	height: 100%;
}
div{
	display: inline-block;
}

#btn{
	padding-left: 10px;
	padding-right: 10px;
	
}
#div1 input{
	width: 200px;
	height: 200px;
	text-align: center;
}
#div3 input{
	width: 200px;
	height: 200px;
	text-align: center;
}
</style>
<script type="text/javascript">
	var message = '${msg}'; 
	var returnUrl = '${url}'; 
	alert(mag); 
	document.location.href = url; 
</script>
</head>
<body>
<div class="form">
	<form name="frm1" method="post">
		<p>key <input type="text" placeholder="key" name="key"></p>
		<div id="div1">
			<p>input</p>
			<input type="text" value="${key }" readonly="readonly">
		</div>
		
		<div id="btn">
			<p><input type="submit" onclick="this.form.action='encrypt';" value="암호화"></p>
			<input type="submit" onclick="this.form.action='decrypt';" value="복호화" >
		</div>
		
		<div id="div3">
			<p>output</p>
			<input type="text" value="${encrypt}" readonly="readonly">
			
			
		</div>
	</form>
</div>
</body>

</html>