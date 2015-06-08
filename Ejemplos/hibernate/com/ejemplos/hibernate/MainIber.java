package com.ejemplos.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class MainIber
{
	
	/*******************************************************
	 * 
	 * EJEMPLO Básico del Uso de HIBERNATE
	 * 
	 * Todo lo que hasta hora estábamos metiendo en el paquete "DAO", es lo que va a englobar y encargarse de ello
	 * el conjunto de bibliotecas que representa Hibernate
	 * 
	 * 		- Las conexiones ( y la concurrencia entra ellas )
	 * 		- La comunicación con la base de datos (ejecución de consultas SQL)
	 * 		- La escritura de POJOS o DTO's (para persistir clases en la base de datos)
	 * 		- La recuperación de registros en DTO's (para recuperar filas y pasarlas a clases Java)
	 * 		- El manejo de las transacciones (Para gestionar adecuadamente la interacción con la BD, salvaguardadno la integridad)
	 * 
	 * 
	 *****************************************************/
	
	
    public static void main(String args[]){
    	
    	//Cargo la configuración: MAPPING entre Tablas y Objetos así como La descripción de la base de de datos
    	//Dicho de otra forma: cargamos en memoria en la clase Configuration el hibernate.cfg.xml
    	Configuration configuration = new Configuration().configure();
    	//Preparo a un objeto, que será el encargado de generarme el estado de comunicación con la base de datos
    	//StandardServiceRegistryBuilder se preconfigura el entorno a emplear
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	
    	//Ahora sí, obtengo el objeto SessionFactory, a partir de la anterior clase /servicio
    	//que ya es la clase que encapsula al Pool y demás recursos físicos
    	SessionFactory factory = configuration.buildSessionFactory(builder.build());
    	
    	//Ahora ya con sesion, obtengo y manejo conexiones que me va dando SessionFactory
    	Session session = factory.openSession();
    	
    	// Normalmente utilizaremos el método getCurrentSesion para no tener que abrir y cerrarlo todo el rato.
//    	factory.getCurrentSession();
    	
    	//Me creo el POJO
    	Region region = new Region();
    	region.setRegion_id(7);
    	region.setRegion_name("Oceanía");
    	
    	
    	Transaction transaction = null;
    	//Y procedo a guardarlo --> INICIO DE LA TRANSACCION
    	try 
    	{
    		transaction = session.beginTransaction();
    		
    		// session.save(region) crea un nuevo registro en la BBDD
    		session.save(region);
    		
    		// session.delete(region) borra un registro de la BBDD
//    		session.delete(region);
    		transaction.commit();//si todo ha ido bien, persisto los cambio, los hago de verdad, no en la copia de la BD
    	}
    	catch (Exception e)
    	{
    		transaction.rollback();//si algo ha ido mal, deshago la transacción
    	}
    	
    	
    	try 
    	{
    		transaction = session.beginTransaction();
    		@SuppressWarnings("unchecked")
    		// El resultado que te de addEntity (Region.class) te muestra una lista
			List<Region> list = session.createSQLQuery("SELECT * FROM REGIONS ORDER BY REGION_ID").addEntity(Region.class).list();
    		Iterator<Region> it = list.iterator();
    		Region rg;
    		while (it.hasNext())
    		{
    			rg = it.next();
    			System.out.println(rg.toString());
    		}
    		transaction.commit();//si todo ha ido bien, persisto los cambio, los hago de verdad, no en la copia de la BD
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    		transaction.rollback();//si algo ha ido mal, deshago la transacción
    	}
    	finally 
    	{
    		//Normalmente utilizaremos disconect para cerrar una sesión
    		session.disconnect();
    		
    		session.close();//haya ido bien o mal, libero recursos!
    		factory.close();
    	}
    	
    }
}