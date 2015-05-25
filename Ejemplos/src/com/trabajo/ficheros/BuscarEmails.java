package com.trabajo.ficheros;

import java.util.*;
import java.io.*;
import java.lang.management.GarbageCollectorMXBean;

public class BuscarEmails {

	static String dir = "Archivos\\ficheros.txt"; 

	
	public static int ficheroContar(String contar) throws IOException {
		int contador = 0;
		BufferedReader br =	new BufferedReader(new FileReader(contar));
		
			String linea = null;
			//leer fichero.
			while((linea = br.readLine()) != null) {
				if(linea.contains("***")&&linea.contains("///")) {
					contador++;
				}
			}
			
			br.close();
		return contador;
	}
	
	public static String[] extraerEmails(String archivo) throws IOException {
			
		BufferedReader br =	new BufferedReader(new FileReader(archivo));
		String linea = null;
		String[] arrays = new String[ficheroContar(archivo)];
		int posicion = 0;
		
			//leer fichero.
		while((linea = br.readLine()) != null) {
				
		    int asteriscos = linea.indexOf("***");
		    int barras = linea.indexOf("///");
		    
		    if((asteriscos != -1)&&(barras != -1)){
		    
		    	String res = linea.substring(asteriscos+3, barras);
		    	arrays[posicion] = res;
		    	
				posicion++;
	   		}
		}
			
		br.close();
		
		return arrays;
		}
	
	
	public static void main(String[] args) throws Exception{
		  
		long tiempo_inicio = System.currentTimeMillis();
		
		/**Para obtener el recolector de basura, podemos acceder a 
		 * través de la clase Runtime, pudiendo ordenar su ejecución.
		*/
		
		String[] array = extraerEmails(dir);
		
		//Método para ordenar los emails.
	    Arrays.sort(array);
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
				
		Runtime rt = Runtime.getRuntime();
		rt.gc(); //Solicitamos su ejecución.
				
		long tiempo_final = System.currentTimeMillis();
		
		
		rt.freeMemory();

		System.out.println("Duración "+( tiempo_final - tiempo_inicio )+" milisegundos.");		
				
		}
	}
}

