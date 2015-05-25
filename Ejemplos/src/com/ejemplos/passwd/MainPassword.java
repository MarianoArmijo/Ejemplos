package com.ejemplos.passwd;

public class MainPassword {

	public static void main(String[] args) {
		
		boolean hastapwok = false;
		
		/**
		 * 
		 * Creamos un bucle do-wile para solicitar la 
		 * contrase�a cada vez que no sea v�lida.
		 * 
		 */
		
		do {
		
		/**
		 * A�adimos los atributos de la clase
		 * Login que son los que vaos a usar.
		 */
		String password;

		/**
		 * Solicitamos el m�todo pedirClave() de la clase
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
					System.out.println("Su contrase�a es buena.");
					pass.mostrar();
					hastapwok = true;
					}
							
					else {
						System.out.println("Su contrae�a es mala, no contiene n�meros.");
						}
				}
					
						
				else {
					System.out.println("Su contrae�a es mala, no contiene may�sculas.");
					}
			}
			else {
				System.out.println("Su contrae�a es mala, no contiene 8 caracteres.");
				}
			
		} while (hastapwok != true);
	}

}

	
