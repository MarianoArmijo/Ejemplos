package evaluacion.primera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RegionDAO {
	
	private ResultSet rset2;
	private ResultSet rset3;
	
	public void crearRegiones() throws ClassNotFoundException, SQLException {
		
		try {
			
			// Método que crear nuevas regiones en la BBDD
			Conexion.conectarBBDD().executeUpdate(InstruccionesSQL.crearRegiones());
		}
		
		finally { // libero los recursos

		Conexion.LiberarRecursos();
		}
	}
	
	public List<RegionDTO> recuperarRegionesID() throws ClassNotFoundException, SQLException {
		
		List<RegionDTO> list_recuperar_regiones_id = new ArrayList<RegionDTO>();
		
		try {
			
			// Método que recupera una región dado su ID
			rset2 = Conexion.conectarBBDD().executeQuery(InstruccionesSQL.recuperarRegionID());
			
			while (rset2.next()) {
				
				String region_name  = rset2.getString(1);
				
				list_recuperar_regiones_id.add(new RegionDTO(0, region_name));
			}
		}
		
		finally { // libero los recursos
			
				try {
					
					rset2.close();
					
				} catch (final Exception e2) {
					
					e2.printStackTrace();
				}
				
			Conexion.LiberarRecursos();
			}
		
	return list_recuperar_regiones_id;
	}
		
	public List<RegionDTO> recuperarRegiones() throws ClassNotFoundException, SQLException {
		
		List<RegionDTO> lista_regiones = new ArrayList<RegionDTO>();
		
		try {
			
			// Método que recupera la lista de regiones
			rset3 = Conexion.conectarBBDD().executeQuery(InstruccionesSQL.recuperarListaRegiones());
		
			while (rset3.next()) {
				
				int region_id = rset3.getInt(1);
				String region_name  = rset3.getString(2);
				
				
				lista_regiones.add(new RegionDTO(region_id, region_name));
			}
		}
		
		finally { // libero los recursos
			
			try {
				
				rset3.close();
				
			} catch (final Exception e3) {
				
				e3.printStackTrace();
			}
			
		Conexion.LiberarRecursos();
		}
		
	return lista_regiones;
	}
}
