package Shahid;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.awt.*;

public class createPokemon {

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.setName("Pikachu");
        p1.setType("Electric");
        p1.setPower(200);
        p1.setAge(10);
        p1.setColor(Color.YELLOW);

        Pokemon p2 = new Pokemon();
        p2.setName("Charmander");
        p2.setType("Fire");
        p2.setPower(100);
        p2.setAge(10);
        p2.setColor(Color.RED);

        Pokemon p3 = new Pokemon();
        p2.setName("Charizard");
        p2.setType("Fire");
        p2.setPower(300);
        p2.setAge(5);
        p2.setColor(Color.ORANGE);

        EntityManagerFactory entity = Persistence.createEntityManagerFactory("Shahid");
        EntityManager manager = entity.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(p1);
        manager.persist(p2);
        manager.persist(p3);
        transaction.commit();
    }
}
