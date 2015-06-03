package com.bbdd.empleados.dao_dto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void mostrarLista(ArrayList<EmpleadoDTO> arraylist){
		Iterator<EmpleadoDTO> it = arraylist.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ArrayList<EmpleadoDTO> arraylist = new ArrayList<EmpleadoDTO>();
		
		EmpleadoDAO edao = new EmpleadoDAO();
		
		arraylist = edao.recuperarTodos();
		
		mostrarLista(arraylist);
	}
}