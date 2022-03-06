package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.Vet;
import com.dogigiri.petclinic.model.service.VetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
