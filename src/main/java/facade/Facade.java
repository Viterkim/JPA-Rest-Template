
package facade;

import entity.TempEnt;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//Persist = save, merge = overskriv, slet = remove
public class Facade {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    
    public void saveTemp(TempEnt t){
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }
    
}
