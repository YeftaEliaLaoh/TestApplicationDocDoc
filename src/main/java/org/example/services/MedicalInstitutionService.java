package org.example.services;

import org.example.jpa.entities.MedicalInstitution;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface MedicalInstitutionService {
    ResponseEntity createOrUpdate(Map<String, String> payload);

    List<MedicalInstitution> read();

    ResponseEntity delete(Integer id);

    List<MedicalInstitution> details(List<Integer> id);
}
