<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Usuário</title>
</head>
<body>

	<center>
		<h1>Cadastro de Usuários</h1>

	</center>

	<div align="center">

		<form action="ServletCadastro" method="post">

			<table border="1" cellpadding="5">

				<tr>
					<th>ID:</th>
					<td><input type="text" id="id" name="id" placeholder="ID"
						readonly="readonly"></td>
				</tr>

				<tr>
					<th>E-mail:</th>
					<td><input type="email" id="email" name="email" size="45" /></td>
				</tr>
				<tr>
					<th>Senha:</th>
					<td><input type="password" id="senha" name="senha" size="45" /></td>
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