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
			
			String sql = "INSERT INTO livros(titulo,autor,categoria,email,quantidade,editora)VALUES(?,?,?,?,?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			
			insert.setString(1, livros.getTitulo());
			insert.setString(2, livros.getAutor());
			insert.setString(3, livros.getCategoria());
			insert.setString(4, livros.getEmail());
			insert.setString(5, livros.getQuantidade());
			insert.setString(6, livros.getEditora());
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
		
		String sql = "select * from livros ORDER BY id ASC";
		PreparedStatement select = connection.prepareStatement(sql);
		ResultSet resultado = select.executeQuery();
		
		while(resultado.next()) {
			
			Livros livro = new Livros();
			
			livro.setId(resultado.getLong("id"));
			livro.setTitulo(resultado.getString("Titulo"));
			livro.setAutor(resultado.getString("autor"));
			livro.setEditora(resultado.getString("editora"));
			livro.setCategoria(resultado.getString("categoria"));
			livro.setEmail(resultado.getString("email"));
			livro.setQuantidade(resultado.getString("quantidade"));
			
			listar.add(livro);
		}
		
		return listar;
	}
	
	/*Metodo delete*/
	
	public void deletar(String id) {
		
		try {
			
			String sql = "DELETE FROM livros WHERE id = '"+id+"'";
			PreparedStatement delete = connection.prepareStatement(sql);
			delete.execute();
			
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
	
	/*Metodo listar por id*/
	
	public Livros consultar(String id) throws Exception {
		
		String sql = "SELECT * FROM livros WHERE id = '"+id+"'";
		PreparedStatement consultar = connection.prepareStatement(sql);
		ResultSet resultado = consultar.executeQuery();
		
		if(resultado.next()) {
			
			Livros livro = new Livros();
			
			livro.setId(resultado.getLong("id"));
			livro.setTitulo(resultado.getString("Titulo"));
			livro.setAutor(resultado.getString("autor"));
			livro.setEditora(resultado.getString("editora"));
			livro.setCategoria(resultado.getString("categoria"));
			livro.setEmail(resultado.getString("email"));
			livro.setQuantidade(resultado.getString("quantidade"));
			
			return livro;
			
		}
		
		return null;
	}
	
	/*Metodo de Update*/
	
	public void atualizar(Livros livro) {
		
		try {
			
			String sql = "UPDATE livros SET titulo = ?, autor = ?, editora = ?, categoria = ?, email = ?, quantidade = ? WHERE id = " + livro.getId();
			PreparedStatement update = connection.prepareStatement(sql);
			
			update.setString(1, livro.getTitulo());
			update.setString(2, livro.getAutor());
			update.setString(3, livro.getEditora());
			update.setString(4, livro.getCategoria());
			update.setString(5, livro.getEmail());
			update.setString(6, livro.getQuantidade());
			update.executeUpdate();
			
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
