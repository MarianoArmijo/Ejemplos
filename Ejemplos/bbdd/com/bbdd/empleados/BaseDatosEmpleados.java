package com.bbdd.empleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseDatosEmpleados {
	
	
	private static Scanner sc1;
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		ArrayList<Empleados> arraylist = new ArrayList<Empleados>();
		
		
		try
		{
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("ACCESO A LA BASE DE DATOS:"+"\n");
			
			sc = new Scanner(System.in);
			System.out.println("Introduce un nombre");
			String nombre = sc.next();
			
			sc1 = new Scanner(System.in);
			System.out.println("Introduce una contraseña");
			String contraseña = sc1.next();
			//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			
			//Realizamos la conexión con DriverManager "jdbc:oracle:thin:" se deja por defecto
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", nombre, contraseña);
			
			//Cojo la conexión 
  	        stmt = conn.createStatement();
  	        
  	        //Ejecuto la consuta
			rset = stmt.executeQuery("select * from HR.EMPLOYEES where salary > 3000 order by salary DESC");
			
			// La consulta recoge un result set.
			while (rset.next()) {
				
				Empleados empleado = new Empleados(rset.getString(1), rset.getString(2), 
						rset.getString(3), rset.getString(4), rset.getString(5), 
						rset.getString(6), rset.getString(7), rset.getString(8), 
						rset.getString(9), rset.getString(10), rset.getString(11));
				
				arraylist.add(empleado);
			}
			System.out.println(arraylist);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
		}  


	}

}

