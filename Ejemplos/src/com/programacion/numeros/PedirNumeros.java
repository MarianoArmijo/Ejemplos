package com.programacion.numeros;

import java.util.Scanner;

public class PedirNumeros {
	
	static int pedirNumeros() {
	
	int numeros = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un número");
	numeros = sc.nextInt();
	
	return numeros;

	}
}