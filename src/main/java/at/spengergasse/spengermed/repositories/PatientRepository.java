package at.spengergasse.spengermed.repositories;

import at.spengergasse.spengermed.entities.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

public interface PatientRepository extends CrudRepository<Patient, Long> {

    // beispiel mit nativen @Query native=false führt dazu das JPQL verwendet wird. Beides ist möglich
    @Query(
            value = "SELECT * FROM Patient u ",
            nativeQuery = true)
    Collection<Patient> findAllNative();


}
