package at.spengergasse.spengermed.repositories;

import at.spengergasse.spengermed.entities.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
