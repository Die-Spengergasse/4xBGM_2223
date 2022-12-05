package at.spengergasse.spengermed.controllers;

import at.spengergasse.spengermed.entities.Coding;
import at.spengergasse.spengermed.entities.Patient;
import at.spengergasse.spengermed.entities.PatientContactRelationship;
import at.spengergasse.spengermed.entities.Person;
import at.spengergasse.spengermed.repositories.CodingRepository;
import at.spengergasse.spengermed.repositories.PatientContactRelationshipRepo;
import at.spengergasse.spengermed.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/patient")
@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    CodingRepository codingRepository;

    @Autowired
    PatientContactRelationshipRepo relationshipRepo;



    @GetMapping("/")
    Iterable<Patient> findAllPatients(){
        return patientRepository.findAll();
    }

    @GetMapping("/codings")
    Iterable<Coding> findAllCodings(){
        return codingRepository.findAll();
    }

    @GetMapping("/relationships")
    Iterable<PatientContactRelationship> findAllPCRelationships(){
        return relationshipRepo.findAll();
    }

}

