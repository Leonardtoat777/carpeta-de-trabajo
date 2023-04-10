package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.CambiarContraseñaDao;

public class svlPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public svlPassword() {
        super();
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	

 	String email = request.getParameter("email");
	String passwordActual = request.getParameter("passwordActual");
	String newPassword = request.getParameter("newpassword");

	CambiarContraseñaDao change = new CambiarContraseñaDao();
	boolean resultado = change.cambiarContraseña(email, passwordActual, newPassword);

	if (resultado) {
	    String mensaje = "Cambio de contraseña exitosa, introducir una nueva contraseña!";
	    request.setAttribute("mensaje", mensaje);
	    response.sendRedirect("iniciarSeccion.jsp");
	} else {
	    String mensaje = "Error, contraseña o email no validos";
	    request.setAttribute("mensaje", mensaje);
	    response.sendRedirect("Contraseña.jsp");
	}
}
     
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
