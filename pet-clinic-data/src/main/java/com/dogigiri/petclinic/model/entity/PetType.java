package com.dogigiri.petclinic.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    @Column(name = "type")
    private String type;

    @Builder
    public PetType(Long id, String type) {
        super(id);
        this.type = type;
    }
}
