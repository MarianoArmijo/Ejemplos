/**
 * Recoger por argumentos un idioma, dependiendo del idioma hay que crear un fichero
 * de salida, con la clase Properties, que muestre en contenido del archivo .properties
 */

package com.archivo.propiedades;

import java.io.*;
import java.util.*;

public class MainFicheroProperties {

	static String idioma = null;
	static Properties prop = new Properties();
	
	/**
	 *Creo un método que me pide que introduzca un idioma por teclado y lo
	 *almacena en un String.
	 */
	
	static String pedirIdioma() {
		
		String idioma = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce: en para Inglés, es para Español, it para Italiano.");
		idioma = sc.next();
		
		return idioma;
		
	} 
	
	private static String elegirIdioma(String idioma) {
		
		switch(idioma) {
			case "en": idioma = "story_en" ;
			break;
			case "es": idioma = "story_es";
			break;
			case "it": idioma = "story_it";
			break;
			default: System.out.println("Escoja un idioma correcto.");

		}
		return idioma;
		
	}
	 
	private static void asignarValoresObjeto (String idioma) throws IOException {
		
		BufferedInputStream br = new BufferedInputStream(new FileInputStream("Archivos\\"+idioma+".properties"));
		prop.load(br);
		br.close();

	}

	private static void escribirFichero() throws IOException {
		
		// Obtener los valores property para inicializarlos.
		
		String outfile = prop.getProperty("outfile");
		String start = prop.getProperty("start");
		String body = prop.getProperty("body");
		String end = prop.getProperty("end");
		
		File file = new File("Archivos\\"+outfile);
		file.createNewFile();
		
		FileWriter fw  = new FileWriter(file);
		
		fw.write(start+"\r\n"+body+"\r\n"+end);
		
		fw.close();
	}
		 
	public static void main(String[] args) throws IOException {
		
		idioma =  pedirIdioma();
		
		idioma = elegirIdioma(idioma);
		
		asignarValoresObjeto(idioma);
		
		escribirFichero();
		
		System.out.println("Se ha creado el fichero con éxito.");
		
	}
}
