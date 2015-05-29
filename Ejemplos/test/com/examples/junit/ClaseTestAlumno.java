package com.examples.junit;
import org.junit.Assert;
import org.junit.Test;

import com.ejemplos.repaso.Alumno;
import com.ejemplos.repaso.exceptions.NotaException;



public class ClaseTestAlumno {
	
	@Test
	public void alumnoSobre ()
	{
		Alumno alumno;
		try {
			alumno = new Alumno("JuanJo", 39, 8);
			Assert.assertThat(alumno, (new EsAlumnoSobresaliente()));
		} catch (NotaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}