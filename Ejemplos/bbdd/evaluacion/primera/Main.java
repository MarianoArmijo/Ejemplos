package evaluacion.primera;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Mariano
 * 
 * user = HR
 * 
 * password = 222274
 *
 */

public class Main {

	public static void mostrarLista(List<RegionDTO> arraylist) {
		
		Iterator<RegionDTO> it = arraylist.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
			
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Ejecutar la creación de una nueva región
		RegionDAO edao1 = new RegionDAO();
		
		
		// Ejecutar mostrar regiones por ID
		List<RegionDTO> list2 = new ArrayList<RegionDTO>();
		RegionDAO edao2 = new RegionDAO();
		list2 = edao2.recuperarRegionesID();
		
		// Ejecutar mostrar regiones
		List<RegionDTO> list3 = new ArrayList<RegionDTO>();
		RegionDAO edao3 = new RegionDAO();
		list3 = edao3.recuperarRegiones();
		
		mostrarLista(list2);
		mostrarLista(list3);
	}
}
