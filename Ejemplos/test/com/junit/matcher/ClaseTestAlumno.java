package com.junit.matcher;

import org.junit.Assert;
import org.junit.Test;

import com.ejemplo.personamejorado.*;

public class ClaseTestAlumno {

	@Test
	public void edadPersona () {

		Persona persona;
		
		try {
			persona = new Persona("Juan", 39);
			Assert.assertThat(persona, (new PersonaMatcher()));
//			Assert.assertThat(persona, not(PersonaMatcher()));
		}
		
		catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}
