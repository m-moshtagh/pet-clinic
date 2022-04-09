package com.dogigiri.petclinic.model.service.springdatajpa;

import com.dogigiri.petclinic.model.entity.Speciality;
import com.dogigiri.petclinic.model.repository.SpecialityRepository;
import com.dogigiri.petclinic.model.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "springdatajpa")
public class SpecialityJpaService implements SpecialityService {
    private final SpecialityRepository specialityRepository;

    public SpecialityJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public List<Speciality> findAll() {
        return specialityRepository.findAll();
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality type) {
        return specialityRepository.save(type);
    }

    @Override
    public Speciality update(Speciality type) {
        return specialityRepository.save(type);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
