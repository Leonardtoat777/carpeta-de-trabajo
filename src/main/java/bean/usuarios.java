package bean;

public class usuarios {
	String user_name, apellido,password,email,numero;

	public usuarios(String user_name,String apellido,String password,String email,String numero) {
		this.user_name = user_name;
		this.apellido = apellido;
		this.password = password;
		this.email = email;
		this.numero = numero;
	}
	
	public usuarios(){
		
	}
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
