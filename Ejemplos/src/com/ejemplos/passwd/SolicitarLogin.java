package com.ejemplos.passwd;

import java.util.Scanner;

public class SolicitarLogin {

	public static String pedirClave() {
		
		String password;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la contraseña.");
		password = sc.next();
		
		return password;
		
	} 
	
}
