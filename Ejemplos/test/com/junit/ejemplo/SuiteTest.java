package com.junit.ejemplo;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;

	@RunWith(Suite.class) //Le digo a Junit que esto es una suite
	@Suite.SuiteClasses(
			{
				TestPersona.class,
				TestListaPersonas.class, 
				}
			)
	
	public class SuiteTest {}
