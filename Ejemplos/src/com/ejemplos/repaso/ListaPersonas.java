package com.ejemplos.repaso;

import java.io.*;
import java.util.Properties;

import com.ejemplos.repaso.exceptions.InsertarPersonaException;

public class ListaPersonas {
	
	private static String dir = "Archivos\\serializa.properties"; 
	
	public static final int CAPACIDAD = 10;
	
	private Persona[] array_personas;	
	
	public ListaPersonas() {
		//TODO HAY QUE HACER UN CONSTRUCTOR
		//RECUERDA QUE EL CONSTRUCTOR SIRVE PARA
			//RESERVAR MEMORIA
			//INICIALIZAR EL ESTADO DEL OBJETO Y SUS ATRIBUTOS
		
		array_personas = new Persona[CAPACIDAD];
		
	}
	
	public Persona[] getListaPersonas () {
		//TODO HAY QUE DEVOLVER EL ARRAY DE PERSONAS QUE CONFORMAN LA LISTA
		return this.array_personas;
	}
	
	public Persona buscarPersona (String nombre) {
		//TODO BUSCAR PERSONA POR NOMBRE Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		
		Persona persona = null;
		int contador = 0;
		boolean bn = false;
		
		do {
			
		if(array_personas[contador].getNombre().equals(nombre)){

		
		persona = array_personas[contador];
		bn = true;
		
		}
			contador++;
		
		} while((bn == false)&&(contador < CAPACIDAD));
			
		return persona;
	}
	
	public Persona buscarPersona (int edad) {
		//TODO BUSCAR PERSONA POR EDAD Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		
		Persona persona = null;
		int contador = 0;
		boolean be = false;
		
		do {
		
			if((array_personas[contador].getEdad()) == edad) {
			
			persona = array_personas[contador];
			be = true;
			}
			
			contador++;
		
		} while((be == false)&&(contador < this.array_personas.length));
		
		return persona;
	}
	
	public boolean serializar() throws IOException {
		//Hacer uso del fichero de propiedades serializa.properties, 
		//para obtener de él el valor de la clave destino, 
		//que representa el nombre del fichero de salida
		
		boolean res = false;
		FileInputStream fis = new FileInputStream(dir);
		Properties properties = new Properties();
		
		ObjectOutputStream objeto = null;
		File file = null;
		
		try{
			
		properties.load(fis);	
		file = new File(properties.getProperty("destino"));
		file.createNewFile();
		
		objeto = new ObjectOutputStream(new FileOutputStream(properties.getProperty("destino")));
		objeto.writeObject(array_personas);
		
		res = true;
		}
		
		catch (Exception e ) {
			
			System.out.println("Error al escribir el fichero "+properties.getProperty("destino"));
			
		}
		
		finally {
			
			objeto.close();
		}
		
		return res;
	}
	
	public boolean deserializar() throws FileNotFoundException, IOException, ClassNotFoundException {

		boolean res = false;
		FileInputStream fis = new FileInputStream(dir);
		Properties properties = new Properties();
		
		ObjectInputStream ois = null;
		File file = null;
		
		try {
			
			properties.load(fis);	
			file = new File(properties.getProperty("destino"));
			file.createNewFile();
			
			ois = new ObjectInputStream(new FileInputStream(properties.getProperty("destino")));
			
			this.array_personas = (Persona [])ois.readObject();
			
			res = true;
		}
		
		catch (Exception e ) {
			System.out.println("Error al escribir el fichero "+properties.getProperty("destino"));
		}
		
		finally	{
				ois.close();
			}
		
		return res;	
	}
	
	public void insertarPersona (Persona p) throws InsertarPersonaException {
		
		if (!estaLlena()) {
			
			if(numeroPersonas() != 0) {
				
				if(buscarPersona(p.getNombre()) == null) {
					
					System.out.println("Número de personas "+numeroPersonas() );
					
					array_personas[numeroPersonas()] = p;
				
				}
				
				else {
					System.out.println("Ya existe la persona");
				}
				
			}
			else {
				array_personas[0]=p;
			}
		}
		else {
			System.out.println("Ha llegado al limite");
			throw new InsertarPersonaException();
		}
		
	}
	
	public int numeroPersonas()	{
		
		int res = 0;
		for (int i = 0; i < CAPACIDAD; i++) {
			if(this.array_personas[i] != null){
				res++;
			}
		}
		
		return res;
	}
	
	public boolean estaLlena() {
		
		return numeroPersonas() == CAPACIDAD;
	}
	
	public void mostrar() {
		//TODO MOSTRAR LA LISTA DE PERSONAS
		// pista: ayudarse del método toString de persona
		
		for(int i = 0; i < array_personas.length; i++) {
			
			System.out.println(array_personas[i]);
			
		}
		
	}

}
