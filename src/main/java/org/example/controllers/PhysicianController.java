package org.example.controllers;

import org.example.jpa.entities.Physician;
import org.example.services.PhysicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/physician")
public class PhysicianController {

    @Autowired
    PhysicianService physicianService;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Physician payload) {
        return physicianService.create(payload);
    }

    @GetMapping("/read")
    public List<Physician> read() {
        return physicianService.read();
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Map<String, String> payload) {
        return physicianService.update(payload);
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestParam("id") Integer id) {
        return physicianService.delete(id);
    }

    @GetMapping("/details")
    public List<Physician> details(@RequestParam("id") List<Integer> id) {
        return physicianService.details(id);
    }
}
