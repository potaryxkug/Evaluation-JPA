package com.example.eval;

import com.example.eval.Repositories.PatientRepository;
import com.example.eval.services.PatientService;
import com.example.eval.services.PatientServiceImpl;
import org.springframework.context.annotation.Bean;

public class AppConfig {


    @Bean
    public PatientService patientService(PatientRepository patientRepository){
        return new PatientServiceImpl(patientRepository);
    }



}
