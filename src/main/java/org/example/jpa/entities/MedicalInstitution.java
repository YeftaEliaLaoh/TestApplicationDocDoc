package org.example.jpa.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class MedicalInstitution {

    @Id
    @Column(insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "med_seq")
    @SequenceGenerator(name = "med_seq", sequenceName = "MED_SEQ", allocationSize = 1)
    private Integer id;
    private String name;
    private String code;
    private String address;

}