package com.example.kyrsavayajava.dao;

import com.example.kyrsavayajava.model.Request;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

import static java.lang.Long.parseLong;

public class RequestDaoImpl implements DAO<Request> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityManager");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    public void create(Request entity) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    @Override
    public void update(Request entity) {
        EntityManager em = getEntityManager();
        em.detach(entity);
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }

    @Override
    public Request findById(String id) {
        EntityManager em = getEntityManager();
        Request request = em.find(Request.class, parseLong(id));
        em.detach(request);
        return request;
    }

    @Override
    public void delete(String id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Request request = em.find(Request.class, parseLong(id));
        em.remove(request);
        em.getTransaction().commit();
    }

//    @Override
//    public List<Request> findAll() {
//        EntityManager em = getEntityManager();
//        List<?> requests = em.createQuery("SELECT request from Request request", Request.class)
//                .getResultList();
//        return requests;
//    }
}
