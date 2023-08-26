<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adicionar Livros</title>
</head>
<body>

<center>
		<h1>Gerenciamento de Livros</h1>
		<h2>
			&nbsp;&nbsp;&nbsp; <a href="principal/principal.jsp">Lista
				Livros</a>

		</h2>
	</center>

	<div align="center">

		<form action="<%= request.getContextPath() %>/ServletLivros" method="post">

			<table border="1" cellpadding="5">
				<caption>
					<h2>Cadastrar Livros</h2>
				</caption>

				<tr>
					<th>ID:</th>
					<td><input type="text" id="id" name="id" placeholder="ID"
						readonly="readonly" value=""></td>
				</tr>

				<tr>
					<th>Titulo:</th>
					<td><input type="text" id="titulo" name="titulo" size="45"
						value="" /></td>
				</tr>
				<tr>
					<th>Autor:</th>
					<td><input type="text" id="autor" name="autor" size="45"
						value="" /></td>
				</tr>
					<tr>
					<th>Editora:</th>
					<td><input type="text" id="editora" name="editora" size="45"
						value="" /></td>
				</tr>
					<tr>
					<th>Categotia:</th>
					<td><input type="text" id="categoria" name="categoria" size="45"
						value="" /></td>
				</tr>
				<tr>
					<th>E-mail:</th>
					<td><input type="email" id="email" name="email" size="45"
						value="" /></td>
				</tr>
					<tr>
					<th>Quantidade:</th>
					<td><input type="text" id="quantidade" name="quantidade" size="45"
						value="" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Cadastrar" /></td>
				</tr>

			</table>

		</form>
	</div>


</body>
</html>