package com.bbdd.empleados.dao_dto;

public class InstruccionesSQL {
	
	public static String consultaSueldo(){

		return "select * from HR.EMPLOYEES where salary > 3000 order by salary DESC";
	}
}
