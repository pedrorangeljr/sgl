<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<a href="principal/adicionarLivros.jsp">Adicionar Livros</a> &nbsp;&nbsp;&nbsp;
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
				<th>Editora</th>
				<th>E-mail</th>
				<th>Quantidade</th>
				<th>Ações</th>
			</tr>
			<c:forEach items="${livros}" var="livro">
				<tr>
					<td><c:out value="${livro.id}"></c:out></td>
					<td><c:out value="${livro.titulo }"></c:out></td>
					<td><c:out value="${livro.autor }"></c:out></td>
					<td><c:out value="${livro.editora }"></c:out></td>
					<td><c:out value="${livro.categoria }"></c:out></td>
					<td><c:out value="${livro.email }"></c:out></td>
					<td><c:out value="${livro.quantidade }"></c:out></td>
					<td><a href="" />Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href=""
						onclick="return confirm('Tem certeza que deseja excluir ?')">Excluir</a></td>
				</tr>
			</c:forEach>
		</table>

		<h3 style="text-align: center">${mensagem }</h3>
	</div>

</body>
</html>