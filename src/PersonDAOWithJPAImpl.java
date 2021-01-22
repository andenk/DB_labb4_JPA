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

    @Override
    public List<Person> selectAll() {
        List<Person> list;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        list = em.createQuery("FROM Person c", Person.class).getResultList();

        em.getTransaction().commit();
        return list;
    }

    @Override
    public boolean updateUserName(String updateID, String newUserName) {
        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p = em.find(Person.class, updateID);
        System.out.println(p);
        if (p != null ) {
            p.setUserName(newUserName);
            success = true;
        }
        em.getTransaction().commit();
        return success;
    }

    @Override
    public boolean updateFirstName(String updateID, String newFirstName) {
        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p = em.find(Person.class, updateID);
        System.out.println(p);
        if (p != null ) {
            p.setFirstName(newFirstName);
            success = true;
        }
        em.getTransaction().commit();
        return success;
    }

    @Override
    public boolean updateLastName(String updateID, String newLastName) {
        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p = em.find(Person.class, updateID);
        System.out.println(p);
        if (p != null ) {
            p.setLastName(newLastName);
            success = true;
        }
        em.getTransaction().commit();
        return success;
    }

    @Override
    public boolean updatePhone(String updateID, String newPhone) {
        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p = em.find(Person.class, updateID);
        System.out.println(p);
        if (p != null ) {
            p.setPhone(newPhone);
            success = true;
        }
        em.getTransaction().commit();
        return success;
    }

    @Override
    public boolean updatePassword(String updateID, String newPassword) {

        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p = em.find(Person.class, updateID);
        System.out.println(p);
        if (p != null ) {
            p.setPassword(newPassword);
            success = true;
        }
        em.getTransaction().commit();
        return success;

    }

    public boolean updateEmail(String id, String newEmail) {

        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p = em.find(Person.class, id);
        System.out.println(p);
        if (p != null ) {
            p.setEmail(newEmail);
            success = true;
        }
        em.getTransaction().commit();
        return success;
    }
}
