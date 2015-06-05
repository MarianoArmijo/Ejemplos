package evaluacion.primera;

import java.util.Scanner;

public class PedirDatos {

	/**
	 * Creamos los métodos pedirNombre y pedirContraseña
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
		
	public static String pedirContraseña() {
		
		String contraseña;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una contraseña.");
		contraseña = sc.next();
		
		return contraseña;
	}
	
}
