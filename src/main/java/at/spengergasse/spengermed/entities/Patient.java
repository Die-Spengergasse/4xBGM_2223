package at.spengergasse.spengermed.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Patient extends Person{
    LocalDateTime admissionDate;

    public static Patient generateExample(){
        var patient = new Patient().builder()
                .pNr(7L)
                .firstName("A")
                .lastName("B")
                .admissionDate(LocalDateTime.now())
                .build();

        return patient;
    }
}
