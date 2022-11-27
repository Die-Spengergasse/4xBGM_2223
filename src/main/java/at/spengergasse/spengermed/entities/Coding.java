package at.spengergasse.spengermed.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.net.URI;

// https://build.fhir.org/datatypes.html#Coding
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CODING")
public class Coding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    // todo swtich to URI type and handle deserialuzation
    @Column(nullable = true)
    String system = ""; // Identity of the terminology system

    @Column(nullable = true)
    String version = ""; // Version of the system - if relevant

    @Column(nullable = true)
    String code = ""; // Symbol in syntax defined by the system

    @Column(nullable = true)
    String display = ""; // Representation defined by the system

    @Column(nullable = true)
    Boolean userSelected = false; // If this coding was chosen directly by the user
}
