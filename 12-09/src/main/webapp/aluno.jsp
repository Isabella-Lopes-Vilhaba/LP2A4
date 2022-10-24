<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>LP2A4</title>
	</head>
	<body>
		<h1>Aula 05</h1>		
		<!--<% out.println("Hello World!"); %>
		<br>
		<%= "Testando" %>
		<br>
		<% int x = 2 + 2; %>
		<%= x %>
		<br>
		<% 
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); 
			out.println(sdf.format(new Date()));
		%>
		<br>-->
		
		<jsp:useBean id="aluno" class="LP2A4.Aluno"></jsp:useBean>
		
		<jsp:setProperty name = "aluno" property="nome" param ="nome"/>
		<jsp:setProperty name = "aluno" property="matricula" param="matricula"/>
		
		<table border="1">
			<tr>
				<th><b>Nome: </b></th>
				<th><b>Matrícula: </b></th>
			</tr>
			<tr>
				<td><jsp:getProperty name="aluno" property="nome"/></td>
				<td><jsp:getProperty name="aluno" property="matricula"/></td>
			</tr>
		</table>
	</body>
</html>