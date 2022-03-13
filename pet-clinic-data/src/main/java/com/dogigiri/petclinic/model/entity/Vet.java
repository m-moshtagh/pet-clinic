package com.dogigiri.petclinic.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {
    private Set<Speciality> specialities = new HashSet<>();

    public Vet() {

    }

    public Vet(Long id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
