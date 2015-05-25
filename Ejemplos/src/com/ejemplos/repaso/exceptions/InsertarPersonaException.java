package com.ejemplos.repaso.exceptions;

import com.ejemplos.repaso.ListaPersonas;

public class InsertarPersonaException extends Exception{
	

	private static final long serialVersionUID = 1L;
	
	public static final String mensaje = "Numero de personas excecido. Máximo " + ListaPersonas.CAPACIDAD + " personas";
	

}
