package com.dogigiri.model.repository;

import java.util.List;

public interface CrudRepository<T, ID>{
    List<T> findAll();

    T findById(ID id);

    T save(T type);

    T update(T type);

    boolean delete(T type);

    boolean deleteById(ID id);
}
