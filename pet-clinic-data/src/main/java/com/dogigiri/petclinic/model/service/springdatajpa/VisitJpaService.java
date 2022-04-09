package com.dogigiri.petclinic.model.service.springdatajpa;

import com.dogigiri.petclinic.model.entity.Visit;
import com.dogigiri.petclinic.model.repository.VisitRepository;
import com.dogigiri.petclinic.model.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "springdatajpa")
public class VisitJpaService implements VisitService {
    private final VisitRepository visitRepository;

    public VisitJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public List<Visit> findAll() {
        return visitRepository.findAll();
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit type) {
        return visitRepository.save(type);
    }

    @Override
    public Visit update(Visit type) {
        return visitRepository.save(type);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
