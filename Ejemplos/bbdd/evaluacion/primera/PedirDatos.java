package evaluacion.primera;

import java.util.Scanner;

public class PedirDatos {

	/**
	 * Creamos los m�todos pedirNombre y pedirContrase�a
	 * 
	 * El return devuelve la entrada de Scanner
	 * 
	 */
	
	public static String pedirUsuario() {
		
		String nombre;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		nombre = sc.next();
		
		return nombre;
	} 
		
	public static String pedirContrase�a() {
		
		String contrase�a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una contrase�a.");
		contrase�a = sc.next();
		
		return contrase�a;
	}
	
}
