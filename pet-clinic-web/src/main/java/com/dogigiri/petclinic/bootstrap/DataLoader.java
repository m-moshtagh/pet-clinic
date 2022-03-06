package com.dogigiri.petclinic.bootstrap;

import com.dogigiri.petclinic.model.entity.Owner;
import com.dogigiri.petclinic.model.entity.Vet;
import com.dogigiri.petclinic.model.service.OwnerService;
import com.dogigiri.petclinic.model.service.VetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {
        // Create Owner instances:
        Owner owner1 = new Owner(1000L, "Kakashi", "Hatake");
        Owner owner2 = new Owner(1001L, "Itachi", "Sasuke");
        ownerService.save(owner1);
        ownerService.save(owner2);
        logger.info("Owners created...");

        // Create Vet instances:
        Vet vet1 = new Vet(2000L, "Madara", "Uchiha");
        Vet vet2 = new Vet(2001L, "Suske", "Aizen");
        vetService.save(vet1);
        vetService.save(vet2);
        logger.info("Vets created...");
    }
}
