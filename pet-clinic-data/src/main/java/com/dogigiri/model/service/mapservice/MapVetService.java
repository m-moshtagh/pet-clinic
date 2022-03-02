package com.dogigiri.model.service.mapservice;

import com.dogigiri.model.entity.Vet;
import com.dogigiri.model.service.VetService;

import java.util.List;

public class MapVetService extends MapService<Vet, Long> implements VetService {
    @Override
    public List<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public boolean deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public boolean delete(Vet type) {
        return super.delete(type);
    }

    @Override
    public Vet save(Vet type) {
        return super.save(type.getId(), type);
    }

    @Override
    public Vet update(Vet type) {
        return super.save(type.getId(), type);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
