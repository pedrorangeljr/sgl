package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoLivros;


@WebServlet("/ServletLivros")
public class ServletLivros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private DaoLivros daoLivros = new DaoLivros();
    
    public ServletLivros() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			
		} catch (Exception e) {
			
		}
	}

}
