package com.pruebas.xml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ProcesoSAX {

	public static void main(String[] args) {  
        
	      try {  
	         // Creamos la factoria de parseadores por defecto  
	         XMLReader reader = XMLReaderFactory.createXMLReader();  
	         
	         HashMap<String, Libro> mapa_libro = new HashMap<String, Libro>();
	         
	         // Añadimos nuestro manejador al reader pasandole el objeto libro  
	         reader.setContentHandler(new LibroXML(mapa_libro));           
	         // Procesamos el xml de ejemplo  
	         reader.parse(new InputSource(new FileInputStream("Archivos//libros.xml")));
	         System.out.println("vOY A IMPRIMIR EL HASHMAP DE LIBROS");
	         System.out.println(mapa_libro);
	         
	      } catch (SAXException e) {  
	         e.printStackTrace();  
	      } catch (IOException e) {  
	         e.printStackTrace();  
	      }  
	  
	   }
}
