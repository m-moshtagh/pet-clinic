package com.dogigiri.petclinic.bootstrap;

import com.dogigiri.petclinic.model.entity.Owner;
import com.dogigiri.petclinic.model.entity.Pet;
import com.dogigiri.petclinic.model.entity.PetType;
import com.dogigiri.petclinic.model.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) {
        // Create petType
        var cat = PetType.builder().type("cat").build();
        var dog = PetType.builder().type("dog").build();
        petTypeService.save(cat);
        petTypeService.save(dog);

        // Create Owners
        var rodJohnson = Owner.builder().firstname("Rod").lastname("johnson").address("pineappleST")
                .city("Boston").telephone("987235656").build();
        // create pet for rod
        var nancy = Pet.builder().name("Nancy").birthDate(LocalDate.now()).petType(cat).build();
        rodJohnson.addPet(nancy);
        ownerService.save(rodJohnson);
        logger.info("Created First Owner & owning pet");

        //TODO Complete
    }
}
