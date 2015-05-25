package com.exceptions.array;

//Definimos la clase Persona como Serializable
public class Persona {
	
	//Definimos dos atributos de la clase
	
	private String nombre;
	private int edad;
	
	/**
	 *
	 * Creamos una sobrecarga para cambiar su función en relación en sus atributos
	 * 
	 */
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;// El this hace referencia al atributo de la clase
		this.edad = edad;

	}
	public Persona(){}
	
	public String toString() {
		String datos_persona = "Nombre: "+this.getNombre()+" Edad: "+this.getEdad();
		return datos_persona;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}