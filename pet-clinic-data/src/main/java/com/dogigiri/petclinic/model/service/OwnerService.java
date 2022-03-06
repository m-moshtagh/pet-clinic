package com.dogigiri.petclinic.model.service;

import com.dogigiri.petclinic.model.entity.Owner;
import com.dogigiri.petclinic.model.repository.CrudRepository;

public interface OwnerService extends CrudRepository<Owner, Long> {
}
