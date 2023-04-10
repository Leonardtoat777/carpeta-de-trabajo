package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bd.coneccion;

public class CambiarContraseñaDao {
	Connection conectar = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
public boolean cambiarContraseña(String email, String passwordActual, String newpassword) {
		boolean resultado = false;
		
	    try {
	    	conectar = coneccion.getConexion();
	        String sql = "update usuarios set password =? where email=?;";
	        ps = conectar.prepareStatement(sql);
	        ps.setString(1, newpassword);
	        ps.setString(2, email);
	        int valor = ps.executeUpdate();

	        if (valor == 1) {
	            resultado = true;
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (ps != null) {
	                ps.close();
	            }

	            if (conectar != null) {
	                conectar.close();
	            }
	        } catch (Exception e2) {
	            e2.printStackTrace();
	        }
	    }

	    return resultado;
	    }
	}


	

