package com.ejercicios.repaso;

public class EncriptarCadena {
	
	public static void main(String[] args) {
		
		String cadena = "Cripto";
		String cadena_cript = "";
		
		for (int i = cadena.length()-1; i >= 0; i--) 
		{
			
		cadena_cript = cadena_cript + cadena.charAt(i);
		}
		System.out.println(cadena_cript);
	}
}
