package com.ejercicios.repaso;

import java.util.Scanner;

public class Nota {

	private static int nota;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una nota: ");
		nota = sc.nextInt();
		
		
		switch (nota) {
		
		case 10: 
		case 9: System.out.println("Su nota es un "+nota+", SOBRESALIENTE.");
		break;
		case 8:
		case 7: System.out.println("Su nota es un "+nota+", NOTABLE.");
		break;
		case 6: System.out.println("Su nota es un "+nota+", BIEN.");
		break;
		case 5: System.out.println("Su nota es un "+nota+", SUFICIENTE.");
		break;
		case 4: System.out.println("Su nota es un "+nota+", SUSPENSO.");
		case 3:
		case 2:
		case 1:
		case 0: 
		break;
		default: System.out.println(nota+" NO_ES_NOTA_VALIDA");
		break;
			}
	}
}
