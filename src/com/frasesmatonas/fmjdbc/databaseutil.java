package com.frasesmatonas.fmjdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class databaseutil {
	private static final String URL_FORMAT = "jdbc:%s://%s:%s/%s?useUnicode=true" + 
			"&useJDBCCompliantTimezoneShift=true" + 
			"&useLegacyDatetimeCode=false" + 
			"&serverTimezone=UTC";
	
	public static Connection getConnection() {
		String dbms = "mysql";//1
		String host = "localhost";//2
		String port = "3306";//3
		String dataBase = "frases_matonas";//4
		String user = "root";//5
		String pass = "admin";//6
		
		//7
		String url = String.format(URL_FORMAT, dbms, host, port, dataBase);
		
		// se crea un objeto llamado connection encargado de conectar con la base de datos
		Connection connection = null;
		
		try {
			//creando estancia de driver en memoria para poder ser accedida
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//obtener la conexión a la base de datos
			connection = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	//Cerrar la conexión 
	public static void closeConnection(Connection conn)
	{
		try {
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}