package com.ejemplo.personamejorado;

public class MainSumaEdad {

	static Persona p = new Persona("Mariano", 20);
	
	
	public static void main(String[] args) {
		
		//Llamada al m�todo sumarA�osPersonaNueva "M�todo 1."
		Persona p3 = Persona.sumarA�osObjetoNuevo(p, 14);
		System.out.println("M�todo1 "+p3);
		
		//Llamada al m�todo sumarA�osMetodoThis "M�todo 2."
		p.sumarA�osMetodoThis(24);
		System.out.println("M�todo2 "+p);
		
		//Llamada al m�todo sumarA�osMismoObjeto paso por refencia "M�todo 3."
		Persona.sumarA�osMismoObjeto(p3, 2);
		System.out.println("M�todo3 "+p3);
		
	}
}
