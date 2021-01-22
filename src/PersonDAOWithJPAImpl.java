import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PersonDAOWithJPAImpl implements  PersonDAO{


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");

    @Override
    public void create(Person p) {
        System.out.println(p);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }


    @Override
    public boolean remove(String id) {
        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p = em.find(Person.class, id);
        if (p != null ) {
            em.remove(p);
            success = true;
        }
        em.getTransaction().commit();
        return success;

    }

    @Override
    public List<Person> getByUserName(String UserName) {
        List<Person> list;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        list = em.createQuery("from Person p where p.UserName = :UserName", Person.class)
                .setParameter("UserName", UserName).getResultList();
        em.getTransaction().commit();
        return list;
    }
}
