package com.dogigiri.petclinic.model.service.springdatajpa;

import com.dogigiri.petclinic.model.entity.Vet;
import com.dogigiri.petclinic.model.repository.VetRepository;
import com.dogigiri.petclinic.model.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "springdatajpa")
public class VetJpaService implements VetService {
    private final VetRepository vetRepository;

    public VetJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public List<Vet> findAll() {
        return vetRepository.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet type) {
        return vetRepository.save(type);
    }

    @Override
    public Vet update(Vet type) {
        return vetRepository.save(type);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
