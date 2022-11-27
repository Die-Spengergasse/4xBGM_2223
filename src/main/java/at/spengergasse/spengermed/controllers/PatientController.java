package at.spengergasse.spengermed.controllers;

import at.spengergasse.spengermed.entities.Patient;
import at.spengergasse.spengermed.entities.PatientContactRelationship;
import at.spengergasse.spengermed.repositories.PatientContactRelationshipRepo;
import at.spengergasse.spengermed.repositories.PatientRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/patient")
public class PatientController {

    static final Gson gson = new Gson();

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PatientContactRelationshipRepo relationshipRepo;

    PersonControllerBehaviour<Patient, Long> personControllerBehaviour = new PersonControllerBehaviour<>();

    // todo implement all endpoints

    @PutMapping("/add")
    Patient addPatient(){

        return personControllerBehaviour.addEntity(Patient.generateExample(), patientRepository);
    }

    @GetMapping("/")
    Iterable<Patient> findAllPatients(){
        return personControllerBehaviour.findAllEntitites(patientRepository);
    }

    @GetMapping("/relationships")
    String findAllRelationshipCodes(){

        var all = StreamSupport.stream(relationshipRepo.findAll().spliterator(), false).toList();

        // hide null values
        return gson.toJson(all);
    }

}

