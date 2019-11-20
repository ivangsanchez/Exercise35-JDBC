package com.frasesmatonas.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {
	
	private static final long serialVersionUID =1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html charset='utf-8'");
		PrintWriter output = resp.getWriter();
		
		String txtNombre=req.getParameter("txtNombre");
		String txtEdad=req.getParameter("txtEdad");
		String txtCarrera=req.getParameter("txtCarrera");
		
		output.println("Nombre:"+txtNombre);
		output.println("Edad:"+txtEdad);
		output.println("Carrera:"+txtCarrera);
		
		output.close();
	}
}
