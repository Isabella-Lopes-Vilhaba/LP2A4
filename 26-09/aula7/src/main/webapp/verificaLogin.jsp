<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>VerificaLogin</title>
	</head>
	<body>
		<jsp:useBean id="login" class="login.Login"></jsp:useBean>
		
		<jsp:setProperty name = "login" property = "username" param = "username"/>
		<jsp:setProperty name = "login" property = "password" param = "password"/>
		
		<jsp:getProperty name = "login" property = "message"/>
	</body>
</html>