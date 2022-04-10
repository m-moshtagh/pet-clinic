package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.Speciality;
import com.dogigiri.petclinic.model.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile({"default", "mapservice"})
public class MapSpecialityService extends MapService<Speciality, Long> implements SpecialityService {
    @Override
    public List<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long e) {
        super.deleteById(e);
    }

    @Override
    public Speciality update(Speciality type) {
        return super.save(type);
    }

    @Override
    public Speciality save(Speciality type) {
        return super.save(type);
    }

    @Override
    public Speciality findById(Long e) {
        return super.findById(e);
    }
}
