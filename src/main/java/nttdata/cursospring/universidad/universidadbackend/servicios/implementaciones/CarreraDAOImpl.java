package nttdata.cursospring.universidad.universidadbackend.servicios.implementaciones;

import nttdata.cursospring.universidad.universidadbackend.modelo.entidades.Carrera;
import nttdata.cursospring.universidad.universidadbackend.repositorios.CarreraRepository;
import nttdata.cursospring.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera, CarreraRepository> implements CarreraDAO {

    @Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }
}
