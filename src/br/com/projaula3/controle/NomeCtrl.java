package br.com.projaula3.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projaula3.dados.NomeDB;
import br.com.projaula3.entidade.Nome;

/**
 * Servlet implementation class NomeCtrl
 */
@WebServlet("/NomeCtrl")
public class NomeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public NomeCtrl() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String msg = "";
		
		Nome nome1 = new Nome();
		
		nome1.setId(id);
		nome1.setNome(nome1);

		
		if (new NomeDB().insert(nome1)){
			msg = "Registro inserido com sucesso!!";	
		}else {
			msg = "Erro ao inserir registro!!";
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("CadastroNome.jsp").forward(request, response);
		doGet(request, response);
	}

}
