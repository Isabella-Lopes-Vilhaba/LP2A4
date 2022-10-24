<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Consulta Aluno</title>
	</head>
	<body>
		<h1>Consultar aluno por matrícula</h1>
		<form action="aluno">
			<input type="hidden" name="acao" id="acao" value="retrieve" />
			<input type="text" name="matricula" id="matricula" />
			<input type="submit" name="submit" />
		</form>
	</body>
</html>