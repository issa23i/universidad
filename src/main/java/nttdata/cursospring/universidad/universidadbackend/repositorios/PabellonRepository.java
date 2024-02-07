package nttdata.cursospring.universidad.universidadbackend.repositorios;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Pabellon;
import org.springframework.data.repository.CrudRepository;

public interface PabellonRepository extends CrudRepository<Pabellon, Integer> {
    Iterable<Pabellon> findPabellonByDireccionLocalidad(String nombreLocalidad);
    Iterable<Pabellon> findPabellonByNombre(String nombrePabellon);
}
