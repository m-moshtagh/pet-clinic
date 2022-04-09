package com.dogigiri.petclinic.model.repository;

import com.dogigiri.petclinic.model.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}
