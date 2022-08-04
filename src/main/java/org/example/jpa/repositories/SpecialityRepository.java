package org.example.jpa.repositories;

import org.example.jpa.entities.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends JpaRepository<Specialty, Integer> {

}
