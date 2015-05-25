package com.exceptions.array;

public class MainExceptions {

		private static Persona[] array_persona  = new Persona[2];
		private static Persona objeto_persona = new Persona();
		
		//Para poner un trows general (padre) hay que escribir Throwable seguidamente de throws
		public static void main(String[] args) throws PersonasExceptions { 
			
			try {
				
			array_persona[0] = objeto_persona;
			array_persona[1] = objeto_persona;
			array_persona[2] = objeto_persona;
			
			}

			catch(ArrayIndexOutOfBoundsException except) {
				
			throw new PersonasExceptions("Error, desbordamiento de array.");
			
			}
			
			finally {}
		}
}
