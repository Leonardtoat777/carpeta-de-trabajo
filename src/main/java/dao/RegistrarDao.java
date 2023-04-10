package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bean.usuarios;
import bd.coneccion;

public class RegistrarDao{
	

	public static void registrados(usuarios user) throws SQLException {
	    String sql = "insert into usuarios(user_name,apellido,email,password,numero) values (?, ?, ?, ?, ?);";

	    try (Connection connection = coneccion.getConexion();
	        PreparedStatement ps = connection.prepareStatement(sql)) {
	    	ps.setString(1, user.getUser_name());
	    	ps.setString(2, user.getApellido());
	    	ps.setString(3, user.getEmail());
	    	ps.setString(4, user.getPassword());
	    	ps.setString(5, user.getNumero());
	    	
	        int valor = ps.executeUpdate();
	        if (valor == 0) {
	            throw new SQLException("Problema dentro de la base de datos");
	        }
	    } catch (SQLException e) {
	        System.out.print("#####error en base de datos"+e);
	        throw e;
	    }
	}
	
}
