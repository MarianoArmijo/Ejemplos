package com.ejercicios.repaso;

import java.util.Scanner;

public class ParImpar {
	
	private static int num;
	private static int resto;
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un n�mero: ");
		num = sc.nextInt();
		
		resto = num % 2;
			
			if (resto == 0) {
				
				System.out.println("El n�mero "+num+" es par.");
			}
			else {System.out.println("El n�mero "+num+" es impar.");}
			
			
	}
}

