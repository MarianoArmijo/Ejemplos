package com.pruebas.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class ArrayListProcesoJDOM {
	
	public static void main(String[] args) throws FileNotFoundException, JDOMException, IOException {

		//CREAMOS EL PARSER
		SAXBuilder builder = new SAXBuilder();
		// Construimos el arbol DOM a partir del fichero xml
		Document documentJDOM = builder.build(new FileInputStream("Archivos//libros.xml"));
		
		//Creamos un ArrayList en el que iremos 
		ArrayList<Libro> arraylist_libros = new ArrayList<Libro>();
		
		//MOSTRAMOS EL DOCUMENTO
		Element raiz = documentJDOM.getRootElement();
		// Recorremos los hijos de la etiqueta raíz
		
		List<Element> libros = raiz.getChildren();
		for (Element libro : libros) {
			
			//Creamos un nuevo objeto al que le vamos pasando los elementos.
			Libro book = new Libro();
			
			//Cogemos el valor del atributo ISBN y se lo insertamos al objeto book
			book.setIsbn(libro.getAttribute("isbn").getValue());
			
			List<Element> subhijos = libro.getChildren();
			for (Element valores : subhijos) {


				//Creo un switch para comprobar el valor de cada etiqueta del xml y almacenarla en el objeto book.
				switch (valores.getName()) {
				
				case "titulo": book.setTitulo(valores.getValue()); 
				break;
				
				case "autor": book.setAutor(valores.getValue()); 
				break;
				
				case "anyo": book.setAnyo(valores.getValue()); 
				break;
				
				case "editorial": book.setEditorial(valores.getValue());
				
				//Añadimos el objeto book con todo su contenido al ArrayList.
				
				arraylist_libros.add(book);
				break;
				}
				
			}
			
		}

		
//		Collections.sort(book);

		
		//Document para hacer un documento nuevo. Es el xml en memoria.
		
	    
	   //SERIALIZO EL DOCUMENT A UN FICHERO DE SALIDA
	    
	    Format format = Format.getPrettyFormat();
	    // Creamos el serializador con el formato deseado  
	    XMLOutputter xmloutputter = new XMLOutputter(format);
	    // Serializamos el document parseado  
	    String docStr = xmloutputter.outputString(documentJDOM); 
	    //Volcamos en un fichero
	    FileWriter fw = new FileWriter("xml_salida.xml");
	    fw.write(docStr);
	    fw.close();
	    
	}

}
