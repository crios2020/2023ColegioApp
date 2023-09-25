package org.colegio.app.colegio.repositories;

import org.colegio.app.colegio.entities.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibroRepository extends MongoRepository<Libro, Integer>{
    
}
