package com.example.eval.services;

import com.example.eval.Repositories.PatientRepository;
import com.example.eval.models.Patient;

import java.util.List;

public class PatientServiceImpl implements PatientService{

    private PatientRepository patientRepository;


    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() {
        return null;
    }

    @Override
    public Patient findById(Long id) {
        return null;
    }

    @Override
    public Patient save(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public void delete(int id) {

    }
}
