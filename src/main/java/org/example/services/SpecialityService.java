package org.example.services;

import org.example.jpa.entities.Specialty;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface SpecialityService {
    ResponseEntity createOrUpdate(Map<String, String> payload);

    List<Specialty> read();

    ResponseEntity delete(Integer id);

    List<Specialty> details(List<Integer> id);
}
