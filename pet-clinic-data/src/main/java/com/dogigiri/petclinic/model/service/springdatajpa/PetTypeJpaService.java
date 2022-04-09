package com.dogigiri.petclinic.model.service.springdatajpa;

import com.dogigiri.petclinic.model.entity.PetType;
import com.dogigiri.petclinic.model.repository.PetTypeRepository;
import com.dogigiri.petclinic.model.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "springdatajpa")
public class PetTypeJpaService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public List<PetType> findAll() {
        return petTypeRepository.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType type) {
        return petTypeRepository.save(type);
    }

    @Override
    public PetType update(PetType type) {
        return petTypeRepository.save(type);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}


