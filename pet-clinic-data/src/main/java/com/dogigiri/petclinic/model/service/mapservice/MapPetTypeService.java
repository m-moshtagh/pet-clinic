package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.PetType;
import com.dogigiri.petclinic.model.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile({"default", "mapservice"})
public class MapPetTypeService extends MapService<PetType, Long> implements PetTypeService {
    @Override
    public List<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long e) {
        super.deleteById(e);
    }

    @Override
    public PetType update(PetType type) {
        return super.save(type);
    }

    @Override
    public PetType save(PetType type) {
        return super.save(type);
    }

    @Override
    public PetType findById(Long e) {
        return super.findById(e);
    }
}
