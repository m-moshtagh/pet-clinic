package com.dogigiri.model.service.mapservice;

import com.dogigiri.model.entity.Owner;
import com.dogigiri.model.service.OwnerService;

import java.util.List;

public class MapOwnerService extends MapService<Owner, Long> implements OwnerService{
    @Override
    public List<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner type) {
        return super.save(type.getId(), type);
    }

    @Override
    public Owner update(Owner type) {
        return super.save(type.getId(), type);
    }

    @Override
    public boolean delete(Owner type) {
        return super.delete(type);
    }

    @Override
    public boolean deleteById(Long aLong) {
        return super.deleteById(aLong);
    }
}
