package org.example.jpa.repositories;

import org.example.jpa.entities.MedicalInstitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalInstitutionRepository extends JpaRepository<MedicalInstitution, Integer> {

}
