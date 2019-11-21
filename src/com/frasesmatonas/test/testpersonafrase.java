package com.frasesmatonas.test;
import java.sql.Connection;

import org.junit.Test;

import com.frasesmatonas.fmjdbc.databaseutil;
import com.frasesmatonas.model.Persona;

public class testpersonafrase {

	
	@Test
	public void testReadPersona()
	{
		Connection conn = databaseutil.getConnection();
		//assertNotNull("La conexion no e snula",conn);
	}
}
