package com.frasesmatonas.db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import com.frasesmatonas.model.Persona;
import com.frasesmatonas.model.Frase;

public class DatabaseManager {

	private Connection conn;
	
	public DatabaseManager(Connection conn){
		this.conn=conn;
	}
	
	
	public void crearPersona(Persona persona){
		
		//se rellena la query con la información de persona
		String query="insert into persona(nombre, edad,carrera) "
				+ "values("+persona.toString()+")";
		
		//se crea un statement para hacer la ejecución del código SQL
		Statement stmnt =null;
		
		// se crea una conexión con la base de datos y se ejecuta la query
		try {
			stmnt = conn.createStatement();
			//stmnt.executeQuery(query);
			stmnt.executeUpdate(query);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void crearFrase(Frase frase){
		
		//se rellena la query con la información de persona
				String query="insert into frase(contenido, cantidad,fechacita) "
						+ "values("+frase.toString()+")";
				
				//se crea un statement para hacer la ejecución del código SQL
				Statement stmnt =null;
				
				// se crea una conexión con la base de datos y se ejecuta la query
				try {
					stmnt = conn.createStatement();
					//stmnt.executeQuery(query);
					stmnt.executeUpdate(query);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
		
	}
	
	public void crearFrasePersona(int idPersona,int idFrase) {
		
	}
	
	public List<Persona> consultarPersona(){
	
		String query ="select * from persona";
		Statement stmnt=null;
		ResultSet rs=null;
		List<Persona> listPersonas=null;
		
		try {
			stmnt =conn.createStatement();
			rs=stmnt.executeQuery(query);
			listPersonas = new ArrayList<>();
			while(rs.next()) {
				
				//creando el modelo
				Persona persona = new Persona();
				
				//Agregando valores al modelo
				persona.setIdPersona(rs.getInt("idPersona"));
				persona.setNombre(rs.getString("nombre"));
				persona.setEdad(rs.getInt("edad"));
				persona.setCarrera(rs.getString("carrera"));
				persona.setFecha(rs.getString("fecha"));
				
				//agregando modelo a lista
				listPersonas.add(persona);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return listPersonas;
		
	}
	
	public List<Frase> consultarFrase(){
		
		String query ="select * from frase";
		Statement stmnt=null;
		ResultSet rs=null;
		List<Frase> listFrase=null;
		
		try {
			stmnt =conn.createStatement();
			rs=stmnt.executeQuery(query);
			listFrase = new ArrayList<>();
			while(rs.next()) {
				
				//creando el modelo
				Frase frase = new Frase();
				
				//Agregando valores al modelo
				
				frase.setCantidad(rs.getInt("cantidad"));
				frase.setIdFrase(rs.getInt("idFrase"));
				frase.setContdenido(rs.getString("contenido"));
				frase.setFecha(rs.getString("fecha"));
				frase.setFechacita(rs.getString("fechacita"));
				
				//agregando modelo a lista
				listFrase.add(frase);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return listFrase;
		
	}
	
	public List<Frase> consultarFrasesPersona(int idPersona){
		
		return null;
	}
	
	
}
