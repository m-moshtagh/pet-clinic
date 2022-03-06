package com.dogigiri.petclinic.model.service;

import com.dogigiri.petclinic.model.entity.Pet;
import com.dogigiri.petclinic.model.repository.CrudRepository;

public interface PetService extends CrudRepository<Pet, Long> {
}
