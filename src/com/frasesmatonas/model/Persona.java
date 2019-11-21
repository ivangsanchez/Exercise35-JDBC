package com.frasesmatonas.model;

public class Persona {
	
	private String nombre;
	private int edad;
	private String carrera;
	private int idPersona;
	private String fecha;
	
	
	//constructor vacio
	public Persona()
	{		
	}
	
	//constructor parametrizado
	public Persona(String nombre, int edad,String carrera)
	{
		this.nombre=nombre;
		this.edad=edad;
		this.carrera=carrera;
	}
	
/////////////////////////////////////////////////////////////	
	//Getters and Setters
/////////// Nombre /////////
	public String getNombre()
	{
		return nombre;
	}
	
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
///////////// Edad ////////		
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
////////// Carrera ////////
	public String getCarrera()
	{
		return carrera;
	}
	
	public void setCarrera(String carrera)
	{
		this.carrera=carrera;
	}
	
//////////id Persona ////////
public int getIdPersona()
{
	return idPersona;
}

public void setIdPersona(int idPersona)
{
	this.idPersona=idPersona;
}

/////////// fecha /////////
public String getFecha()
{
return fecha;
}


public void setFecha(String fecha)
{
this.fecha=fecha;
}

	
	@Override
	public String toString() {
	return String.format("'%s',%d,'%s'", nombre,edad,carrera);
	}
	
	
}
