package com.dogigiri.petclinic.model.repository;

import com.dogigiri.petclinic.model.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
