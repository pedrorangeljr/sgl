package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoLivros;
import models.Livros;

@WebServlet("/ServletLivros")
public class ServletLivros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DaoLivros daoLivros = new DaoLivros();

	public ServletLivros() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String id = request.getParameter("id");
			String titulo = request.getParameter("titulo");
			String autor = request.getParameter("autor");
			String categoria = request.getParameter("categoria");
			String email = request.getParameter("email");
			String quantidade = request.getParameter("quantidade");

			Livros livro = new Livros();
			
			livro.setId(!id.isEmpty() ? Long.parseLong(id) : 0);
			livro.setTitulo(titulo);
			livro.setAutor(autor);
			livro.setCategoria(categoria);
			livro.setEmail(email);
			livro.setCategoria(categoria);
			livro.setQuantidade(quantidade);
			
			if(id == null || id.isEmpty()) {
				
				daoLivros.salvarLivros(livro);
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("principal/principal.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) {

		}
	}

}
