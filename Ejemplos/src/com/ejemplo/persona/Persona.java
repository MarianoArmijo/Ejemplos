package com.ejemplo.persona;

//Definimos la clase Persona
public class Persona {
	
	//Definimos dos atributos de la clase
	
	private String nombre;
	private byte edad;
	static int numeropersonas = 0;
	
	/**
	 * Contrucción de la clase que escribe dos parámetros 
	 * 
	 * @param nombre Indica el parámetro "nombre" que es el que manda al main
	 * @param edad Indica el parámetro "edad" que es el que manda al main
	 */
	
	/**
	 *
	 * Creamos una sobrecarga para cambiar su función en relación en sus atributos
	 * 
	 */
	public Persona(String nombre, byte edad) {
		
		this.nombre = nombre;// El this hace referencia al atributo de la clase
		this.edad = edad;

	}
	public Persona(){}
	
	public boolean esMayorDeEdad() {
		
		boolean esmayor = false;
		if (this.edad >17){
			
			esmayor = true;
			System.out.println("Eres mayor de edad");
		}
		else esmayor = false;
		System.out.println("Eres menor de edad");
		
		return esmayor;
	}
	
	
	public void Mostrar(){
		
		System.out.println("Su nombre es:"); 
		System.out.println(this.nombre);
		System.out.println("Su edad es:");
		System.out.println(this.edad);
		
	}
	
}