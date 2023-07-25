package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/* Classe Responsavel por fazer a conexão com banco de dados*/

public class SingleConnection {
	
	private static String url = "jdbc:postgresql://localhost:5432/crud?autoReconnect=true";
	private static String user = "postgres";
	private static String password = "admin";
	private static Connection connection = null;
	
	static {
		
		conectar();
	}

	public SingleConnection() {
		
		conectar();
	}
	
	private static void conectar() {
		
		try {
			
			if(connection == null) {
				
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace(); // Mostra qualquer erro ao conectar no banco
		}
	}
	
	public static Connection getConnection() {
		
		return connection;
	}
}
