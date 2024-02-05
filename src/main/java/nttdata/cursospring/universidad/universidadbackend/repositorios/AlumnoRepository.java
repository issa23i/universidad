package nttdata.cursospring.universidad.universidadbackend.repositorios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioAlumnos")
public interface AlumnoRepository extends CrudRepository<PersonaRepository, Integer> {
}
