/**
 * Ejemplos de uso de par�metros por valor y referencia:
 */

package com.main.expontaneo;

public class Main {

	private static int suma(int a, int b, int suma) {

		suma = a + b;
		return suma;
	}
	
	public static void main(String [] args) {
		
		int c = 0;
		
		c = suma(8, 7, c);
		System.out.println(c);
	}
}
