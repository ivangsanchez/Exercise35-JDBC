package com.frasesmatonas.model;

public class Persona {
	
	private String nombre;
	private short edad;
	private String carrera;
	
	
	//constructor vacio
	public Persona()
	{		
	}
	
	//constructor parametrizado
	public Persona(String nombre, short edad,String carrera)
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
	public short getEdad()
	{
		return edad;
	}
	
	public void setEdad(short edad)
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
	
	
}
