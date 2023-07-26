package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexao.SingleConnection;
import models.Login;

public class DaoLogin {
	
	private Connection connection;
	
	public DaoLogin() {
		
		connection = SingleConnection.getConnection();
	}

	/*Verifica no banco se tem usuário cadastrado*/
	
	public boolean validarAutenticacao(Login login) {
		
		try {
			
			String sql = "SELECT * FROM login WHERE upper(email) = upper(?) and upper(senha) = upper(?)";
			PreparedStatement validar = connection.prepareStatement(sql);
			
			validar.setString(1, login.getEmail());
			validar.setString(2, login.getSenha());
			
			ResultSet resultado = validar.executeQuery();
			
			if(resultado.next()) {
				
				return true; // Autenticado
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false; // não autenticado.
	}
}
