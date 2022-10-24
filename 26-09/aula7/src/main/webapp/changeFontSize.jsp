<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>FontSize</title>
	</head>
	<body>
		<% 
			for(int i = 20; i < 45; i=i+5) {
		%>
			<p style="font-size: <%=i%>px">Teste</p>
		<% } %>
	</body>
</html>