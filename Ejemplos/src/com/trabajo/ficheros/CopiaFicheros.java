package com.trabajo.ficheros;

import java.io.*;

public class CopiaFicheros {
	
	public static void main(String[] args) throws IOException {
		
	    long tiempo_inicio = System.currentTimeMillis();
		
		FileInputStream entrada = new FileInputStream(new File("Archivos\\1.jpg"));
		FileOutputStream salida = new FileOutputStream(new File("Archivos\\2.jpg"));
		
		int dato = 0;
		
		while ((dato = entrada.read()) != -1 ) {
			
		salida.write(dato);
		}
		
			entrada.close();
			salida.close();
			
		long tiempo_final = System.currentTimeMillis();

		System.out.println("Duración "+( tiempo_final - tiempo_inicio )+" milisegundos.");
	}


}

//Metodo para copiar con File (solo archivos de texto).

//File ficheroEntrada = new File("Archivos\\test.txt");
//File ficheroSalida = new File("Archivos\\test2.txt");
//
//FileReader entrada = new FileReader(ficheroEntrada);
//
//File f = new File(dir);
//
//FileWriter salida = new FileWriter(ficheroSalida);
//	
//int dato;
//	
//	while ((dato = entrada.read()) != -1 ) {
//		
//	salida.write(dato);
//	
//	entrada.close();
//	salida.close();