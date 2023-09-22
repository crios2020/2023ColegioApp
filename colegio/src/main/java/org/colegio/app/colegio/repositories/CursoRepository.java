package org.colegio.app.colegio.repositories;

import org.colegio.app.colegio.entities.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer>{
    
}
