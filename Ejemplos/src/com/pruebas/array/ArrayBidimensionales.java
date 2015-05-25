package com.pruebas.array;

public class ArrayBidimensionales {

	/**
	 * Iniciamos el array con la dimensión que queramos.
	 * 	static String [][] gente = new String [10][20];
	 */
	
	static String [][] gente = {{"Jessica", "Peter"},{"Paco"}};
	static String array = null;
	
	public static void main(String[] args) {
		
		/**
		 * Tenemos dos referencias que apuntan al mismo sitio.
		 */
		
		array = gente [0][0];
		System.out.println(array);
		
	}
	
}
