package com.dogigiri.petclinic.model.service.mapservice;

import com.dogigiri.petclinic.model.entity.Visit;
import com.dogigiri.petclinic.model.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile({"default", "mapservice"})
public class VisitMapService extends MapService<Visit, Long> implements VisitService {
    @Override
    public List<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Visit update(Visit type) {
        return super.save(type);
    }

    @Override
    public Visit save(Visit type) {
        if (type.getPet().getOwner() == null || type.getPet().getOwner().getId() == null || type.getPet() == null ||
                type.getPet().getId() == null)
            throw new RuntimeException();
        return super.save(type);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
