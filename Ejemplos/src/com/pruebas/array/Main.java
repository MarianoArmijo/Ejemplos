/**
 * Programa que compara que variable es mayor.
 */

package com.pruebas.array;

public class Main {

	public static void main(String[] args) {
		
		String straux = null;
		int lengthaux = 0;
		int posicion = 0;
		
		straux = args[0];
		lengthaux = straux.length();
		posicion = 0;
		
		for (int i = 0; i < args.length; i++){
			if (args[i].length() > lengthaux) {
				
				straux = args[i];
				lengthaux = args[i].length();
				posicion = i;
			}
			
				
		}
		
		System.out.println("Palabra más larga: "+straux);
		System.out.println("Posicón : "+posicion);
		
	}
	
}
