/**
/* Programa que compara cuantas veces se repite el último caracter.
 */

package com.pruebas.array;

public class MainComprobarChar {

	public static void main(String[] args) {
		
		String cadena = "cadena"; 
		char ch = 'a';
		
			if (cadena.indexOf(ch) != -1) 
			{
				System.out.println("El caracter "+ch+" se encuentra en la cadena.");
				}
			else {
				
				System.out.println("El caracter "+ch+" no se encuentra en la cadena.");
			}
	}
	
}
