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
		Connection conn = null;

		Statement stmt = null;
		Class.forName(driver);
		conn = DriverManager.getConnection(conexion, PedirDatos.pedirUsuario(), PedirDatos.pedirContraseña());
		
		conn.setAutoCommit(false);
		Savepoint savepoint = conn.setSavepoint();
		conn.commit();
		
		stmt = conn.createStatement();
		
//		conn.rollback(savepoint);
		
		return stmt;
	}
	public static void LiberarRecursos(){
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
}
