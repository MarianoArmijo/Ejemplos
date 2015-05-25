package com.ejemplo.personamejorado;

public class MainPersona {

	// UTILIZAR LOS METODOS QUE HAYAMOS CREADO EN EL NIVEL SUPERIOR
	public static void main(String[] args) {

		// Crear una variable de tipo persona y edad
		String nombre = null;
		byte edad = 0;
		int nota = 0;

		for (int contador = 1; contador < 2; contador++) {

			Alumno objeto1 = null;
			Persona objeto2 = null;
			// Persona objeto3 = null;

			// Pedir datos

			nombre = PedirDatos.pedirNombre();
			edad = PedirDatos.pedirEdad();
			// metodo pedir nota
			nota = PedirDatos.pedirNota();
			
			

			// Creamos el constructor que se llama como el nombre de la clase
			objeto1 = new Alumno(nombre, edad, nota);
			
			System.out.println(objeto1);
//			objeto1.mostrar();

			objeto2 = new Persona(nombre, edad);
			System.out.println("Uso de toString "+objeto2);
			
			// Comparativa de objetos
			// Apuntamos objeto3 a objeto1
//			Persona objeto3 = null;
//			objeto3 = new Persona(edad);
//			 objeto3.sumEdad(edad);
//			 System.out.println(objeto3);

			boolean parentesco = false;
			parentesco = objeto1.equals(objeto2);// Llamada al método equals
													// redefinido en la clase
													// persona
			if (parentesco == true) {
				System.out.println("Es igual");

			} else {
				System.out.println("No es igual");

			}

			if (objeto1.esMayorDeEdad()) {
				System.out.println("Eres mayor de edad");
			} else {
				System.out.println("Eres menor de edad");
			}
			
			
		}
		
	}
}
