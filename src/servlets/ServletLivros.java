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
			
			String id = request.getParameter("id");
			String titulo = request.getParameter("titulo");
			String autor = request.getParameter("autor");
			String categoria = request.getParameter("categoria");
			String email = request.getParameter("email");
			int quantidade = Integer.parseInt("quantidade");
			
			System.out.println(titulo);
			System.out.println(autor);
			System.out.println(categoria);
			System.out.println(email);
			System.out.printf("%d%n", quantidade);
			
			
		} catch (Exception e) {
			
		}
	}

}
