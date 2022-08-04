package org.example.controllers;

import org.example.jpa.entities.Specialty;
import org.example.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/speciality")
public class SpecialityController {

    @Autowired
    SpecialityService specialityService;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Map<String, String> payload) {
        return specialityService.createOrUpdate(payload);
    }

    @GetMapping("/read")
    public List<Specialty> read() {
        return specialityService.read();
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Map<String, String> payload) {
        return specialityService.createOrUpdate(payload);
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestParam("id") Integer id) {
        return specialityService.delete(id);
    }

    @GetMapping("/details")
    public List<Specialty> details(@RequestParam("id") List<Integer> id) {
        return specialityService.details(id);
    }
}
