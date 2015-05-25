package com.pruebas.array;

public class Array {
	
	/**
	 *Creamos un array y lo inicializamos en memoria. 
	 */
	
//	static int [] array_enteros = new int [10];
	
	/**
	 *Inicializamos un array con valores definiddos. 
	 */
	
	static int [] array = {10, 15, 20};
	
	static int aux = 0;
	
	public static void main(String[] args) {
		
		/**
		 * En este caso el array dice que longitud tiene.
		 */
		
		for (int i = 0; i < array.length; i++)		
		{
			
			aux = array [i];
			System.out.println(aux);
			
		}
	}
	
}
