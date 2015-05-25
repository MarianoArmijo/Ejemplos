package com.ejercicios.repaso;

public class CadenaInvertida {

	public static void main(String[] args) {
		
		String cadena = "Cadena al revés";
		String cadena_reves = "";
		
		for (int i = cadena.length()-1; i >= 0; i--) 
		{
			
		cadena_reves = cadena_reves + cadena.charAt(i);
		}
		System.out.println(cadena_reves);
	}
			
}

