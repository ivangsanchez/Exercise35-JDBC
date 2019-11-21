<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Frases Matonas</title>
</head>
<body>
 		<!-- JVA EN HTML -->
 		<c:forEach var="persona" items="${listPersona}">
 			<div>
 					<h4>${persona.getIdPersona()}</h4>
 					<p>${persona.getNombre()}</p>
 					<p>${persona.getEdad()}</p>
 					<p>${persona.getCarrera()} </p>
 					<p>${persona.getFecha()}</p>
 			</div>
		 </c:forEach>


</body>
</html>