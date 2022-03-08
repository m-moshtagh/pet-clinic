package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.BaseEntity;

import java.util.*;

public abstract class MapService<T extends BaseEntity, E extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    List<T> findAll() {
        return new ArrayList<>(map.values());
    }

    T findById(E e) {
        return map.get(e);
    }

    T save(T type) {
        if (type != null) {
            if (type.getId() == null) {
                type.setId(getNextId());
            }
            return map.put(getNextId(), type);
        }
        throw new InputMismatchException();
    }

    void deleteById(E e) {
        map.remove(e);
    }

    private Long getNextId() {
        long nextId;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
