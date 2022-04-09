package com.dogigiri.petclinic.model.service.springdatajpa;

import com.dogigiri.petclinic.model.entity.Pet;
import com.dogigiri.petclinic.model.repository.PetRepository;
import com.dogigiri.petclinic.model.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "springdatajpa")
public class PetJpaService implements PetService {
    private final PetRepository petRepository;

    public PetJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet type) {
        return petRepository.save(type);
    }

    @Override
    public Pet update(Pet type) {
        return petRepository.save(type);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
