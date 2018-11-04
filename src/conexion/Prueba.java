package conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class Prueba {

	public static void main(String[] args) {
		
		try {
			Connection con = Conexion.crearConexion();
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}