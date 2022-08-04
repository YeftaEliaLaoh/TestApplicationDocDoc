package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.jpa.entities.MedicalInstitution;
import org.example.jpa.repositories.MedicalInstitutionRepository;
import org.example.jpa.repositories.PhysicianRepository;
import org.example.services.MedicalInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MedicalInstitutionServiceImpl implements MedicalInstitutionService {

    @Autowired
    private MedicalInstitutionRepository medicalInstitutionRepository;

    @Autowired
    private PhysicianRepository physicianRepository;

    @Override
    public ResponseEntity createOrUpdate(Map<String, String> payload) {
        MedicalInstitution medicalInstitution = new MedicalInstitution();
        medicalInstitution.setAddress(payload.get("address"));
        medicalInstitution.setCode(payload.get("code"));
        medicalInstitution.setName(payload.get("name"));
        if (payload.get("id") != null)
            medicalInstitution.setId(Integer.parseInt(payload.get("id")));
        medicalInstitutionRepository.save(medicalInstitution);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public List<MedicalInstitution> read() {
        return medicalInstitutionRepository.findAll();
    }

    @Override
    public ResponseEntity delete(Integer id) {
        medicalInstitutionRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public List<MedicalInstitution> details(List<Integer> id) {
        medicalInstitutionRepository.findAllById(id);
        return medicalInstitutionRepository.findAllById(id);
    }

}