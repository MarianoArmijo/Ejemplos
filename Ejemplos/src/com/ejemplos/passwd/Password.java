package com.ejemplos.passwd;

public class Password {

	/**
	 * Atributos.
	 */
	private String password;
	
	public enum Fortaleza_Password {DEBIL, MEDIA, FUERTE}
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param password
	 */
	public Password(String password) {

		this.password = password;
	}

	/**
	 * Método que comprueba la seguridad de la contraseña.
	 * 
	 * @return
	 */

	public boolean esPasswordBuena() {

		boolean clave = false;
		int longitud = this.password.length();

		/**
		 * Recorrer una cadena
		 */

		if (longitud >= 8) {
			clave = true;
		} else {
			clave = false;
		}
		return clave;
	}
	
	public boolean esPasswordMayus() {
		boolean clave = false;
		int longitud = this.password.length();

		/**
		 * 
		 * Recorrer una cadena.
		 */
		for (int i = 0; (i < longitud)&&(clave == false); i++) {
			if(Character.isUpperCase(this.password.charAt(i))) {
				clave = true ;
			}
			else {
				clave = false;
			}
		}
		return clave;
	}
	
	public boolean esPasswordNum() {
		boolean clave = false;
		int longitud = this.password.length();
		
		/**
		 * 
		 * Recorrer una cadena
		 */

		for (int i = 0;(i < longitud)&&(clave == false); i++) {
			if(Character.isDigit(this.password.charAt(i))) {
				clave = true ;
			}
			else {
				clave = false;
			}
		}
		return clave;
	}

	/**
	 * Método que muestra en pantalla la validez del usuario.
	 */
	public void mostrar() {

		System.out.println("La longitud de su contraseña es de "
				+ this.password.length() + " caracteres.");
		System.out.println("Su password es " + password);

	}
}
