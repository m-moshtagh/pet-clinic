package com.dogigiri.petclinic.model.entity;

public class PetType extends BaseEntity {
    private String type;

    public PetType() {

    }

    public PetType(Long id, String type) {
        super(id);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public PetType setType(String type) {
        this.type = type;
        return this;
    }
}
