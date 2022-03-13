package com.dogigiri.petclinic.model.service;

import com.dogigiri.petclinic.model.entity.PetType;
import com.dogigiri.petclinic.model.repository.CrudRepository;

public interface PetTypeService extends CrudRepository<PetType, Long> {
}
