<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Somar</title>
	</head>
	<body>
		<h1>Somar dois n�meros</h1>
		
		<jsp:useBean id="soma" class="calculo.Soma"></jsp:useBean>
		
		<jsp:setProperty name = "soma" property = "num1" param = "num1"/>
		<jsp:setProperty name = "soma" property = "num2" param = "num2"/>
		
		<span>Resultado:</span>
		<jsp:getProperty name = "soma" property = "result"/>
	</body>
	<%
		//Exerc�cio2
		//String redirectURL = "http://localhost:8080/aula7/redirect.jsp";
		//response.sendRedirect(redirectURL);
	%>
</html>