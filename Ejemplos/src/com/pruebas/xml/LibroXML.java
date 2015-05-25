package com.pruebas.xml;


import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LibroXML extends DefaultHandler {
	
	   private String valor = null;  
	   private Libro libro = null; 
		
	   Map<String, Libro> mapa_libro = null;
	   
	   public LibroXML(Map<String, Libro> mapa_libro){	 
		   
		   this.mapa_libro = mapa_libro;
	   }  
	     
	   @Override  
	   public void startElement(String uri, String localName, String name,  
	         Attributes attributes) throws SAXException {  
	        
	      // Limpiamos la variable temporal.  
	      valor=null;  
	        
	      // Si la etiqueta es libro leemos el atributo isbn  
	      if(localName.equals("libro")) {
	    	 this.libro = new Libro();
	         String isbn = attributes.getValue("isbn");  
	         // Lo guardamos en el objeto libro  
	         libro.setIsbn(isbn);  
	      }  
	   }  
	     
	   @Override
	   public void characters(char[] ch, int start, int length)  
	         throws SAXException {  
	      // Guardamos el texto en la variable temporal  
	      valor = new String(ch,start,length);  
	      System.out.println(valor);
	   }  
	  
	   @Override  
	   public void endElement(String uri, String localName, String name)  
	         throws SAXException {  
	      // Según la etiqueta guardamos el valor leido   
	      // en una propiedad del objeto libro  
		   System.out.println(name);
	      if (localName.equals("titulo")){  
	         libro.setTitulo(valor);  
	      }else if (localName.equals("autor")){  
	         libro.setAutor(valor);  
	      }else if (localName.equals("anyo")){  
	         libro.setAnyo(valor);  
	      }else if (localName.equals("editorial")){  
	         libro.setEditorial(valor);  
	      }  else if (localName.equals("libro"))
	      {
	    	  //System.out.println(libro);
	    	  mapa_libro.put(this.libro.getIsbn(), libro);
	      }
	      
	   }  
	  
	}  