package com.dogigiri.petclinic.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    @Column(name = "type")
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
