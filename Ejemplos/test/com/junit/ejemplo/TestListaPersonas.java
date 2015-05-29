package com.junit.ejemplo;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ejemplo.personamejorado.Persona;
import com.ejemplos.repaso.ListaPersonas;

public class TestListaPersonas {
	
	public static Persona p;
	public static ListaPersonas lp;
	
	@Before
	public void iniciarClase() {
		
		p = new Persona("Jose", 15);
		lp = new ListaPersonas();
		
	}
	
	@After
	public void finalizarClase() {
		
		p = null;
		lp = null;
	}
	
	@Test
	public void testListaPersonas() {
		assertNotNull("Comprobación del método constructor", new ListaPersonas());
	}

//	@Test
//	public void testGetListaPersonas() {
//		assert();
//	}

//	@Test
//	public void testBuscarPersonaString() {
//		fail("Not yet implemented");
//	}

}
