package entity_relationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class StudentCreate {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Shahid");

        Student s2 = new Student();
        s2.setName("Rahul");

        StudentIdCard idCard1 = new StudentIdCard();
        idCard1.setSoftwareVersion("1.0.0");
        idCard1.setStudent(s1);

        StudentIdCard idCard2 = new StudentIdCard();
        idCard2.setSoftwareVersion("1.0.1");
        idCard2.setStudent(s2);

//      * Mapping
        s1.setCard(idCard1);
        s2.setCard(idCard2);

        Course c1 = new Course();
        c1.setCourseName("Java");

        Course c2 = new Course();
        c2.setCourseName("Python");

        Course c3 = new Course();
        c3.setCourseName("C++");

//      * Mapping
        c1.setStudent(s1);
        c2.setStudent(s1);
        c3.setStudent(s2);

        s1.setCoursesList(List.of(c1, c2));
        s2.setCoursesList(List.of(c3));

        EntityManagerFactory entity = Persistence.createEntityManagerFactory("Shahid2");
        EntityManager em = entity.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();

        entityTransaction.begin();
        em.persist(s1);
        em.persist(s2);
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(idCard1);
        em.persist(idCard2);
        entityTransaction.commit();
    }
}
