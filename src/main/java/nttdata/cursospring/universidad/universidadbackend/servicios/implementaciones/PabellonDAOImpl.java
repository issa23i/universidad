package nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Pabellon;
import nttdata.cursospring.universidad.universidadbackend.repositorios.PabellonRepository;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.PabellonDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO {
    @Autowired
    public PabellonDAOImpl(PabellonRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Pabellon> findPabellonByDireccionLocalidad(String nombreLocalidad) {
        return repository.findPabellonByDireccionLocalidad(nombreLocalidad);
    }

    @Override
    public Iterable<Pabellon> findPabellonByNombre(String nombrePabellon) {
        return repository.findPabellonByNombre(nombrePabellon);
    }
}
