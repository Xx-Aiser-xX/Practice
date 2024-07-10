package org.example;

import Table.Human;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Practice");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Human human = new Human(21, "Станислав", "Плотников", "Сергеевич");

        em.persist(human);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}