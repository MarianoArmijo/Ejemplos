package com.ejemplos.passwd;

public class MainPassword {

	public static void main(String[] args) {
		
		boolean hastapwok = false;
		
		/**
		 * 
		 * Creamos un bucle do-wile para solicitar la 
		 * contraseña cada vez que no sea válida.
		 * 
		 */
		
		do {
		
		/**
		 * Añadimos los atributos de la clase
		 * Login que son los que vaos a usar.
		 */
		String password;

		/**
		 * Solicitamos el método pedirClave() de la clase
		 * SolicitarLogin
		 */
		password = SolicitarLogin.pedirClave();
		
		/**
		 * Creamos el objeto.
		 */
		Password pass = null;
		pass = new Password(password);
		
			if (pass.esPasswordBuena() == true) {
				
				if (pass.esPasswordMayus() == true) {
					
					if (pass.esPasswordNum() == true) {
					System.out.println("Su contraseña es buena.");
					pass.mostrar();
					hastapwok = true;
					}
							
					else {
						System.out.println("Su contraeña es mala, no contiene números.");
						}
				}
					
						
				else {
					System.out.println("Su contraeña es mala, no contiene mayúsculas.");
					}
			}
			else {
				System.out.println("Su contraeña es mala, no contiene 8 caracteres.");
				}
			
		} while (hastapwok != true);
	}

}

	
