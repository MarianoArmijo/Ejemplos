package com.ejemplo.personamejorado;

//Definimos la clase Persona
public class Persona {
	
	//Definimos los atributos de la clase
	
	private String nombre;
	private int edad;
	
	//Sirve para hacer constantes (que no varian)
	static final byte MAYOR_EDAD = 18;
	
	/**
	 * Construcción de la clase que escribe dos parámetros 
	 * 
	 * @param nombre Indica el parámetro "nombre" que es el que manda al main
	 * @param edad Indica el parámetro "edad" que es el que manda al main
	 */
	
	/**
	 *
	 * Creamos una sobrecarga para cambiar su función en relación en sus atributos
	 * 
	 */

	
	public Persona(String nombre, int i) {
		
		this.setNombre(nombre);// El this hace referencia al atributo de la clase
		this.setEdad(i);

	}
	/**El método Persona() sin parámetros cogería los parámetros por defecto definidos
	*en los atributos de la clase*/
	public Persona(){}
	
	public boolean esMayorDeEdad() {
		
		boolean esmayor = false;
		if (this.getEdad() > MAYOR_EDAD){
			
			esmayor = true;
			
		}
		else esmayor = false;
		
		return esmayor;
	}
	
	
	//Sobreescribir es cuando un hijo da una versión propia da la version del padre
	
	//Llamamos al método equals del método de persona
	//super hace referencia a la clase padre de la clase hija
	@Override
	public boolean equals(Object obj) {
		
		boolean parentesco = false;
		Persona personarecogida = null;
		
		//Antes de hacer el casting hay que preguntar por el 
		//tipo de objeto de la clase
		if (obj instanceof Persona) {
			
			//Creación de casting
			personarecogida = (Persona) obj;

		}
		
		//Despues creamos la comparación
		if (this.getNombre().equals(personarecogida.getNombre()) && (this.getEdad() == personarecogida.getEdad()))
		{
			parentesco = true;
		}
		else {
			parentesco = false;
		}
		
//		Comparación avanzada		
//		dev = (null != obj) && ((obj == this) || ((null != (personarecogida = estipopersona)(obj))) && (contienelomismo(this,personarecogida))));
//		{
//			dev = true;
//		}
//		return dev;
		
		return parentesco;
	}
	
	
	//toString es el método que sirve para mostrar el objeto, una vez definido 
	//te muestra el contenido del objeto.
	@Override
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
	public void setEdad(int i) {
		this.edad = i;
	}
	
	public void mostrar(){
		
		System.out.println("Su nombre es: "+this.getNombre());
		System.out.println("Su edad es: "+this.getEdad());
		
	}

	/**
	 * Métodos para incrementar la edad.
	 */
	
	//Método 1.
	public static Persona sumarAñosObjetoNuevo (Persona p, int edad) {
		
		Persona p2 = new Persona(p.getNombre(), p.getEdad() + edad);
		
		return p2;
	}
	//Método 2.
	public void sumarAñosMetodoThis(int edad) {
		
		this.setEdad(this.getEdad() + edad);
	}
	//Método 3.
	public static void sumarAñosMismoObjeto(Persona p, int edad) {
		
		p.setEdad(p.getEdad() + edad);
	}
}