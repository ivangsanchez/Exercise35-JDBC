package com.frasesmatonas.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frasesmatonas.db.DatabaseManager;
import com.frasesmatonas.fmjdbc.databaseutil;
import com.frasesmatonas.model.Persona;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet {
	
	private static final long serialVersionUID =1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn =null;
		DatabaseManager dbManager=null;
		List<Persona> personas =null;
		RequestDispatcher dispatcher=null;
		
		conn =databaseutil.getConnection();
		dbManager = new DatabaseManager(conn);
		personas =dbManager.consultarPersona();
		
		//preparar datos para mandarlo a la vista (MVC)
		req.setAttribute("listPersona",personas);
		
		//indicar la vista a utilizar
		dispatcher=req.getRequestDispatcher("personas.jsp");
		
		//cargar la ruta
		dispatcher.forward(req, resp);
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.setContentType("text/html charset='utf-8'");
		//PrintWriter output = resp.getWriter();
		
		Connection conn =null;
		DatabaseManager dbManager = null;
		Persona persona = null;
		
		//Obtener datos
			//identificar de donde vas a recuperar los datos
			//Nombre
		String txtNombre=req.getParameter("txtNombre");
		String txtEdad=req.getParameter("txtEdad");
		String txtCarrera=req.getParameter("txtCarrera");
		
		//validar datos
		
		
		//modelar datos
		persona= new Persona();
		persona.setNombre(txtNombre);
		persona.setEdad(Integer.parseInt(txtEdad));;
		persona.setCarrera(txtCarrera);
		
		//Guardar Datos
			//obtener conexion
		conn =databaseutil.getConnection();
			//Manipula los Datos
		dbManager =new DatabaseManager(conn);
			//Procesar datos
		dbManager.crearPersona(persona);
		databaseutil.closeConnection(conn);
		
		doGet(req,resp);
		/*
		output.println("Nombre:"+txtNombre);
		output.println("Edad:"+txtEdad);
		output.println("Carrera:"+txtCarrera);
		
		output.close();
		*/
	}
}
