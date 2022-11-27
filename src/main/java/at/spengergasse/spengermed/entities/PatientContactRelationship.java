package at.spengergasse.spengermed.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

// https://build.fhir.org/valueset-patient-contactrelationship.html
@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "PATIENT_CONTACT_RELATIONSHIP")
public final class PatientContactRelationship extends CodeableConcept {

}
