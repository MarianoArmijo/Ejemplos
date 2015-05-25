package com.clase.ejemplos;
import java.io.*;

public class ArrayFichero {
	
	static String[] array = {"hola animal"};

	public static void main(String[] args) throws IOException {
		
		File file = new File("Archivos\\test2.txt");
		
		// Si el fichero no existe lo creamos.
		if (!file.exists()) {
			file.createNewFile();
		}

		BufferedWriter br =	new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
		
		for (int i = 0; i < array.length; i++) {
		
			br.write(array[i]);
		    }
		
		br.close();
		
		System.out.println("Se ha escrito correctamente el archivo.");
				
	}
}
