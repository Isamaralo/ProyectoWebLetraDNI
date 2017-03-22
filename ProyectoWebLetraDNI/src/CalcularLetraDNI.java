

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularLetraDNI
 */
@WebServlet("/CalcularLetraDNI")
public class CalcularLetraDNI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularLetraDNI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String s_dni = request.getParameter("dni");
		int dni = Integer.parseInt(s_dni); 
		
		String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = 0;
        int pos_letra = 0;    
        
        pos_letra = dni % 23;
        letra = caracteresDNI.charAt(pos_letra);
        
		response.setContentType("text/plain");
		PrintWriter pw = response.getWriter();
		pw.write(letra);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
