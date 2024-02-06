package nttdata.cursospring.universidad.universidadbackend.repositorios;


import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Persona;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioAlumnos")
public interface AlumnoRepository extends PersonaRepository {

    //esta query no funcionará con carga perezosa (LAZY), hay que hacer un join fetch
    //@Query("select a from Alumno a where a.carrera.nombre= ?1")
    @Query("select a from Alumno a join fetch a.carrera c where c.nombre =?1")
    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera);
}
