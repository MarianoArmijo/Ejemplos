package com.ejemplo.personamejorado;

import java.util.Scanner;

public class PedirDatos {

	/**
	 * Creamos los métodos pedirNombre y pedirEdad
	 * 
	 * El return devuelve la entrada de Scanner
	 * @return 
	 */
	static String pedirNombre() {
		
		String nombre = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		nombre = sc.next();
		
		return nombre;
		
	} 
		
	static byte pedirEdad() {
		
		byte edad = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una edad");
		edad = sc.nextByte();
		
		return edad;
		
	}
	
	public static int pedirNota() {
		
	int nota;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca la nota.");
	nota = sc.nextInt();

	return nota;
}
	
}
