<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Persona</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/style.css"> 
</head>
<body>

<h1>FORMULARIO</h1>
<form action="personas" method="post">

	<p>
	<label>Nombre</label>
	<input class="form-control" type ="text" name=txtNombre placeholder="nombre"> 
	</p>
	
	<p>
	<label>Edad</label>
	<input class="form-control" type ="text" name=txtEdad placeholder="edad"> 
	</p>
	
	<p>
	<label>Carrera</label>
	<input class="form-control" type ="text" name=txtCarrera placeholder="carrera">
	</p>
	
	<p>
	<input class="btn btn-success" type="submit" value="subir"> 
	</p>


</form>

<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/script.js"></script> 
</body>
</html>