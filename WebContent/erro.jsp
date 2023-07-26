<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tela de Erro</title>
</head>
<body>

 <h1>Mensagem de Erro, entre em contato com equipe de suporte</h1>
 
 <%
   
   out.println(request.getAttribute("msg"));
 
 %>

</body>
</html>