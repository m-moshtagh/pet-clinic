package com.dogigiri.petclinic.model.entity;

import java.time.LocalDate;

public class Visit extends BaseEntity {
    private LocalDate visitDate;
    private String description;
    private Pet pet;

    public Visit() {

    }

    public Visit(Long id, LocalDate visitDate, String description, Pet pet) {
        super(id);
        this.visitDate = visitDate;
        this.description = description;
        this.pet = pet;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
