package LP2A4.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import LP2A4.Aluno;

/**
 * Servlet implementation class AlunoCRUD
 */
@WebServlet("/aluno")
public class AlunoCRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlunoCRUD() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private Aluno transform(HttpServletRequest request) {
    	final Aluno aluno = new Aluno();
    	aluno.setNome(request.getParameter("nome"));
    	aluno.setMatricula(request.getParameter("matricula"));
    	aluno.setEndereco(request.getParameter("endereco"));
    	return aluno;
    }
    
    private void tratarRequisicao(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	final String acao = request.getParameter("acao");
    	final Aluno aluno = this.transform(request);
    	
    	switch(acao) {
	    	case "create" :
	    	case "retrieve" :
	    	case "update" :
	    	case "delete" :
    	}
    	
    	final PrintWriter out = response.getWriter();
    	
    	out.append("Tratado por: ").append(request.getContextPath());
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		tratarRequisicao(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void retriveAcao(HttpServeletRequest request, HttpServeletResponse response) {
		final String matricula = request.getParameter("matricula");
		final AlunoDAO dao = AlunoDAO.getInstance();
		final Aluno aluno = dao.retrive(matricula);
		request.setAttribute("aluno ", aluno);
		System.out.println("Colocando o aluno " + aluno.getMatricula() + "");
		final RequestDispatcher rd = request.getRequestDispatcher("exibir_aluno");
		rd.forward(request, response);
	}

}
