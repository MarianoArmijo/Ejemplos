package com.junit.ejemplo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ClaseTest {
	
	public static Operaciones tester;
	
	@BeforeClass
	public static void iniciarClase() {
		
		tester = new Operaciones();
		
	}
	
	//Para  cada método que queramos utilizar de la clase
	//crearemos un método nuevo con la anotación de @Test
	@Test
	public void testSuma() {
		
		assertEquals("5 MÄS 3 = 8", 8, tester.suma(5, 3));
	}

	@Test
	public void testMultiplicacion() {

		assertEquals("5 POR 3 = 15", 15, tester.multiplicacion(5, 3));
	}

	@Test
	public void testDivision() {

		assertEquals("5 DIVIDIDO ENTRE 3", 1, tester.division(5, 3));
	}

	@Test
	public void testResta() {

		assertEquals("5 MENOS 3", 2, tester.resta(5, 3));
	}

}
