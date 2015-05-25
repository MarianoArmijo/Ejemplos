package com.ejemplo.personamejorado;

public class MainSumaEdad {

	static Persona p = new Persona("Mariano", 20);
	
	
	public static void main(String[] args) {
		
		//Llamada al método sumarAñosPersonaNueva "Método 1."
		Persona p3 = Persona.sumarAñosObjetoNuevo(p, 14);
		System.out.println("Método1 "+p3);
		
		//Llamada al método sumarAñosMetodoThis "Método 2."
		p.sumarAñosMetodoThis(24);
		System.out.println("Método2 "+p);
		
		//Llamada al método sumarAñosMismoObjeto paso por refencia "Método 3."
		Persona.sumarAñosMismoObjeto(p3, 2);
		System.out.println("Método3 "+p3);
		
	}
}
