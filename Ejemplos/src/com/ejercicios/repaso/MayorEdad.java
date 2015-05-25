package com.ejercicios.repaso;

import java.util.Scanner;

public class MayorEdad {
	
	private static int mayoredad = 18;
	private static int edad;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		edad = sc.nextInt();
		
		if (edad >= mayoredad) {
			
			System.out.println("Eres mayor de edad, tienes "+edad+" años.");
		}
		else {
			
			System.out.println("Eres menor de edad, tienes "+edad+" años.");
		}
	}
}
