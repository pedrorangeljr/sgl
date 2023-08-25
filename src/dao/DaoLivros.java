package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.SingleConnection;
import models.Livros;

/*Classe Responsavel pelas operações no banco de dados*/

public class DaoLivros {
	
	private Connection connection;
	
	public DaoLivros() {
		
		connection = SingleConnection.getConnection(); // chama a classe Responsavel pela conexão com banco de dados
	}

	/*Metodo para Salvar Livros*/
	
	public void salvarLivros(Livros livros) {
		
		try {
			
			String sql = "INSERT INTO livros(titulo,autor,categoria,email,quantidade)VALUES(?,?,?,?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			
			insert.setString(1, livros.getTitulo());
			insert.setString(2, livros.getAutor());
			insert.setString(3, livros.getCategoria());
			insert.setString(4, livros.getEmail());
			insert.setString(5, livros.getQuantidade());
			insert.execute();
			
			connection.commit();
			
		} catch (Exception e) {
			
			try {
				
				connection.rollback();
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}
	}
}
