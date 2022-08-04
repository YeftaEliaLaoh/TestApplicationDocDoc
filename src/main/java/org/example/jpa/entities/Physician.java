package org.example.jpa.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Physician {

    @Id
    @Column(name = "physician_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phy_seq")
    @SequenceGenerator(name = "phy_seq", sequenceName = "PHY_SEQ", allocationSize = 1)
    private Integer id;
    private String firstName;
    private String lastName;
    private String since;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MedicalInstitution> medicalInstitutions = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Specialty> specialties = new ArrayList<>();
}