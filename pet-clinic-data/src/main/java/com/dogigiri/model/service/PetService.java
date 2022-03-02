package com.dogigiri.model.service;

import com.dogigiri.model.entity.Pet;
import com.dogigiri.model.repository.CrudRepository;

public interface PetService extends CrudRepository<Pet, Long> {
}
