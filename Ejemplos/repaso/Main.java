package com.ejemplos.repaso;

import java.io.*;

import com.ejemplos.repaso.exceptions.InsertarPersonaException;

public class Main {

	public static void main(String[] args) throws InsertarPersonaException, IOException, ClassNotFoundException {

		
		ListaPersonas mostrarpersona = new ListaPersonas();
		Persona p = new Persona ("Mariano", 20);
		
		mostrarpersona.insertarPersona(p);
		mostrarpersona.mostrar();
		mostrarpersona.serializar();
		mostrarpersona.mostrar();
		mostrarpersona.insertarPersona(p);
	}

}
