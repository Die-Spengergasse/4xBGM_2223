package at.spengergasse.spengermed.controllers;

import lombok.NoArgsConstructor;
import org.springframework.data.repository.CrudRepository;

@NoArgsConstructor
public class PersonControllerBehaviour<T> {

    Iterable<T> findAllEntitites (CrudRepository<T, Long> repository){
        return repository.findAll();
    }

    T addEntity(T entity, CrudRepository<T, Long> repository){
        return repository.save(entity);
    }
}
