package at.spengergasse.spengermed.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
// https://www.hl7.org/fhir/patient-definitions.html#Patient.contact
public class ContactBackboneElement extends BackboneElement{

    @OneToMany
    List<PatientContactRelationship> relationship;

    // FALSCH!! HumanName wäre richtig
    String name;

    // todo weitere elemente laut spezifikation
}
