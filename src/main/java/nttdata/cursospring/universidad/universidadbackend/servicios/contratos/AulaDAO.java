package nttdata.cursospring.universidad.universidadbackend.servicios.contratos;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Aula;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;

public interface AulaDAO extends GenericoDAO<Aula> {
    Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulasByPabellonNombre(String nombrePabellon);
    Aula findAulaByNroAula(Integer numeroAula);
}
