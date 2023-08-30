package Shahid;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class deletePokemon {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EntityManagerFactory entity = Persistence.createEntityManagerFactory("Shahid");
        EntityManager manager = entity.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        Pokemon p = manager.find(Pokemon.class, "Pikachu");

        if(p != null){
            transaction.begin();
            manager.remove(p);
            transaction.commit();
        }
        else{
            System.out.println("Pokemon not found");
        }
    }
}
