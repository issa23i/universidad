package nttdata.cursospring.universidad.universidadbackend.repositorios;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CarreraRepository extends CrudRepository<Carrera, Integer> {
    //@Query("select c from Carrera c where c.nombre like %?1")
    Iterable<Carrera> findCarrerasByNombreContains(String nombreCarrera);
    //@Query("select c from Carrera c where c.nombre like upper(%?1)")
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombreCarrera);
    //@Query("select c from Carrera c where c.cantidadAnyos > ?1")
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnyos);
    @Query("select c from Carrera c join c.profesores p where p.nombre=?1 and p.apellido=?2")
    Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
}
