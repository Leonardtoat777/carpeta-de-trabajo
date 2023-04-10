package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import bean.usuarios;
import bd.coneccion;

public class IniciarSeccionDao {
	
	Connection conectar = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public usuarios login(String email, String password) {
		usuarios u = null;
		
		try {
			conectar = coneccion.getConexion();
			String sql = "select * from usuarios where email=? and password=?";
			ps = conectar.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				u = new usuarios();
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
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
		
		
		return u;
	}
}

