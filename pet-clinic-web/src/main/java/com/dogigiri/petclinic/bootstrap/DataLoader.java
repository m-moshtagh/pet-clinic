package com.dogigiri.petclinic.bootstrap;

import com.dogigiri.petclinic.model.entity.*;
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
        // Create Pet Types:
        var dog = new PetType();
        dog.setType("dog");
        var cat = new PetType();
        cat.setType("cat");
        petTypeService.save(dog);
        petTypeService.save(cat);

        // Create Owner instances:
        var owner1 = new Owner();
        owner1.setFirstname("Kakashi");
        owner1.setLastname("Hatake");
        owner1.setAddress("times square");
        owner1.setCity("New york");
        owner1.setTelephone("0956599522");

        // Create pet for owner1
        var pakkun = new Pet();
        pakkun.setPetType(dog);
        pakkun.setBirthDate(LocalDate.now());
        pakkun.setOwner(owner1);
        pakkun.setName("Pakkun");
        owner1.addPet(pakkun);

        ownerService.save(owner1);

        var owner2 = new Owner();
        owner2.setFirstname("Itachi");
        owner2.setLastname("Uchiha");
        owner2.setAddress("Grange Road");
        owner2.setCity("London");
        owner2.setTelephone("599898655");

        // Create pet for owner2
        var neku = new Pet();
        neku.setName("Nekumumushi");
        neku.setOwner(owner2);
        neku.setBirthDate(LocalDate.now());
        neku.setPetType(cat);
        owner2.addPet(neku);
        ownerService.save(owner2);

        logger.info("Owners created...");

        // Create specialities
        var radiology = Speciality.builder().description("Radiology").build();

        var dentistry = Speciality.builder().description("Dentistry").build();

        var surgery = Speciality.builder().description("Surgery").build();


        // Create Vet instances:
        var vet1 = new Vet();
        vet1.setFirstname("Madara");
        vet1.setLastname("Uchiha");
        vet1.getSpecialities().add(surgery);
        vetService.save(vet1);

        var vet2 = new Vet();
        vet2.setFirstname("Jirayia");
        vet2.setLastname("Sensei");
        vet2.getSpecialities().add(radiology);
        vetService.save(vet2);
        logger.info("Vets created...");

        // Create Visits:
        var visit1 = new Visit();
        visit1.setDescription("regularVisit");
        visit1.setVisitDate(LocalDate.now());
        visit1.setPet(neku);
        visitService.save(visit1);
    }
}
