package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coneccion {

	private static final String _JDBC = "com.mysql.jdbc.Driver";
	private static final String _URL = "jdbc:mysql://localhost:3306/login";
	private static final String _USER = "root";
	private static final String _PASSWORD = "";

	public static Connection getConexion() {
	    Connection cn = null;
	    
	    try {
	        Class.forName(_JDBC);
	        cn = DriverManager.getConnection(_URL, _USER, _PASSWORD);
	        System.out.println("Conexion exitosa!!!");
	        
	    } catch (SQLException se) {
	        System.out.println("SQL Exception: " + se.getMessage());
	        se.printStackTrace();
	    } catch (Exception e) {
	        System.out.println("Exception: " + e.getMessage());
	        e.printStackTrace();
	    }
	    return cn;
	}
}
