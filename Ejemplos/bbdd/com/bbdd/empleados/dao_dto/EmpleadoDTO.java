package com.bbdd.empleados.dao_dto;

public class EmpleadoDTO {

	String employee;
	String firstname;
	String lastname;
	String email;
	String phone;
	String hiredate;
	String job; 
	String salary;
	String commission; 
	String manager; 
	String department;
	
	public EmpleadoDTO(String employee, String firstname, String lastname, String email,
			String phone, String hiredate, String job, String salary, String commission, 
			String manager, String department) {
	

		this.employee = employee;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.hiredate = hiredate;
		this.job = job;
		this.salary = salary;
		this.commission = commission;
		this.manager = manager;
		this.department = department;
	}

	@Override
	public String toString() {
		
	return "ID_Empleado: " + employee + ", Nombre: " + firstname
			+ ", Apellido: " + lastname + ", Trabajo: " + job
			+ ", Salario: " + salary + "\n";
	}
}
