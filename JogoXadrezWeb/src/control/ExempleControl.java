package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ExempleModel;

/**
 * Servlet implementation class Exemple
 */
@WebServlet("/Exemple")
public class ExempleControl extends HttpServlet {
	public static Integer count =0; 
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
//		String [] requisicao = request.getParameterValues("par");
//		requisicao = requisicao[0].split(",");
//		int i = Integer.parseInt(requisicao[0]);
//		int j = Integer.parseInt(requisicao[1]);
//		ExempleModel modeloExemplo = new ExempleModel(i, j);
//		PrintWriter escrevePaginas = response.getWriter();
//		escrevePaginas.print("<html>");
//		escrevePaginas.print("<head>");
//		escrevePaginas.print("<script language='javascript'>"
//							+ " alert('você enviou um par') </script>");
//		escrevePaginas.print("</head>");
//		escrevePaginas.print("<body>");
//		escrevePaginas.print("Exemplo pra ver funcionando o response e request!<br>");		
//		escrevePaginas.print("Par enviado: ("+modeloExemplo+")");
//		escrevePaginas.print("<p>+<a href='ExempleJspPage.jsp'>"
//							+ " voltar </a>");		
//		escrevePaginas.print("</body>");
//		escrevePaginas.print("</html>");		
		count++;
		System.out.println(count);
		ExempleModel em = new ExempleModel(0, 0);
		request.setAttribute("em", em);
		RequestDispatcher rd = request.getRequestDispatcher("ExempleJspPage.jsp");
		rd.forward(request, response);
		
	}
}
