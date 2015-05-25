package com.serializacion.persona;

import java.io.*;

public class MainObjectArray {

		static String dir = "serializacion\\Objetos.dat";
		
		private static PersonaSerializada persona1 = new PersonaSerializada("Álvaro", 22);
		private static PersonaSerializada persona2 = new PersonaSerializada("Borja", 21);
		private static PersonaSerializada persona3 = new PersonaSerializada("Carlos", 20);
		
		private static PersonaSerializada[] array_personas = {persona1, persona2, persona3};
		
		
		private static PersonaSerializada persona1_vacia = new PersonaSerializada();
		private static PersonaSerializada persona2_vacia = new PersonaSerializada();
		private static PersonaSerializada persona3_vacia = new PersonaSerializada();
		
		private static PersonaSerializada[] array_personas_vacias = {persona1_vacia, persona2_vacia, persona3_vacia};
		
		public static void main(String[] args) throws IOException, Exception {
			

			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(dir));
			salida.writeObject (array_personas); 
			salida.close();
			
			ObjectInputStream entrada = new ObjectInputStream (new FileInputStream(dir));
			array_personas_vacias = (PersonaSerializada[])entrada.readObject();
			entrada.close();
			
			for(int i=0;i<array_personas_vacias.length;i++) {
				
				System.out.println(array_personas_vacias[i]);
				
				
			}
		}
}

	
