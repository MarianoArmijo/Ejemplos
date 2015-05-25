/**
 * Ejemplos de uso de parámetros por valor y referencia:
 */

package com.main.expontaneo;

public class MainPorValor {

	public static void porValor(int a) {
		
		a = a + 7;
	}
	public static void main(String[] args) {
		
		int a = 5;
		porValor(a);
		System.out.println(a);
	}
}
