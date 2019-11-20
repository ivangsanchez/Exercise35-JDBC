<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Frases Matonas</title>
</head>
<body>

<h1>Frases Matonas</h1>
	<h2>Informacion de la Persona</h2>
	<form action="PersonaServlet" method="post">
		<p>
			<label for="txtNombre">Nombre:</label>
			<input type="text" id="txtNombre" name="txtNombre">
		</p>
		<p>
			<label for="txtEdad">Edad:</label>
			<input type="text" id="txtEdad" name="txtEdad">
		</p>
		<p>
			<label for="txtCarrera">Carrera:</label>
			<input type="text" id="txtCarrera" name="txtCarrera">
		</p>
		<p>
			<input type="submit" value="Login">
		</p>
	</form>
	
	<h2>Informacion de la Frase</h2>
	<form action="FraseServlet" method="post">
		<p>
			<label for="txtContenido">Contenido:</label>
			<input type="text" id="txtContenido" name="txtContenido">
		</p>
		<p>
			<label for="txtFecha_Cita">Fecha Cita:</label>
			<input type="text" id="txtFecha_Cita" name="txtFecha_Cita">
		</p>
		<p>
			<label for="txtCantidad">Cantidad:</label>
			<input type="text" id="txtCantidad" name="txtCantidad">
		</p>
		<p>
			<input type="submit" value="Login">
		</p>
	</form>
	

</body>
</html>