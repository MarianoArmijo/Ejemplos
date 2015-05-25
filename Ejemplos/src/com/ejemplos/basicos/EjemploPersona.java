package com.ejemplos.basicos;

import java.util.Scanner;

public class EjemploPersona {

	public static void main(String[] args) {

		String nombre;// Sirve para crear la variable nombre
		Scanner name = new Scanner(System.in);
		/**
		 * Creamos un lector de la pantalla con el que podemos introducir datos
		 * en el programa
		 */
		nombre = name.next();
		/**
		 * A la variable le asignamos el objeto con el contenido que tiene
		 */
		System.out.println(nombre);

		byte edad;
		Scanner age = new Scanner(System.in);
		edad = age.nextByte();
		System.out.print(edad);

	}
}