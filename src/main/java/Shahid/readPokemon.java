package Shahid;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class readPokemon {
    public static void main(String[] args) {
        EntityManagerFactory entity = Persistence.createEntityManagerFactory("Shahid");
        EntityManager manager = entity.createEntityManager();
        Pokemon p = manager.find(Pokemon.class, "Pikachu");
        System.out.println(p);
    }
}
