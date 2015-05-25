package com.ejemplo.persona;

import java.util.Scanner;

public class MainPersona {
	
	
//	/**
//	 * Creamos los métodos pedirNombre y pedirEdad
//	 * 
//	 * El return devuelve la entrada de Scanner
//	 * @return 
//	 */
//	static String pedirNombre() {
//		
//		String nombre = null;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce un nombre");
//		nombre = sc.next();
//		
//		return nombre;
//		
//	} 
//		
//	static byte pedirEdad() {
//		
//		byte edad = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce una edad");
//		edad = sc.nextByte();
//		
//		return edad;
//		
//	}

	//UTILIZAR LOS METODOS QUE HAYAMOS CREADO EN EL NIVEL SUPERIOR 
		public static void main(String[] args) {
			
			//Crear una variable de tipo persona y edad
			String nombre = null;
			byte edad = 0;
			
//			nombre = pedirNombre();
//			edad = pedirEdad(); 
//			
//			Persona objeto1 = null;
//			Persona objeto2 = null;
//			
//			objeto1 = new Persona(nombre, edad);		
//			objeto2 = new Persona();
//			
//			objeto1.Mostrar();
//			objeto2.Mostrar();
			
	
			for(int contador = 1; contador<2; contador++) {
				
				Persona objeto1 = null;
				
//				Pedir datos
//				nombre = pedirNombre();
//				edad = pedirEdad();
				
				//Creamos el constructor que se llama como el nombre de la clase
				objeto1 = new Persona(nombre, edad);
				objeto1.Mostrar();
				objeto1.esMayorDeEdad();
			}
			
			
//			System.out.println(objeto.nombre );
//			System.out.println(objeto.edad);
	}
}
