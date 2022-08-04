package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.jpa.entities.Physician;
import org.example.jpa.entities.Specialty;
import org.example.jpa.repositories.PhysicianRepository;
import org.example.jpa.repositories.SpecialityRepository;
import org.example.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    private SpecialityRepository specialityRepository;

    @Autowired
    private PhysicianRepository physicianRepository;

    @Override
    public ResponseEntity createOrUpdate(Map<String, String> payload) {
        Specialty specialty = new Specialty();
        specialty.setCode(payload.get("code"));
        specialty.setName(payload.get("name"));
        if (payload.get("id") != null)
            specialty.setId(Integer.parseInt(payload.get("id")));
        specialityRepository.save(specialty);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public List<Specialty> read() {
        return specialityRepository.findAll();
    }

    @Override
    public ResponseEntity delete(Integer id) {
        specialityRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public List<Specialty> details(List<Integer> id) {
        specialityRepository.findAllById(id);
        return specialityRepository.findAllById(id);
    }

}