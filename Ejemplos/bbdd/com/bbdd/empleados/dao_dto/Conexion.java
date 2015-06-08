package com.bbdd.empleados.dao_dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Conexion {

	private static Connection conn = null;
	private static Statement stmt = null;
	
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String conexion = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public static Statement conectarBBDD() throws SQLException, ClassNotFoundException {

		Statement stmt = null;
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(conexion, PedirDatos.pedirUsuario(), PedirDatos.pedirContraseña());
		
		// Establecemos AutoCommit a false esto internamente hace una copia de las instrucciones
		// que vamos a ejecutar.
		conn.setAutoCommit(false);
		conn.commit();

		Savepoint savepoint = conn.setSavepoint();
		
		if (conn != null) {
			
			try { 
				conn.rollback(savepoint); 

			}
			
			catch (Exception e3) {
				
				e3.printStackTrace();
			}
		}
		
		stmt = conn.createStatement();
		return stmt;
	}
	
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
