package com.frasesmatonas.fmjdbc;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import org.junit.Test;

public class TestDataBaseConecction {
	
	@Test
	public void testConnection(){
		Connection connection=databaseutil.getConnection();
		assertNotNull("no se realizo la conexion",connection);
		
		try {
			connection.close();
			assertTrue("No se cerró la conexión",connection.isClosed());
			
		}catch(Exception e) {
			
		}
	}
}
