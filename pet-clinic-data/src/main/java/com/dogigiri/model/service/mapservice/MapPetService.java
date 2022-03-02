package com.dogigiri.model.service.mapservice;

import com.dogigiri.model.entity.Pet;
import com.dogigiri.model.service.PetService;

import java.util.List;

public class MapPetService extends MapService<Pet, Long> implements PetService {
    @Override
    public List<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public boolean deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public boolean delete(Pet type) {
        return super.delete(type);
    }

    @Override
    public Pet save(Pet type) {
        return super.save(type.getId(), type);
    }

    @Override
    public Pet update(Pet type) {
        return super.save(type.getId(), type);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
