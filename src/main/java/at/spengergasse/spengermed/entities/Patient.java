package at.spengergasse.spengermed.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Patient")
public class Patient extends Person{
    LocalDateTime admissionDate;

    // auto-generateable with Alt+Einfg
    public Patient(Long pNr, String firstName, String lastName, LocalDateTime admissionDate) {
        super(pNr, firstName, lastName);
        this.admissionDate = admissionDate;
    }

    public static Patient generateExample(){
        return new Patient(0L, "Peter", "Lustig", LocalDateTime.now());
    }

    @OneToOne
    ContactBackboneElement contact;
}
