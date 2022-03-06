package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.Pet;
import com.dogigiri.petclinic.model.service.PetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
