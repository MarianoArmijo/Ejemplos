package com.ejemplos.basicos;

public class SumaObjeto {
	
	public int calcula()
	{
		return 1+1;
	}
	public static void main(String[] args)
	{
		SumaObjeto suma = null; //Desde una clase est�tica se crea un nuevo objeto
		suma = new SumaObjeto();//Los par�ntisis designan un m�todo
		suma.calcula();//Almacena el valor de calcula 
		System.out.println(suma.calcula());
	}
}
