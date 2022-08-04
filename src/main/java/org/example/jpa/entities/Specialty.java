package org.example.jpa.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spe_seq")
    @SequenceGenerator(name = "spe_seq", sequenceName = "SPE_SEQ", allocationSize = 1)
    private Integer id;
    private String code;
    private String name;
}