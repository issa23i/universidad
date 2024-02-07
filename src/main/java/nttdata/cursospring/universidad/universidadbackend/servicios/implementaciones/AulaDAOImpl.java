package nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Aula;
import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import nttdata.cursospring.universidad.universidadbackend.repositorios.AulaRepository;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.AulaDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO {
    @Autowired
    public AulaDAOImpl(AulaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Aula> findAulasByPizarron(Pizarron pizarron) {
        return repository.findAulasByPizarron(pizarron);
    }

    @Override
    public Iterable<Aula> findAulasByPabellonNombre(String nombrePabellon) {
        return repository.findAulasByPabellonNombre(nombrePabellon);
    }

    @Override
    public Aula findAulaByNroAula(Integer numeroAula) {
        return repository.findAulaByNroAula(numeroAula);
    }
}
