package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	static final String URL = "jdbc:postgresql://190.114.206.177:5432/tutifruti27";
	static final String USER = "tf27_user";
	static final String PASS = "tf135";
	 
	public static Connection crearConexion() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Connection conexion = DriverManager.getConnection(URL, USER, PASS);
		if (conexion != null){
			System.out.print("Conexion establecida...");
			return conexion;
		}
		return null;
	}
}