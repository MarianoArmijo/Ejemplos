package com.especial.bucles;

public class Switch {

	int tamaño = this.palabra_clave.length();
	Tipo_fortaleza tf;
	String palabra_clave;
	public enum Tipo_fortaleza {DEBIL, MEDIA, FUERTE}{
	
	switch (tamaño) {
		
	case 1:
	case 2: tf = Tipo_fortaleza.DEBIL;
	break;
	default: tf = Tipo_fortaleza.FUERTE;
	break;
	}
	
}
}