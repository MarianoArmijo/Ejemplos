package com.ejercicios.repaso;

public class SumaRecursiva {

	static int tope = 99;
	static int cadena;
	
	public static void main(String[] args) {
		
			do{			
				
				cadena = cadena + 3;				
				System.out.println(cadena);
				
			}while (cadena < tope);
	}
}
