package com.frasesmatonas.model;

public class Frase {
	
	private String contenido;
	private String fechacita;
	private int cantidad;
	
	public Frase()
	{
	}
	
	public Frase(String contenido, String fechacita, int cantidad)
	{
		this.contenido=contenido;
		this.fechacita=fechacita;
		this.cantidad=cantidad;
	}
	
/////// Getters and Setters /////////
/////// Contenido////////
	
	public String getContenido()
	{
		return contenido;
	}
	
	public void setContdenido(String contenido)
	{
		this.contenido=contenido;
	}
	
//////// Fecha Cita//////
	
	public String getFechacita()
	{
		return fechacita;
	}
	
	public void setFechacita(String fechacita)
	{
		this.fechacita=fechacita;
	}

///////// Cantidad /////////
	public int getCantidad()
	{
		return cantidad;
	}
	
	public void setCantidad(int cantidad)
	{
		this.cantidad=cantidad;
	}

}
