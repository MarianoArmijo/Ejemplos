package com.trabajo.ficheros;

import java.io.*;

// Clase MainFile

public class MainFile {
	
	public static String separador = "|";

	static String dir = "Archivos";
	
		public static void listarDirectorio(String dir) {
			
			/**
			 * Sirve para listar los ficheros del directorio actual.
			 */
			
			File f = new File(dir);
			String[] ficheros = f.list();
			String dir2 = "";
		
			for (int i=0;i<ficheros.length;i++) {
				
				dir2 = dir+"\\"+ficheros[i];
				File f2 = new File(dir2);
				
				if(f2.isDirectory()) {
					
					System.out.println(separador+"=>"+ficheros[i]);
					separador = separador + ".";
					listarDirectorio(dir2);
				}
				else {
					System.out.println(separador+" "+ficheros[i]);
				}
			}
		}
	
	public static void main(String[] args) {
		

		MainFile.listarDirectorio(dir);
	}
	
}


//File[] ficheros = f.listFiles();
//for (int i = 0; i < ficheros.length; i++){
//  System.out.println(ficheros[i].getName());
//  
//	if (ficheros[i].isDirectory()) {
//		 System.out.println("Es un directorio, su contenido es: ");
//		 
//
//	}
//}
//}
