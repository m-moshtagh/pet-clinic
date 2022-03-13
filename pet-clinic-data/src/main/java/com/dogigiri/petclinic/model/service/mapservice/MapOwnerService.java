package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.Owner;
import com.dogigiri.petclinic.model.entity.Pet;
import com.dogigiri.petclinic.model.service.OwnerService;
import com.dogigiri.petclinic.model.service.PetService;
import com.dogigiri.petclinic.model.service.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapOwnerService extends MapService<Owner, Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    @Autowired
    public MapOwnerService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public List<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner type) {
        if (type != null) {
            if (type.getPets() != null) {
                type.getPets().forEach(pet -> {
                    savePetType(pet);
                    if (pet.getId() == null) {
                        var savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(type);
        } else {
            return null;
        }
    }

    private void savePetType(Pet pet) {
        if (pet.getPetType() != null) {
            if (pet.getPetType().getId() == null) {
                pet.setPetType(petTypeService.save(pet.getPetType()));
            }
        } else {
            throw new NullPointerException("Pet Type is required");
        }
    }

    @Override
    public Owner update(Owner type) {
        return super.save(type);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
