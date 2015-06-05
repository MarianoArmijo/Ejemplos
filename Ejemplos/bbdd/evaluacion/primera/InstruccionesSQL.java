package evaluacion.primera;

public class InstruccionesSQL {
	
	// Método que crear nuevas regiones en la BBDD
	public static String crearRegiones(){

		return "INSERT INTO HR.REGIONS (REGION_ID, REGION_NAME) VALUES ('5', 'Oceanía')";
		// DELETE FROM HR.REGIONS WHERE REGION_ID = 5 AND REGION_NAME = 'Oceanía'; Para borrar registro.
	}
	
	// Método que recupera una región dado su ID
	public static String recuperarRegionID(){
		
		return "SELECT REGION_NAME FROM HR.REGIONS WHERE REGION_ID BETWEEN 1 AND 5";
	}
	
	// Método que recupera la lista de regiones y las ordena por su ID
	public static String recuperarListaRegiones(){
		
		return "SELECT * from HR.REGIONS ORDER BY REGION_ID";
	}
}
