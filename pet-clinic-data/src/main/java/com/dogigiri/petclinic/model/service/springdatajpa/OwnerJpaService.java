package com.dogigiri.petclinic.model.service.springdatajpa;

import com.dogigiri.petclinic.model.entity.Owner;
import com.dogigiri.petclinic.model.repository.OwnerRepository;
import com.dogigiri.petclinic.model.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Profile(value = "springdatajpa")
public class OwnerJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> ownerOptional = ownerRepository.findById(aLong);
        return ownerOptional.orElse(null);
    }

    @Override
    public Owner save(Owner type) {
        return ownerRepository.save(type);
    }

    @Override
    public Owner update(Owner type) {
        return ownerRepository.save(type);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
