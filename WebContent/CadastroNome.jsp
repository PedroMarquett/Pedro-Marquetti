<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Nomes</title>
</head>
<body>

	<h1>Cadastro de Nomes</h1>
	<form action="NomesCtrl" method="post">
	<table>
		<tr>
			<td>
				Id:
			</td>
			<td>
				<input type="text" name="id"/>
			</td>
		</tr>
		<tr>
			<td>
				Nome:
			</td>
			<td>
				<input type="text" name="nome"/>
			</td>
		</tr>		
	</table>
	<input type="submit" value="Salvar"/>
</form>	

<% if (request.getAttribute("msg") != null){ %>
	<b> <%=request.getAttribute("msg") %></b>
<%}%>

</body>
</html>