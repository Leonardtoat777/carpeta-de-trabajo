<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Validar contraseña</title>
  <link rel="stylesheet" href="./css/password.css">

</head>
<body>

<div class="mainDiv">
  <div class="cardStyle">
    <form action="svlPassword" method="post" name="signupForm" id="signupForm">
      
      <img src="https://cdn-icons-png.flaticon.com/512/223/223122.png" id="signupLogo"/>
      <h2 class="formTitle">CAMBIA TU CONTRASEÑA</h2>
      
    <div class="inputDiv">
      <label class="inputLabel" for="email">Confirmar Email:</label>
      <input type="email" id="email" name="email" required>
    </div>  
      
    <div class="inputDiv">
      <label class="inputLabel" for="passwordActual">Contraseña Actual:</label>
      <input type="password" id="passwordActual" name="passwordActual" required>
    </div>
      
    <div class="inputDiv">
      <label class="inputLabel" for="newpassword">Nueva contraseña</label>
      <input type="password" id="newpassword" name="newpassword">
    </div>
    
  <div class="buttonWrapper">
    <button type="submit" id="submitButton" class="submitButton pure-button pure-button-primary">
      <span>Regresar al inicio</span>
    </button>
  </div>
      
  </form>
  </div>
</div>

  <script  src="./js/main_rl.js"></script>

</body>
</html>
