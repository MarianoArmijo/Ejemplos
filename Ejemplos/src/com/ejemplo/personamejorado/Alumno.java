package com.ejemplo.personamejorado;

/**
 * Con extends decimos que Alumno es una subclase de 
 * la clase persona.
 * @author mariano
 *
 */
public class Alumno extends Persona{

	/**
	 * Creamos las variables
	 */
	
	int nota = 0;
	tiponota tn = null;
	
	/**
	 * Atributo de tipo enum.
	 */
	public enum tiponota {SOBRESALIENTE, NOTABLE, BIEN, SUFICIENTE, SUSPENSO, NO_ES_NOTA_VALIDA}
	
	private tiponota equivalente() {
		switch (nota) {
			
		case 10: 
		case 9: tn = tiponota.SOBRESALIENTE;
		break;
		case 8:
		case 7: tn = tiponota.NOTABLE;
		break;
		case 6: tn = tiponota.BIEN;
		break;
		case 5: tn = tiponota.SUFICIENTE;
		break;
		case 4: tn = tiponota.SUSPENSO;
		case 3:
		case 2:
		case 1:
		case 0: 
		break;
		default: tn = tiponota.NO_ES_NOTA_VALIDA;
		break;
			}
		return tn;
	}
	
	
	/**
	 * Llamamos al constructor del padre
	 * que es Persona, con los parámetros:
	 * @param nombre
	 * @param edad
	 */
	
	public Alumno(String nombre, byte edad) {
		
		super (nombre, edad);
		
	}
	
	public Alumno(String nombre, byte edad, int nota) {
		
		super (nombre, edad);
		this.nota = nota;
		this.tn = equivalente();
		
	}
	
	public String toString() {
		String datos_persona = "Nombre: "+this.getNombre()+"\nEdad: "+this.getEdad()+"\nNota: "+this.nota+"\nTipo nota:"+tn;
		return datos_persona;
	}

}