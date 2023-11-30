package argProg.utilidades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {
    private static String PERSISTENCE_UNIT = "UP";
    private static EntityManagerFactory emf = null;

    public EntityManagerUtil(){}
    public static EntityManager getEntityManager(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        return emf.createEntityManager();
    }

}
