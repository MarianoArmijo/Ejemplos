package com.ejemplos.relacionales;

import java.util.Scanner;

public class Persona {
	
	String pedirNombre() {
		
		String nombre = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		nombre = sc.next();
		
		return nombre;
		
	} 
		
	byte pedirEdad() {
		
		byte edad = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una edad");
		edad = sc.nextByte();
		
		return edad;
		
	}
}