<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Iniciaste seccion!!</title>
</head>
<body>
	<h1>bienvenido a la página de inicio, tu correo es 
	<span style="font-weight: bold"><%= session.getAttribute("email") %></span>!
	</h1>											
</body>
</html>