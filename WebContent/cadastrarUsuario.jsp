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

		<form action="" method="post">

			<table border="1" cellpadding="5">

				<tr>
					<th>ID:</th>
					<td><input type="text" id="id" name="id" placeholder="ID"
						readonly="readonly" ></td>
				</tr>

				<tr>
					<th>E-mail:</th>
					<td><input type="email" id="email" name="email" size="45"
						 /></td>
				</tr>
				<tr>
					<th>Senha:</th>
					<td><input type="password" id="senha" name="senha" size="45"
						 /></td>
				</tr>
				<tr>
					<th>Telefone:</th>
					<td><input type="text" id="celular" name="celular" size="45"
						 placeholder="Celular " required/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Cadastrar" /></td>
					
				</tr>
			

			</table>

		</form>
		
		 <script>

		 function mascara(o,f){
			    v_obj=o
			    v_fun=f
			    setTimeout("execmascara()",1)
			}
			function execmascara(){
			    v_obj.value=v_fun(v_obj.value)
			}
			function mtel(v){
			    v=v.replace(/\D/g,""); //Remove tudo o que não é dígito
			    v=v.replace(/^(\d{2})(\d)/g,"($1) $2"); //Coloca parênteses em volta dos dois primeiros dígitos
			    v=v.replace(/(\d)(\d{4})$/,"$1-$2"); //Coloca hífen entre o quarto e o quinto dígitos
			    return v;
			}
			function id( el ){
				return document.getElementById( el );
			}
			window.onload = function(){
				id('celular').onkeyup = function(){
					mascara( this, mtel );
				}
			}
    </script>
	</div>

</body>
</html>