package evaluacion.primera;

public class InstruccionesSQL {
	
	// M�todo que crear nuevas regiones en la BBDD
	public static String crearRegiones(){

		return "INSERT INTO HR.REGIONS (REGION_ID, REGION_NAME) VALUES ('5', 'Ocean�a')";
		// DELETE FROM HR.REGIONS WHERE REGION_ID = 5 AND REGION_NAME = 'Ocean�a'; Para borrar registro.
	}
	
	// M�todo que recupera una regi�n dado su ID
	public static String recuperarRegionID(){
		
		return "SELECT REGION_NAME FROM HR.REGIONS WHERE REGION_ID BETWEEN 1 AND 5";
	}
	
	// M�todo que recupera la lista de regiones y las ordena por su ID
	public static String recuperarListaRegiones(){
		
		return "SELECT * from HR.REGIONS ORDER BY REGION_ID";
	}
}
