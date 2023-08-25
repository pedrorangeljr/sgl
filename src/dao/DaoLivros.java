package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	/*Metodo Listar todos*/
	
	public List<Livros> listar() throws Exception{
		
		List<Livros> listar = new ArrayList<Livros>();
		
		String sql = "SELECT * FROM livros";
		PreparedStatement select = connection.prepareStatement(sql);
		ResultSet resultado = select.executeQuery();
		
		while(resultado.next()) {
			
			Livros livro = new Livros();
			
			livro.setId(resultado.getLong("id"));
			livro.setTitulo(resultado.getString("Titulo"));
			livro.setAutor(resultado.getString("autor"));
			livro.setCategoria(resultado.getString("categoria"));
			livro.setEmail(resultado.getString("email"));
			livro.setQuantidade(resultado.getString("quantidade"));
			
			listar.add(livro);
		}
		
		return listar;
	}
}
