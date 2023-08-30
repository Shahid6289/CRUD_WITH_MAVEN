package entity_relationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRead {
    public static void main(String[] args) {

        EntityManagerFactory entity = Persistence.createEntityManagerFactory("Shahid2");
        EntityManager em = entity.createEntityManager();

//        * Lazy Fetching
        Student s1 = em.find(Student.class, 1);
        System.out.println(s1.getName());

        for (Course c : s1.getCoursesList())
            System.out.println(c.getCourseName());

        System.out.println(s1.getCard().getSoftwareVersion() + " " + s1.getCard().getCardNumber());

//        * Eager Fetching
        StudentIdCard idCard1 = em.find(StudentIdCard.class, 3);
        System.out.println(idCard1.getStudent().getName() + " " + idCard1.getCardNumber() + " " + idCard1.getSoftwareVersion());

//        * ManyToOne Mapping
        Course c1 = em.find(Course.class, 5);
        System.out.println(c1.getCourseName() + " " + c1.getStudent().getName());
    }
}
