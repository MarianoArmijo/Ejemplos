package com.junit.matcher;



import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import com.ejemplo.personamejorado.*;

	public class PersonaMatcher extends TypeSafeMatcher<Persona> {

		@Override
		public void describeTo(Description arg0) {
			
			arg0.appendText("Resultado esperado: la pesona tiene 18 años o mas es mayor de edad ");
			arg0.appendText("Resultado optenido: la persona es menor");
		}

		@Override
		public boolean matchesSafely(Persona arg0) {
			
			boolean respuesta = false;

			if (arg0.getEdad()>=18) {
				
				respuesta = true;
			}
			
			else {
				
				respuesta = false;
			}
			
			return respuesta;
	}
}
