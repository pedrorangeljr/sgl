package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoLogin;
import models.Login;


@WebServlet("/ServletCadastro")
public class ServletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DaoLogin daoLogin = new DaoLogin();
       
    
    public ServletCadastro() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String id = request.getParameter("id");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			
			Login login = new Login();
			
			login.setId(!id.isEmpty() ? Long.parseLong(id) : 0);
			login.setEmail(email);
			login.setSenha(senha);
			
			if (id == null || id.isEmpty() && !daoLogin.ValidarEmail(email)) {
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("cadastrarUsuario.jsp");				
				request.setAttribute("msg", "Já existe usuário com esse email");
				dispatcher.forward(request, response);
				
			}
			else if(id == null || id.isEmpty()) {
				
				daoLogin.cadastrarUsuario(login);
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Usuario Cadastrado com Sucesso");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
