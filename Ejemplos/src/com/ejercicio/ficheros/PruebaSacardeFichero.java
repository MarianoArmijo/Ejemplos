package com.ejercicio.ficheros;

public class PruebaSacardeFichero {

	public static void main(String[] args) {
	    String cadena = "d***ks@gsf.ds///ow0";
	    
	    int asteriscos = cadena.indexOf("***");
	    int barras = cadena.indexOf("///");
	    
	    String res = cadena.substring(asteriscos+3, barras);
	    
	    System.out.println("El email es "+res);
	}
	
}
