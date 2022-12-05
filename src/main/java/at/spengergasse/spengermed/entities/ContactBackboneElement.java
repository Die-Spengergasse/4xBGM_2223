package at.spengergasse.spengermed.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ContactBackboneElement extends BackboneElement {

    @OneToMany
    List<PatientContactRelationship> relationship;


    // HumanName name;

}
