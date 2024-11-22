<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Respuesta</title>
</head>
<body>
	<p>La contraseña en cuestion: <c:out value="${passToText}" /></p>
	<c:if test="${not pass}">
		<h1>La contraseña es debil</h1>
	</c:if>
	<c:if test="${pass}">
		<h1>La contraseña es Fuerte</h1>
	</c:if>
</body>
</html>