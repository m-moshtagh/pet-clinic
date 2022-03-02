package com.dogigiri.model.service.mapservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    List<T> findAll() {
        return new ArrayList<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T type) {
        return map.put(id, type);
    }

    boolean deleteById(ID id) {
        if(! map.containsKey(id))
            return false;
        map.remove(id);
        return true;
    }

    boolean delete(T type) {
        if(! map.containsValue(type))
            return false;
        map.remove(type);
        return true;
    }
}
