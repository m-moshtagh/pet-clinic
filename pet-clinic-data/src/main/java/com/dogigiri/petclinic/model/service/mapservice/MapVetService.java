package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.Vet;
import com.dogigiri.petclinic.model.service.SpecialityService;
import com.dogigiri.petclinic.model.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile({"default", "mapservice"})
public class MapVetService extends MapService<Vet, Long> implements VetService {
    private final SpecialityService specialityService;

    public MapVetService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public List<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet type) {
        saveSpeciality(type);
        return super.save(type);
    }

    private void saveSpeciality(Vet type) {
        if (!type.getSpecialities().isEmpty()) {
            type.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    var savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
    }

    @Override
    public Vet update(Vet type) {
        return super.save(type);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
