package com.especial.bucles;

public class Switch {

	int tama�o = this.palabra_clave.length();
	Tipo_fortaleza tf;
	String palabra_clave;
	public enum Tipo_fortaleza {DEBIL, MEDIA, FUERTE}{
	
	switch (tama�o) {
		
	case 1:
	case 2: tf = Tipo_fortaleza.DEBIL;
	break;
	default: tf = Tipo_fortaleza.FUERTE;
	break;
	}
	
}
}