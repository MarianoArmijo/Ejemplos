package evaluacion.primera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	/** Defino los atributos de la clase de forma privada ya que solo 
	 * quiero que se vean en la propia clase.
	*/
	private static Connection conn = null;
	private static Statement stmt = null;
	
	// Registro el driver.
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	
	// Defino el host y el puerto de la conexión a la BBDD.
	private static final String conexion = "jdbc:oracle:thin:@localhost:1521:xe";
	
	// En este método creo la conexion a la BBDD.
	public static Statement conectarBBDD() throws SQLException, ClassNotFoundException {
		
		//Atributos del método
		Statement stmt = null;
		Class.forName(driver);
		
		// Establezco la conexión a la BBDD
		Connection conn = DriverManager.getConnection(conexion, PedirDatos.pedirUsuario(), PedirDatos.pedirContraseña());
		
		//Cojo la conexión 
	    stmt = conn.createStatement();
		
		return stmt;
	}
	
	// Libero los recursos para que no ocupen memoria.
	public static void LiberarRecursos(){
		if (stmt != null) {
			
			try {	
				
				stmt.close(); 
			} 
			
			catch (Exception e2) { 
				
				e2.printStackTrace(); 
			}
		}
		
		if (conn != null) {
			
			try { 
				
				conn.close(); 
			}
			
			catch (Exception e3) {
				
				e3.printStackTrace();
			}
		}
	}
}
