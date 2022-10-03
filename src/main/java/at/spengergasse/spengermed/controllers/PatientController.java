package at.spengergasse.spengermed.controllers;

import at.spengergasse.spengermed.entities.Patient;
import at.spengergasse.spengermed.entities.Person;
import at.spengergasse.spengermed.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/person")
public class PatientController extends PersonController<Patient> {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PersonController<Patient> personController;

    public PatientController(CrudRepository<Person, Long> repository) {
        super();
    }

    @GetMapping
    Iterable<Patient> findAllPatients(){
        return personController.findAllEntitites(patientRepository);
    }
}

