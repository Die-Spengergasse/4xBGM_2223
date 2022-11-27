package at.spengergasse.spengermed.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

// https://build.fhir.org/datatypes.html#CodeableConcept
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name = "Codeable_Concept")
public abstract class CodeableConcept {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "CODEABLE_CONCEPT_CODING",
            joinColumns = {@JoinColumn(name = "cc_id", referencedColumnName = "id")}
    )
    List<Coding> coding;
    String text;
}
