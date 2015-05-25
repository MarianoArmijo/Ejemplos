package com.ejemplo.personamejorado;

//Definimos la clase Persona
public class Persona {
	
	//Definimos los atributos de la clase
	
	private String nombre;
	private int edad;
	
	//Sirve para hacer constantes (que no varian)
	static final byte MAYOR_EDAD = 18;
	
	/**
	 * Construcci�n de la clase que escribe dos par�metros 
	 * 
	 * @param nombre Indica el par�metro "nombre" que es el que manda al main
	 * @param edad Indica el par�metro "edad" que es el que manda al main
	 */
	
	/**
	 *
	 * Creamos una sobrecarga para cambiar su funci�n en relaci�n en sus atributos
	 * 
	 */

	
	public Persona(String nombre, int i) {
		
		this.setNombre(nombre);// El this hace referencia al atributo de la clase
		this.setEdad(i);

	}
	/**El m�todo Persona() sin par�metros coger�a los par�metros por defecto definidos
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
	
	
	//Sobreescribir es cuando un hijo da una versi�n propia da la version del padre
	
	//Llamamos al m�todo equals del m�todo de persona
	//super hace referencia a la clase padre de la clase hija
	@Override
	public boolean equals(Object obj) {
		
		boolean parentesco = false;
		Persona personarecogida = null;
		
		//Antes de hacer el casting hay que preguntar por el 
		//tipo de objeto de la clase
		if (obj instanceof Persona) {
			
			//Creaci�n de casting
			personarecogida = (Persona) obj;

		}
		
		//Despues creamos la comparaci�n
		if (this.getNombre().equals(personarecogida.getNombre()) && (this.getEdad() == personarecogida.getEdad()))
		{
			parentesco = true;
		}
		else {
			parentesco = false;
		}
		
//		Comparaci�n avanzada		
//		dev = (null != obj) && ((obj == this) || ((null != (personarecogida = estipopersona)(obj))) && (contienelomismo(this,personarecogida))));
//		{
//			dev = true;
//		}
//		return dev;
		
		return parentesco;
	}
	
	
	//toString es el m�todo que sirve para mostrar el objeto, una vez definido 
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
	 * M�todos para incrementar la edad.
	 */
	
	//M�todo 1.
	public static Persona sumarA�osObjetoNuevo (Persona p, int edad) {
		
		Persona p2 = new Persona(p.getNombre(), p.getEdad() + edad);
		
		return p2;
	}
	//M�todo 2.
	public void sumarA�osMetodoThis(int edad) {
		
		this.setEdad(this.getEdad() + edad);
	}
	//M�todo 3.
	public static void sumarA�osMismoObjeto(Persona p, int edad) {
		
		p.setEdad(p.getEdad() + edad);
	}
}