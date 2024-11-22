<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de comprobacion de contraseña</title>
</head>
<body>

    <p><em>Requisitos</em></p>
    <p><em>Al menos:</em></p>
    <ul>
        <li>4 Mayúsculas</li>
        <li>3 Minúsculas</li>
        <li>3 Números</li>
    </ul>
    <form action="/rebound_m5s2_erick_rivera/ExaminaContrasenia" method="POST">
        <label for="password">Introduzca una contraseña</label>
        <input type="text" name="password" id="password" required />
        <button type="submit">Enviar</button>
    </form>

</body>
</html>