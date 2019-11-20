package com.frasesmatonas.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FraseServlet")
public class FraseServlet extends HttpServlet{

	private static final long serialVersionUID =1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html charset='utf-8'");
		PrintWriter output = resp.getWriter();
		
		String txtContenido=req.getParameter("txtContenido");
		String txtFecha_Cita=req.getParameter("txtFecha_Cita");
		String txtCantidad=req.getParameter("txtCantidad");
		
		output.println("Contenido:"+txtContenido);
		output.println("Fecha Cita:"+txtFecha_Cita);
		output.println("Cantidad:"+txtCantidad);
		
		output.close();
		
	}
	
	
}
