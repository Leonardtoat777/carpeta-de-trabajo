package svl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import bean.usuarios;
import dao.IniciarSeccionDao;

public class svlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public svlLogin() {
        super();
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		    
		    
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		IniciarSeccionDao log = new IniciarSeccionDao();
		usuarios user = log.login(email, password);

		if (user == null) {
			request.setAttribute("mensaje","vuelva a digitar el nonmbre o la contraseña");
			RequestDispatcher dispatcher = request.getRequestDispatcher("iniciarSeccion.jsp");
	        dispatcher.forward(request, response);
	        return;
		} else {
			response.sendRedirect("inicio.jsp");
			session.setAttribute("email", email);
			session.setAttribute("password",password);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
