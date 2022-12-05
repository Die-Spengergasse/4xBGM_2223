package at.spengergasse.spengermed.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// https://www.hl7.org/fhir/backboneelement.html
public abstract class BackboneElement {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

}
