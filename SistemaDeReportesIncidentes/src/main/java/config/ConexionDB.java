package config;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConexionDB {
	
	 //Se asegura de que solo se cree una `EntityManagerFactory`
	 //y el método `getEntityManager` devuelve una nueva instancia de `EntityManager` cada vez que se llama. 	
	
	static EntityManagerFactory factory = null;
	
	public static EntityManager getEntityManager(){
		if(factory == null)
			factory = Persistence.createEntityManagerFactory("TP_GRU1");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
}
