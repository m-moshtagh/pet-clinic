package com.dogigiri.petclinic.model.repository;

import java.util.List;

public interface CrudRepository<T, E>{
    List<T> findAll();

    T findById(E e);

    T save(T type);

    T update(T type);

    void deleteById(E e);
}
