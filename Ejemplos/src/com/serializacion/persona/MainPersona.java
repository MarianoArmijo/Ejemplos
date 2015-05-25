package com.serializacion.persona;

import java.io.*;

public class MainPersona {
	
	static String dir = "serializacion\\Objetos.dat"; 
	
	//UTILIZAR LOS METODOS QUE HAYAMOS CREADO EN EL NIVEL SUPERIOR 
		public static void main(String[] args) throws IOException, Exception {
			
			PersonaSerializada persona1 = new PersonaSerializada("Angel", 22);
			PersonaSerializada persona2 = new PersonaSerializada("Borja", 21);
			PersonaSerializada persona3 = new PersonaSerializada("Carlos", 20);
			PersonaSerializada personavacia1 = new PersonaSerializada();
			
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(dir));
			salida.writeObject (persona1); 
			salida.writeObject (persona2); 
			salida.writeObject (persona3); 
			salida.close();
			
			ObjectInputStream entrada = new ObjectInputStream (new FileInputStream(dir));
			personavacia1 = (PersonaSerializada)entrada.readObject();
			entrada.close();
			
		}
}
