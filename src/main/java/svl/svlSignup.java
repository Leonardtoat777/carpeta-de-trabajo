package svl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import bean.usuarios;
import dao.RegistrarDao;

public class svlSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public svlSignup() {
        super();
   
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
		
    	
    	String nombre = request.getParameter("name");
	    String apellido = request.getParameter("apellido");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    String numero = request.getParameter("numero");
	    
	    
	    if (nombre == null || nombre.isEmpty() || apellido == null || apellido.isEmpty() ||	email == null || email.isEmpty() || password == null || password.isEmpty() || numero == null || numero.isEmpty()){
	    	
	        request.setAttribute("mensaje", "Completa todo los campos!");
	        RequestDispatcher dispatcher = request.getRequestDispatcher("registrar.jsp");
	        dispatcher.forward(request, response);
	        return;
	    }

	    usuarios user = new usuarios(nombre, apellido, email, password, numero);
	    user.setUser_name(nombre);
	    user.setApellido(apellido);
	    user.setEmail(email);
	    user.setPassword(password);
	    user.setNumero(numero);

	    try {
	        RegistrarDao.registrados(user);
	        request.setAttribute("mensaje", "Se guardaron completamente");
	        request.setAttribute("Registro Exitoso!!", true);
	        response.sendRedirect("iniciarSeccion.jsp");
	    } catch (SQLException e) {
	        request.setAttribute("mensaje", "Error, no se guardaron los datos");
	        e.printStackTrace();
	        request.setAttribute("registroFallido", true);
	        response.sendRedirect("registrar.jsp");
	    }
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
