package com.programacion.numeros;

//Definimos la clase Numeros
public class Numeros {

	//Definimos el atributo numeros para la clase y le asignamos el valor 0
	private int numero1 = 0;
	private int numero2 = 0;
	private int numero3 = 0;
	
	//Creamos una sobre carga para definir un objeto
	//y la defino con el método que se llama igual que la clase.
	public Numeros(int numero1, int numero2, int numero3) {
		
		this.numero1 = numero1;// El this hace referencia al atributo de la clase
		this.numero2 = numero2;// El this hace referencia al atributo de la clase
		this.numero3 = numero3;// El this hace referencia al atributo de la clase
		
	}
	
	/**El método Numeros() sin parámetros coge los parámetros por defecto definidos
	*en los atributos de la clase
	*/
	public Numeros(){}
	
	public void mostrar(){
		
		System.out.print("SUS NÚMEROS SON: ");
		System.out.print(this.numero1);
		System.out.print(",");
		System.out.print(this.numero2);
		System.out.print(",");
		System.out.println(this.numero3);
		
	}
	
}
