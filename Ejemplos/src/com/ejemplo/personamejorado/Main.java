package com.ejemplo.personamejorado;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * El polimorfismo es la capacidad de java en tiempo de 
		 * ejecución de identificar el subtipo más concreto de 
		 * clase e invocar al método correspondiente.
		 */
		Persona p = null;
		p = new Alumno("Juan", (byte) 23, 10);
		p.toString();//Llama al objeto de Alumno.
	}
	
}
