package at.spengergasse.spengermed.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@NoArgsConstructor
public abstract class PersonController<T> {


    Iterable<T> findAllEntitites (CrudRepository<T, Long> repository){
        return repository.findAll();
    }
}
