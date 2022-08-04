package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.jpa.entities.Physician;
import org.example.jpa.repositories.PhysicianRepository;
import org.example.services.PhysicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PhysicianServiceImpl implements PhysicianService {

    @Autowired
    private PhysicianRepository physicianRepository;

    @Override
    public ResponseEntity create(Physician payload) {
        Physician physician = new Physician();
        physician.setFirstName(payload.getFirstName());
        physician.setLastName(payload.getLastName());
        physician.setSince(payload.getSince());
        physician.getMedicalInstitutions().addAll(payload.getMedicalInstitutions());
        physician.getSpecialties().addAll(payload.getSpecialties());
        physicianRepository.save(physician);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public List<Physician> read() {
        return physicianRepository.findAll();
    }

    @Override
    public ResponseEntity delete(Integer id) {
        physicianRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public List<Physician> details(List<Integer> id) {
        physicianRepository.findAllById(id);
        return physicianRepository.findAllById(id);
    }

    @Override
    public ResponseEntity update(Map<String, String> payload) {
        Physician physician = new Physician();
        physician.setId(Integer.parseInt(payload.get("id")));
        physician.setFirstName(payload.get("firstName"));
        physician.setLastName(payload.get("lastName"));
        physician.setSince(payload.get("since"));
        physicianRepository.save(physician);
        return new ResponseEntity(HttpStatus.OK);
    }

}