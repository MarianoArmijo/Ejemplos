package com.ejemplo.personamejorado;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * El polimorfismo es la capacidad de java en tiempo de 
		 * ejecuci�n de identificar el subtipo m�s concreto de 
		 * clase e invocar al m�todo correspondiente.
		 */
		Persona p = null;
		p = new Alumno("Juan", (byte) 23, 10);
		p.toString();//Llama al objeto de Alumno.
	}
	
}
