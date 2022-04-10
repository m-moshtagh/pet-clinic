package com.dogigiri.petclinic.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {
    @Column(name = "visit_date")
    private LocalDate visitDate;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @Builder
    public Visit(Long id, LocalDate visitDate, String description, Pet pet) {
        super(id);
        this.visitDate = visitDate;
        this.description = description;
        this.pet = pet;
    }
}
