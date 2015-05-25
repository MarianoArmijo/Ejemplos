package com.trabajo.ficheros;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión 
 *recursiva
 *
 */
public class Palindroma {
	
	/**
	 */
	private static boolean compararCaracteres (String cad) {
		
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		return bd;
	}
	
	private static boolean iguales (String cad) { 
		
		boolean bl = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		do{
			if 	(cad.charAt(i) == cad.charAt(j)) {

				bl = true;
				
				i++;
				j--;
			
			}
		}while((bl)&&(i<=j));
		
		return bl;
	}
	
	private static boolean alReves (String cad) {
		
		boolean bl = false;
		
		
		
		return bl;
	}
	
	public static void main(String[] args) {
		
		if (compararCaracteres("sadas"))
		{
			System.out.println("Método compararCaracteres = verdadero.");
		} else 
		{
			System.out.println("Método compararCaracteres = falso.");
		}
		
		if (iguales("larutanatural"))
		{
			System.out.println("Método iguales = verdadero.");
		}else {
			System.out.println("Método iguales = falso.");
		}
		
		if (iguales("larutanatural"))
		{
			System.out.println("Método alReves = verdadero.");
		}else {
			System.out.println("Método alReves = falso.");
		}
		
	}
}