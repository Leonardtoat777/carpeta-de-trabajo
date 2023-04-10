<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Registrate</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="icon" type="image/png" href="images/icons/registro.ico"/>
	<link rel="stylesheet" type="text/css" href="css/nunito-font.css">
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body class="form-v6">
	<div class="page-content">
		<div class="form-v6-content">
			<div class="form-left">
				<img src="images/perrito.jpg" style="width:500px" alt="form">
			</div>
			<form class="form-detail" action="svlSignup" method="post">
				<h2>Registrate</h2>
				<div class="form-row">
					<input type="text" name="name" id="full-name" class="input-text" placeholder="Nombre" required>
				</div>
				<div class="form-row">
					<input type="text" name="apellido" id="your-last-name" class="input-text" placeholder="Apellido:" required>
				</div>
				<div class="form-row">
					<input type="text" name="email" id="your-email" class="input-text" placeholder="Correo Electronico:" required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">
				</div>
				<div class="form-row">
					<input type="password" name="password" id="password" class="input-text" placeholder="Contraseña:" required>
				</div>
				<div class="form-row">
					<input type="text" name="numero" id="numero" class="input-text" placeholder="Numero:" required>
				</div>
				<div class="form-row-last">
					<input type="submit" name="register" class="form-submit" value="Registrar" >
					<a href="iniciarSeccion.jsp"></a>
				</div>
				<div>	<%String resultado = (String) request.getAttribute("mensaje");
					String mensaje = "";
					if (resultado != null)	mensaje = resultado;
					out.print(mensaje);
					%>
					
				</div>
			</form>
		</div>
	</div>
</body>
</html>