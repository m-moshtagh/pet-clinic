package com.dogigiri.petclinic.model.repository;

import com.dogigiri.petclinic.model.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
