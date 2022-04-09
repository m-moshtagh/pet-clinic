package com.dogigiri.petclinic.model.repository;

import com.dogigiri.petclinic.model.entity.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}
