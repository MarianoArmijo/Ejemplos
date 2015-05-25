package com.ejemplos.basicos;

public class SumaR {
	
	public int calcula()
	{
		return 1+1;
	}
	public static void main(String[] args)
	{
		int resultado = 0;//Se crea una nueva variable auxiliar de tipo int "resultado"
		
		SumaR suma = null; //Se crea un nuevo objeto que es de tipo clase "SumaR"
		suma = new SumaR();//Se crea el nuevo objeto en memoria
		
		resultado = suma.calcula();//La variable coge el valor del método calcula()
		System.out.println(resultado);//Imprime el resultado
	}
}
