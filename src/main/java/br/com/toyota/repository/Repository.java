package br.com.toyota.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Repository {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;



    public Repository() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("fiap");
        this.entityManager = entityManagerFactory.createEntityManager();

    }

    public void fecharRepositorio(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }


}
