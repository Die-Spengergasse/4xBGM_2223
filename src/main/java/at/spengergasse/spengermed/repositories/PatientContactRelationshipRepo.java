package at.spengergasse.spengermed.repositories;

import at.spengergasse.spengermed.entities.PatientContactRelationship;
import org.springframework.data.repository.CrudRepository;

public interface PatientContactRelationshipRepo extends CrudRepository<PatientContactRelationship, Long> {
}
