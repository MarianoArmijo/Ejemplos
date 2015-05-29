package com.junit.ejemplo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.ejemplo.personamejorado.Persona;

public class TestPersona {
	
	public static Persona p;
	public static Persona p1;
	
	@Before
	public void iniciarClase() {
		
		p = new Persona("Mariano", 20);
		p1 = new Persona("Mariano", 20);
	}
	
	@After
	public void terminarTest() {
	
		p = null;
		p1 = null;
	}
	
	@Test
	public void testPersona() {
		
		assertTrue(p.equals(p1));
	}
	
	@Test
	public void testConstructor() {
		
		assertNotNull(new Persona("Mariano", 20));
	}
	
	@Test
	public void testMayorEdad() {

		assertNotSame(p.getEdad(), 17);
	}
	
}
