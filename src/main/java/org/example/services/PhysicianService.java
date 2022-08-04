package org.example.services;

import org.example.jpa.entities.Physician;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface PhysicianService {
    ResponseEntity create(Physician payload);

    List<Physician> read();

    ResponseEntity delete(Integer id);

    List<Physician> details(List<Integer> id);

    ResponseEntity update(Map<String, String> payload);
}
