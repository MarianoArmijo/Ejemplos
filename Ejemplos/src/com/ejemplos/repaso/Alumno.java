package com.ejemplos.repaso;

import com.ejemplos.repaso.exceptions.NotaException;

public class Alumno extends Persona{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int nota;
	private TipoNota nombre_nota; 
	
	
	public Alumno (String nombre, int edad, int nota) throws NotaException
	{
		super (nombre, edad);
		this.nota = nota;
		this.nombre_nota = TipoNota.traduceNota(nota);
		
	}


	public int getNota() {
		return nota;
	}


	public void setNota(int nota) {
		this.nota = nota;
	}


	public TipoNota getNombre_nota() {
		return nombre_nota;
	}


	public void setNombre_nota(TipoNota nombre_nota) {
		this.nombre_nota = nombre_nota;
	}
	
	
	

}
