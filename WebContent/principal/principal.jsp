<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Livros</title>
</head>
<body>
  
  <br />

	<center>
		<h1>Gerenciamentos de Livros</h1>
		<h2>
			<a href="adicionarContatos.jsp">Adicionar Livros</a> &nbsp;&nbsp;&nbsp;
			<a href="relatorio.jsp">Imprimir Relatório</a> &nbsp;&nbsp;&nbsp;

		</h2>
	</center>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>Lista de Livros</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Titulo</th>
				<th>Autor</th>
				<th>Categoria</th>
				<th>E-mail</th>
				<th>Ações</th>
			</tr>
			<c:forEach items="${contatos}" var="contato">
				<tr>
					<td><c:out value="${contato.id }"></c:out></td>
					<td><c:out value="${contato.nome}"></c:out></td>
					<td><c:out value="${contato.telefone}"></c:out></td>
					<td><c:out value=""></c:out></td>
					<td><c:out value="${contato.email}"></c:out></td>
					<td><a href="ServletsContatos?acao=editar&contato=${contato.id }" />Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="ServletsContatos?acao=delete&contato=${contato.id }"
						onclick="return confirm('Tem certeza que deseja excluir ?')">Excluir</a></td>
				</tr>
			</c:forEach>
		</table>

		<h3 style="text-align: center">${mensagem }</h3>
	</div>

</body>
</html>