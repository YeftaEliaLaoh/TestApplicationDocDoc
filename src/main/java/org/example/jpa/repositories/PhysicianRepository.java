package org.example.jpa.repositories;

import org.example.jpa.entities.Physician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

}
