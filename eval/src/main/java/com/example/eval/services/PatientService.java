package com.example.eval.services;

import com.example.eval.models.Patient;

import java.util.List;

public interface PatientService {


        List<Patient> findAll();

        Patient findById(Long id);

        Patient save(Patient patient);

        void delete(int id);



}
