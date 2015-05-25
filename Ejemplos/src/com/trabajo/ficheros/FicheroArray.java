package com.trabajo.ficheros;

import java.io.*;

public class FicheroArray {
	
	static String dir = "Archivos\\test.txt"; 
	
	public static int ficheroContar(String contar) throws IOException {
		int contador = 0;
		BufferedReader br =	new BufferedReader(new FileReader(contar));
		
			String linea = null;
			//leer fichero.
			while((linea = br.readLine()) != null) {
				contador++;
				}
			
			br.close();
		return contador;
	}
	
	public static String[] ficheroToArray(String Archivo) throws IOException {
		
		BufferedReader br =	new BufferedReader(new FileReader(Archivo));
		String[] arrays = new String[ficheroContar(Archivo)];
		
		String linea = null;

		int posicion = 0;
		
			//leer fichero.
			while((linea = br.readLine()) != null) {
				
				arrays[posicion] = linea;
				posicion++;
			}
			
			br.close();
		
		return arrays;
	}
	
	public static void main(String[] args) throws IOException {
		
		String[] array = ficheroToArray(dir);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
			
			
		}
		
	}
}	