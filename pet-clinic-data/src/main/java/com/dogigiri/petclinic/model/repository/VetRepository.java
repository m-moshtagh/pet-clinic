package com.dogigiri.petclinic.model.repository;

import com.dogigiri.petclinic.model.entity.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
