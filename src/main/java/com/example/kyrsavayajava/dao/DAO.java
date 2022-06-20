package com.example.kyrsavayajava.dao;

import java.util.List;

public interface DAO<T> {
    void create(T entity);

    void update(T entity);

    T findById(String id);

    void delete(String id);

//    List<T> findAll();
}
