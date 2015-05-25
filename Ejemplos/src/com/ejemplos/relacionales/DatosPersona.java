package com.ejemplos.relacionales;

public class DatosPersona {

	//UTILIZAR LOS METODOS EN UNA CLASE DISTINTA  
		public static void main(String[] args) {
			
			Persona nombre = null;
			nombre = new Persona();
			
			Persona edad = null;
			edad = new Persona(); 
			
			System.out.println(nombre.pedirNombre());
			System.out.println(edad.pedirEdad());
			
	}

}