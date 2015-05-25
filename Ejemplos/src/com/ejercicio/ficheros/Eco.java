package com.ejercicio.ficheros;

import java.io.*;

public class Eco {
	public static void main (String[] args) {
		
		BufferedReader entradaEstandar = new BufferedReader
				
		(new InputStreamReader(System.in));
		
		String mensaje = null;
		
		System.out.println ("Introducir una línea de texto:");
		
		try {
			
			mensaje = entradaEstandar.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println ("Introducido: \"" + mensaje + "\"");
	}
}