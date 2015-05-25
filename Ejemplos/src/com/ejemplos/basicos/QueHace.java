package com.ejemplos.basicos;

import java.util.Scanner;

public class QueHace {

	int a;
	/**
	 * Por estar declarada aquí, fuera de cualquier método; a es un atributo de
	 * la clase. Por lo tanto, es accesible y visible desde todos los métodos de
	 * la clase, los objetos no comparten sus cambios tienen una copia propia
	 */
	static int b = 50;

	/**
	 * Al ser una variable static todos los objetos comparten la misma variable
	 * y sus cambios
	 * @param i 
	 */
	
	//Creamos una sobre carga
	QueHace(int i)
	{
		a = i;
	}
	
	public QueHace() {
			
	}
	
	void metodo() {
		System.out.println(a);
		a++; // equivalente --> a = a + 1;
	}

	public static void main(String args[]) {
		QueHace qh1 = null;
		QueHace qh2 = null;

		qh1 = new QueHace();
		qh2 = new QueHace();

		qh1.metodo();
		qh1.metodo();
		qh1.a = 33;
		qh1.metodo();
		System.out.println(qh1.a);
		System.out.println(qh1.b);
		qh1.b++;
		System.out.println(qh2.b);
		System.out.println(QueHace.b);
		

		String nombre;//Sirve para crear la variable nombre
		Scanner sc = new Scanner(System.in);/**Creamos un lector de la pantalla 
		con el que podemos introducir datos en el programa*/ 
		nombre = sc.next();/**A la variable le asignamos el objeto con el 
		contenido que tiene*/
		System.out.println(nombre);
		

		QueHace qh7 = null;
		qh7 = new QueHace();
		qh7 = new QueHace(7);
		System.out.println(qh7);		
	}

}
