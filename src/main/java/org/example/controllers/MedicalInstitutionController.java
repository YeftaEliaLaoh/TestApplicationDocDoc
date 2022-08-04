package org.example.controllers;

import org.example.jpa.entities.MedicalInstitution;
import org.example.services.MedicalInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/medicalInstitution")
public class MedicalInstitutionController {

    @Autowired
    MedicalInstitutionService medicalInstitutionService;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Map<String, String> payload) {
        return medicalInstitutionService.createOrUpdate(payload);
    }

    @GetMapping("/read")
    public List<MedicalInstitution> read() {
        return medicalInstitutionService.read();
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Map<String, String> payload) {
        return medicalInstitutionService.createOrUpdate(payload);
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestParam("id") Integer id) {
        return medicalInstitutionService.delete(id);
    }

    @GetMapping("/details")
    public List<MedicalInstitution> details(@RequestParam("id") List<Integer> id) {
        return medicalInstitutionService.details(id);
    }
}
