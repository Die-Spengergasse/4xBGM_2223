package at.spengergasse.spengermed.controllers;

import at.spengergasse.spengermed.entities.Patient;
import at.spengergasse.spengermed.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    PersonControllerBehaviour<Patient, Long> personControllerBehaviour = new PersonControllerBehaviour<>();

    @GetMapping("/add")
    Patient addPatient(){

        return personControllerBehaviour.addEntity(Patient.generateExample(), patientRepository);
    }

    @GetMapping("/")
    Iterable<Patient> findAllPatients(){
        return personControllerBehaviour.findAllEntitites(patientRepository);
    }
}

