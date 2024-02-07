package nttdata.cursospring.universidad.universidadbackend.repositorios;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("profesorRepository")
public interface ProfesorRepository {

    @Query("select p from Profesor p join fetch p.carrera c where c.nombre = ?1")
    Iterable<Persona> findProfesoresByCarrera(String carrera);
}
