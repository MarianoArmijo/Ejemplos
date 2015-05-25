/**	
 * 
 * Programa que pide 3 números, te dice cual es el mayor y 
 * los ordena de mayor a menor
 * 
 */

package com.programacion.numeros.copy;

public class MainNumeros {
	
	public static void main(String[] args) {
	
		// Crear una variable de tipo int
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		
		//Declaramos los objetos
		Numeros objeto1 = null;
		
		// Pedir datos
		numero1 = PedirNumeros.pedirNumeros();
		numero2 = PedirNumeros.pedirNumeros();
		numero3 = PedirNumeros.pedirNumeros();
		
		// Creamos el constructor que se llama como el nombre de la clase
		objeto1 = new Numeros(numero1, numero2, numero3);
		
		//Imprimimos en pantalla los numeros
		objeto1.mostrar();

		//Diseñamos una sentencia if para comprobar que número es mayor
		if (numero1 > numero2) {
			if (numero2 > numero3) {
				
			System.out.print(numero1);
			System.out.println(" es el mayor");
			
			System.out.print("EL ORDEN DE LOS NÚMEROS DE MAYOR A MENOR ES: ");
			System.out.print(numero1);
			System.out.print(",");
			System.out.print(numero2);
			System.out.print(",");
			System.out.println(numero3);
			}
				
			else {
				
				if (numero1 > numero3) {
					
				System.out.print(numero1);
				System.out.println(" es el mayor");
				
				System.out.print("EL ORDEN DE LOS NÚMEROS DE MAYOR A MENOR ES: ");
				System.out.print(numero1);
				System.out.print(",");
				System.out.print(numero3);
				System.out.print(",");
				System.out.println(numero2);
				}
				
				else {				
				
				System.out.print(numero3);
				System.out.println(" es el mayor");
				
				System.out.print("EL ORDEN DE LOS NÚMEROS DE MAYOR A MENOR ES: ");
				System.out.print(numero3);
				System.out.print(",");
				System.out.print(numero1);
				System.out.print(",");
				System.out.println(numero2);
				}
			}	
		}	
			
		else {
			
			if (numero3 > numero1) {
				
				if (numero3 > numero2) {
			
				System.out.print(numero3);
				System.out.println(" es el mayor");
				
				System.out.print("EL ORDEN DE LOS NÚMEROS DE MAYOR A MENOR ES: ");
				System.out.print(numero3);
				System.out.print(",");
				System.out.print(numero2);
				System.out.print(",");
				System.out.println(numero1);
				}
			
				else{
					
				System.out.print(numero2);
				System.out.println(" es el mayor");
				
				System.out.print("EL ORDEN DE LOS NÚMEROS DE MAYOR A MENOR ES: ");
				System.out.print(numero2);
				System.out.print(",");
				System.out.print(numero3);
				System.out.print(",");
				System.out.println(numero1);
				}
			}	
				
			else{
			
			System.out.print(numero2);
			System.out.println(" es el mayor");
			
			System.out.print("EL ORDEN DE LOS NÚMEROS DE MAYOR A MENOR ES: ");
			System.out.print(numero2);
			System.out.print(",");
			System.out.print(numero1);
			System.out.print(",");
			System.out.println(numero3);
			}
		}	
	}
	
}