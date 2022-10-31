package at.spengergasse.spengermed.controllers;

import lombok.NoArgsConstructor;
import org.springframework.data.repository.CrudRepository;

// beispiel für Controller mit generics
// verhalten ist definiert, Typ kann geändert werden
@NoArgsConstructor
public class PersonControllerBehaviour<T, ID> {

    // todo implement generalizable behaviour here

    Iterable<T> findAllEntitites (CrudRepository<T, ID> repository){
        return repository.findAll();
    }

    T addEntity(T entity, CrudRepository<T, ID> repository){
        return repository.save(entity);
    }
}
