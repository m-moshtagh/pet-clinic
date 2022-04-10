package com.dogigiri.petclinic.model.repository;

import com.dogigiri.petclinic.model.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findByLastname(String lastname);
}
