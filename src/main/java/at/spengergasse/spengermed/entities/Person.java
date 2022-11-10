package at.spengergasse.spengermed.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Person")
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_nr", nullable = false)
    private Long pNr;

    @Column(name = "firstName")
    String firstName;
    String lastName;

    // auto-generateable with Alt+Einfg
    public Person(Long pNr, String firstName, String lastName) {
        this.pNr = pNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
