package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.Owner;
import com.dogigiri.petclinic.model.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapOwnerService extends MapService<Owner, Long> implements OwnerService {
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
        return super.save(type);
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
