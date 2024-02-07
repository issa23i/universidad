package nttdata.cursospring.universidad.universidadbackend.repositorios;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Aula;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import org.springframework.data.repository.CrudRepository;

public interface AulaRepository extends CrudRepository<Aula,Integer> {
    Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulasByPabellonNombre(String nombrePabellon);
    Aula findAulaByNroAula(Integer numeroAula);
}
