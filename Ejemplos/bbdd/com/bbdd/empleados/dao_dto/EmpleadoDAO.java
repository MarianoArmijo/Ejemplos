package com.bbdd.empleados.dao_dto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EmpleadoDAO {
	//recuperar Todos() List<Empleados>
	private ResultSet rset;
	
	@SuppressWarnings("finally")
	public ArrayList<EmpleadoDTO> recuperarTodos() throws ClassNotFoundException,
			SQLException {
		ArrayList<EmpleadoDTO> arraylist = new ArrayList<EmpleadoDTO>();
		try {
			rset = Conexion.conectarBBDD().executeQuery(InstruccionesSQL.consultaSueldo());

			while (rset.next()) {
				String employee = rset.getString(1);
				String firstname = rset.getString(2);
				String lastname = rset.getString(3);
				String email = rset.getString(4);
				String phone = rset.getString(5);
				String hiredate = rset.getString(6);
				String job = rset.getString(7);
				String salary = rset.getString(8);
				String commission = rset.getString(9);
				String manager = rset.getString(10);
				String department = rset.getString(11);
				arraylist.add(new EmpleadoDTO( employee, firstname, lastname, email,
					 phone, hiredate, job, salary, commission, 
					 manager, department));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally // libero los recursos
		{
			if (rset != null) {
				try {
					rset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			Conexion.LiberarRecursos();
			return arraylist;
		}

	}
	
}