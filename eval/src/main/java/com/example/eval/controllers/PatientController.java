package com.example.eval.controllers;


import com.example.eval.models.Patient;
import com.example.eval.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Patients")
public class PatientController {

    private PatientService patientService;

    // GET
    @GetMapping
    public List<Patient> findAll() {
        return patientService.findAll();
    }
    // GET by id
    @GetMapping("{id}")
    public Patient findById(@PathVariable Long id) {
        return patientService.findById(id);
    }


    //POST  AND UPDATE
    @PostMapping
    public Patient save(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    // DELETE
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
         patientService.delete(id);
    }





    }







