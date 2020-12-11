<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">

.form{
	height: 100%;
	width: 100%;
	text-align: center;
}

</style>
<script type="text/javascript">
	var id = "${id}"
	var password = "${password}"

	
</script>
</head>
<body>
<div class="form">
	<form action="login" method="post">
		<label>아이디 <input type="text" name="id"></label><br>
		<label>비밀번호 <input type="password" name="password"></label><br>
		<input type="submit" value="로그인">
	</form>
</div>
</body>
</html>





