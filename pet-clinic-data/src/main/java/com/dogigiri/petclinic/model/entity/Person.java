package com.dogigiri.petclinic.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {
    public Person(long id, String firstname, String lastname) {
        super(id);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Column(name = "first_name")
    protected String firstname;
    @Column(name = "last_name")
    protected String lastname;
}
