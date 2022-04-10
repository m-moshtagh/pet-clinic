package com.dogigiri.petclinic.model.repository;

import com.dogigiri.petclinic.model.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
